grammar sophia;


    type : INT | STRING | BOOL ;

    classDeclaration : CLASS IDENTIFIER (EXTENDS IDENTIFIER)?  classBody ;

    classBody : LBRACE classBodyDeclaration RBRACE ;

    classBodyDeclaration : SEMI | block | memberDeclaration ;

    memberDeclaration : methodDeclaration | constructorDeclaration | fieldDeclaration ;

    methodDeclaration : DEF methodType IDENTIFIER LPAREN methodArguements RPAREN methodBody ;

    methodArguements : variableDeclarator (COMMA variableDeclarator)* ;

    methodType : type | VOID ;

    //methodBody : fieldDeclaration

    constructorDeclaration : DEF IDENTIFIER LPAREN methodArguements RPAREN ;

    fieldDeclaration : variableDeclarator | variableInitializer ;

    variableDeclarator : IDENTIFIER COLON (listDeclaration | type) SEMI;

    funcPointerDeclaration : IDENTIFIER COLON funcPointerDeclarationBody SEMI;

    funcPointerDeclarationBody : FUNC '<' (VOID | (type (COMMA type)*)) ARROW type '>';

    listDeclaration : LIST LPAREN (( POS_INT '#' (type | listDeclaration)) | (listBody (COMMA listBody)* )) RPAREN SEMI;

    listBody : variableDeclarator | funcPointerDeclaration | listDeclaration | type ;

    block : LBRACE blockStatement* RBRACE ;

    if_stat : IF condition_block (ELSE IF condition_block)* (ELSE block)? ;

// -----------------------------------------------------------

    condition_block : expr block ;

    expr : LPAREN value compare_operator value RPAREN;

    value : INT_LITERAL | IDENTIFIER | IDENTIFIER LBRACK (value|sentence) RBRACK | sentence | IDENTIFIER DOT IDENTIFIER;

    sentence : value ( calc_operator value )+;

    compare_operator : GT | LT | EQUAL | NOTEQUAL | GE | LE | AND | OR;

    calc_operator : ADD | SUB | MUL | DIV | BITAND | BITOR | CARET | MOD ;

// -------------------------------------------------------------------------------

    for_stat : FOR LPAREN initial_stat SEMI condition_stat SEMI update_stat RPAREN block;

    initial_stat : IDENTIFIER ASSIGN value | '';

    condition_stat : value compare_operator value | IDENTIFIER | '';

    update_stat : IDENTIFIER  one_var_operation | IDENTIFIER ASSIGN value;

    one_var_operation : INC | DEC;

    foreach_stat : FOREACH LPAREN IDENTIFIER IN (IDENTIFIER | IDENTIFIER DOT IDENTIFIER) RPAREN block;

    print_stat : PRINT LPAREN print_body RPAREN SEMI;

    print_body : value | STRING_LITERAL | BOOL_LITERAL ;

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




    comment
        :
         COMMENT
        ;

    COMMENT
        : '//' .*? '\n' -> skip
        ;


     WS
        : [ \t\r\n]+ -> skip
        ;
