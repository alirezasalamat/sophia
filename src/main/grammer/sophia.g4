grammar sophia;




    type : INT | STRING | BOOL;


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

    variableDeclarator : IDENTIFIER COLON (listDeclaration | type) ;

    funcPointerDeclaration : IDENTIFIER COLON funcPointerDeclarationBody;

    funcPointerDeclarationBody : FUNC '<' (VOID | (type (COMMA type)*)) ARROW type '>';

    listDeclaration : LIST LPAREN (([1-9][0-9]* '#' (type | listDeclaration)) | listBody (COMMA listBody)*) RPAREN ;

    listBody : variableDeclarator | funcPointerDeclaration | listDeclaration | type ;

    block : LBRACE blockStatement* RBRACE ;

    if_stat : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)? ;

    condition_block : expr stat_block ;







    IDENTIFIER
        : ('_' | [A-Z] | [a-z])+ ('_' | [a-z] | [A-Z] | [0-9])*
        ;


    INT_LITERAL : '0' | [1-9][0-9]* ;
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
    DOT:                '.'
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