grammar sophia;

    sophia :{System.out.println("hello");} classDeclaration*  EOF ;
    type : INT | STRING | BOOL ;

    classDeclaration : CLASS id = IDENTIFIER (EXTENDS IDENTIFIER)? {System.out.println("kir"+ $id.text);} classBody ;

    classBody : LBRACE classBodyDeclaration RBRACE ;

    classBodyDeclaration : SEMI | block* | memberDeclaration*  ;

    memberDeclaration : methodDeclaration | constructorDeclaration | fieldDeclaration ;

    methodDeclaration : DEF methodType IDENTIFIER LPAREN methodArguements? RPAREN methodBody ;

    methodArguements : variableDeclaration (COMMA variableDeclaration)* ;

    methodType : type | VOID ;

    methodBody : LBRACE ((variableDeclaration SEMI)* blockStatements)? RBRACE;

    methodCall : (IDENTIFIER | THIS | methodCallBody) DOT methodCallBody ;

    methodCallBody : IDENTIFIER LPAREN expr? (COMMA expr)* RPAREN ;

    constructorDeclaration : DEF IDENTIFIER LPAREN methodArguements? RPAREN methodBody ;

    fieldDeclaration : variableDeclaration SEMI | variableInitializer SEMI;

    variableDeclaration : IDENTIFIER COLON (listDeclaration | type | IDENTIFIER);

    variableInitializer : assignment ;

    funcPointerDeclaration : IDENTIFIER COLON funcPointerDeclarationBody SEMI;

    funcPointerDeclarationBody : FUNC '<' (VOID | (type (COMMA type)*)) ARROW type '>';

    listDeclaration : LIST LPAREN (( POS_INT '#' (type | listDeclaration)) | (listBody (COMMA listBody)* )) RPAREN;

    listBody : variableDeclaration | funcPointerDeclaration | listDeclaration | type ;

    block : LBRACE blockStatements? RBRACE ;

    blockStatements : blockStatement+ ;

    blockStatement : statement ;

    statement : ifStatement | forStatement | foreachStatement | statementWithoutTrailingSubstatement ;

    ifStatement : IF condition_block (ELSE IF condition_block)* (ELSE statBlock)?;

    condition_block : expr statBlock ;

    statBlock : statement | LBRACE block RBRACE ;

    statementWithoutTrailingSubstatement : block | emptyStatement | expStatement
                                            | breakStatement | continueStatement | returnStatement | printStatement;

    expStatement : statementExp SEMI ;

    statementExp : assignment | preExp | postExp | methodCall ;

    forStatement : FOR LPAREN initialStatement? SEMI expr? SEMI updateStatement? RPAREN statBlock;

    initialStatement : assignment (COMMA assignment)* ;

    updateStatement :  assignment (COMMA assignment)* ;

    foreachStatement : FOREACH LPAREN IDENTIFIER IN (IDENTIFIER(DOT IDENTIFIER)? | THIS DOT IDENTIFIER | expr) RPAREN statBlock ;


    breakStatement : BREAK SEMI ;

    continueStatement : CONTINUE SEMI ;

    returnStatement : RETURN expr? SEMI ;

    assignment : leftHand (ASSIGN (expr | listInitializer | classAssignment)+)+ ;

    leftHand : ((THIS | expr) (DOT expr)* | expr) ;

    index : (LBRACK expr RBRACK)* ;

    //afterDot : (methodCallBody | (IDENTIFIER | THIS)) index? ;

    //dot : DOT afterDot;

    classAssignment : NEW IDENTIFIER LPAREN expr? (COMMA expr)* RPAREN ;

    listInitializer : LBRACK ((listInitializer | expr) (COMMA (listInitializer | expr))*) RBRACK ;

    preExp : (DEC | INC) literal ;

    postExp : literal (DEC | INC) ;


    expr :
        | expr DOT expr
        | NOT expr
        | expr op=(MUL | DIV | MOD) expr
        | expr op=(ADD | SUB) expr
        | expr op=(LE | GE | LT | GT) expr
        | expr op=(EQUAL | NOTEQUAL | ASSIGN) expr
        | expr AND expr
        | expr OR expr
        | preExp
        | postExp
        | literal index?
       //| afterDot
        ;

    literal :
         LPAREN expr? RPAREN
         | methodCallBody
         | IDENTIFIER
         | intLiteral
         | BOOL_LITERAL
         | STRING_LITERAL
         ;

    printStatement : PRINT LPAREN printBody RPAREN SEMI;

    printBody : expr;

    emptyStatement : SEMI ;

    comment : COMMENT ;

/* -----------------------------------------------------------
    condition_block : expr stat_block ;
    expr : LPAREN value compare_operator value ((AND | OR) value compare_operator value) RPAREN;
    value : INT_LITERAL | STRING_LITERAL | IDENTIFIER | IDENTIFIER LBRACK (value|sentence) RBRACK | sentence | (THIS | IDENTIFIER) DOT IDENTIFIER;
    sentence : value ( calc_operator value )+;
    calc_operator : ADD | SUB | MUL | DIV | BITAND | BITOR | CARET | MOD ;
// -------------------------------------------------------------------------------

AmirAli Raygan, [03.11.20 22:13]
initial_stat : IDENTIFIER ASSIGN value | '';
    condition_stat : value compare_operator value | IDENTIFIER | '';
    update_stat : IDENTIFIER  one_var_operation | IDENTIFIER ASSIGN value;
    one_var_operation : INC | DEC;
    foreach_stat : FOREACH LPAREN IDENTIFIER IN (IDENTIFIER | IDENTIFIER DOT IDENTIFIER) RPAREN block;
*/
    CLASS : 'class' ;
    EXTENDS : 'extends' ;
    THIS : 'this' ;
    DEF : 'def' ;
    FUNC : 'func' ;
    RETURN : 'return' ;
    IF : 'if' ;
    ELSE : 'else' ;
    FOR : 'for' ;
    FOREACH : 'foreach' ;
    CONTINUE : 'continue' ;
    BREAK : 'break' ;
    FALSE : 'false' ;
    TRUE : 'true' ;
    INT : 'int' ;
    STRING : 'string' ;
    BOOL : 'bool' ;
    VOID : 'void' ;
    LIST : 'list' ;
    IN : 'in' ;
    NULL : 'null' ;
    NEW : 'new' ;
    PRINT : 'print' ;

    IDENTIFIER
        : ('_' | [A-Z] | [a-z])+ ('_' | [a-z] | [A-Z] | [0-9])*
        ;

    intLiteral : ZERO | POS_INT | SUB POS_INT ;
    POS_INT : [1-9][0-9]* ;
    ZERO : '0' ;
    STRING_LITERAL : '"' ~('"')+ '"';
    BOOL_LITERAL : FALSE | TRUE;

    // separators
    LPAREN:             '(';
    RPAREN:             ')';
    LBRACE:             '{';
    RBRACE:             '}';
    LBRACK:             '[';
    RBRACK:             ']';
    SEMI:               ';';
    COMMA:              ',';
    DOT:                '.';
    ARROW:              '->';


    // operators
    ASSIGN: '=';
    GT: '>';
    LT: '<';
    NOT: '!';
    TILDE: '~';
    QUESTION: '?';
    COLON: ':';
    EQUAL: '==';
    LE: '<=';
    GE: '>=';
    NOTEQUAL: '!=';
    AND: '&&';
    OR:  '||';
    INC: '++';
    DEC: '--';
    ADD: '+';
    SUB: '-';
    MUL: '*';
    DIV: '/';
    BITAND: '&';
    BITOR: '|';
    CARET: '^';
    MOD: '%';


    // keywords



    COMMENT
        : '//' .*? '\n' -> skip
        ;


     WS
        : [ \t\r\n]+ -> skip
        ;