grammar Sophia;

    blockStatements : blockStatement+ ;

    type : INT | STRING | BOOL ;

    classDeclaration : CLASS IDENTIFIER (EXTENDS IDENTIFIER)?  classBody ;

    classBody : LBRACE classBodyDeclaration RBRACE ;

    classBodyDeclaration : SEMI | block | memberDeclaration ;

    memberDeclaration : methodDeclaration | constructorDeclaration | fieldDeclaration ;

    methodDeclaration : DEF methodType IDENTIFIER LPAREN methodArguements RPAREN methodBody ;

    methodArguements : variableDeclaration (COMMA variableDeclaration   )* ;

    methodType : type | VOID ;

    methodBody : block;

    methodCall : IDENTIFIER DOT IDENTIFIER '(' expr? | expr (COMMA expr)* ')' | THIS DOT IDENTIFIER '(' expr? | expr (COMMA expr)*')' ;

    constructorDeclaration : DEF IDENTIFIER LPAREN methodArguements RPAREN ;

    fieldDeclaration : variableDeclaration | variableInitializer ;

    variableDeclaration : IDENTIFIER COLON (listDeclaration | type | IDENTIFIER) SEMI;

    variableInitializer : assignment ;

    funcPointerDeclaration : IDENTIFIER COLON funcPointerDeclarationBody SEMI;

    funcPointerDeclarationBody : FUNC '<' (VOID | (type (COMMA type)*)) ARROW type '>';

    listDeclaration : LIST LPAREN (( POS_INT '#' (type | listDeclaration)) | (listBody (COMMA listBody)* )) RPAREN SEMI;

    listBody : variableDeclaration | funcPointerDeclaration | listDeclaration | type ;

    block : LBRACE blockStatements? RBRACE ;


    blockStatement : VariableDeclaration | classDeclaration | statement ;

    statement : ifStatement | forStatement | foreachStatement | statementWithoutTrailingSubstatement ;

    ifStatement : IF condition_block (ELSE IF condition_block)* (ELSE statBlock)?;

    condition_block : expr statBlock ;

    statBlock : statement | LBRACE block RBRACE ;

    statementWithoutTrailingSubstatement : block | emptyStatement | expStatement
                                            | breakStatement | continueStatement | returnStatement ;

    statementExp : assignment | preExp | postExp | methodCall ;

    expStatement : statementExp SEMI ;

    forStatement : FOR LPAREN initialStatement? SEMI expr? SEMI updateStatement? RPAREN block;

    initialStatement : statementExp (COMMA statementExp)* ;

    updateStatement : statementExp (COMMA statementExp)* ;

    foreachStatement : FOREACH LPAREN IDENTIFIER IN (IDENTIFIER | THIS DOT IDENTIFIER) RPAREN block ;

    emptyStatement : SEMI ;

    breakStatement : BREAK SEMI ;

    continueStatement : CONTINUE SEMI ;

    returnStatement : RETURN expr? SEMI ;

    assignment : (THIS DOT IDENTIFIER | IDENTIFIER) ASSIGN (expr | listInitializer | methodCall | classAssignment) SEMI ;

    classAssignment : NEW IDENTIFIER LPAREN expr (COMMA expr)* RPAREN;

    listInitializer : LBRACK (expr (COMMA expr) | listInitializer (COMMA listInitializer)) RBRACK ;

    preExp : (DEC | INC) IDENTIFIER SEMI ;

    postExp : IDENTIFIER (DEC | INC) SEMI ;

    expr :
         NOT expr
        | expr op=(MUL | DIV | MOD) expr
        | expr op=(ADD | SUB) expr
        | expr op=(LE | GE | LT | GT) expr
        | expr op=(EQUAL | NOTEQUAL) expr
        | expr AND expr
        | expr OR expr
        | literal
        ;

    literal :
         LPAREN expr RPAREN
         | IDENTIFIER LBRACK (expr) RBRACK
         | (THIS | IDENTIFIER) DOT IDENTIFIER
         | INT_LITERAL
         | BOOL_LITERAL
         | IDENTIFIER
         | STRING_LITERAL
         ;

    print_stat : PRINT LPAREN print_body RPAREN SEMI;

    print_body : expr;

    comment : COMMENT ;

/* -----------------------------------------------------------
    condition_block : expr stat_block ;
    expr : LPAREN value compare_operator value ((AND | OR) value compare_operator value) RPAREN;
    value : INT_LITERAL | STRING_LITERAL | IDENTIFIER | IDENTIFIER LBRACK (value|sentence) RBRACK | sentence | (THIS | IDENTIFIER) DOT IDENTIFIER;
    sentence : value ( calc_operator value )+;
    calc_operator : ADD | SUB | MUL | DIV | BITAND | BITOR | CARET | MOD ;
// -------------------------------------------------------------------------------
    initial_stat : IDENTIFIER ASSIGN value | '';
    condition_stat : value compare_operator value | IDENTIFIER | '';
    update_stat : IDENTIFIER  one_var_operation | IDENTIFIER ASSIGN value;
    one_var_operation : INC | DEC;
    foreach_stat : FOREACH LPAREN IDENTIFIER IN (IDENTIFIER | IDENTIFIER DOT IDENTIFIER) RPAREN block;
*/

    IDENTIFIER
        : ('_' | [A-Z] | [a-z])+ ('_' | [a-z] | [A-Z] | [0-9])*
        ;

    POS_INT : [1-9][0-9]* ;
    INT_LITERAL : '0' | POS_INT ;
    STRING_LITERAL : '"' ~('"')+ '"';
    BOOL_LITERAL : 'false' | 'true';

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



    COMMENT
        : '//' .*? '\n' -> skip
        ;


     WS
        : [ \t\r\n]+ -> skip
        ;
