grammar sophia;

    sophia :classDeclaration*  EOF ;
    type : INT | STRING | BOOL | funcPointerDeclarationBody;

    classDeclaration : CLASS aa=IDENTIFIER (EXTENDS bb=IDENTIFIER)?
    {
           if ($bb.text == null){
               System.out.println("ClassDec:"+$aa.text);
           } else {
               System.out.println("ClassDec:"+$aa.text+", "+$bb.text);
           }
       }
    classBody;

    classBody : LBRACE classBodyDeclaration RBRACE ;

    classBodyDeclaration : SEMI | block* | memberDeclaration* ;

    memberDeclaration : statement | methodDeclaration | constructorDeclaration | fieldDeclaration ;

    methodDeclaration : DEF methodType aa=IDENTIFIER LPAREN
        {
                System.out.println("MethodDec:"+$aa.text);
        }
        methodArguements? RPAREN methodBody;

    methodArguements : listvariableDeclaration (COMMA listvariableDeclaration)* ;

    methodType : type | VOID ;

    methodBody : LBRACE ((variableDeclaration SEMI)* blockStatements?)? RBRACE;

    constructorDeclaration : DEF aa=IDENTIFIER LPAREN
            {
                    System.out.println("ConstructorDec:"+$aa.text);
            }
            methodArguements? RPAREN methodBody;

    fieldDeclaration : variableDeclaration SEMI | variableInitializer SEMI;

    variableDeclaration : aa=IDENTIFIER COLON
            {
                    System.out.println("VarDec:"+$aa.text);
            }
            (listDeclaration | type | IDENTIFIER);

    listvariableDeclaration : IDENTIFIER COLON (listDeclaration | type | IDENTIFIER);

    variableInitializer : assignment ;


    funcPointerDeclarationBody : FUNC '<' (VOID | (type (COMMA type)*)) ARROW type '>';

    listDeclaration : LIST LPAREN (( POS_INT '#' (type | listDeclaration)) | (listBody (COMMA listBody)* )) RPAREN;

    listBody : listvariableDeclaration | listDeclaration | type ;

    block : LBRACE blockStatements? RBRACE ;

    blockStatements : blockStatement+ ;

    blockStatement : statement ;

    statement : statementWithoutTrailingSubstatement | ifStatement | forStatement | foreachStatement ;

    ifStatement : IF condition_block
            {
                System.out.println("Conditional:if");
            }
            (ELSE IF bb=condition_block {
                System.out.println("Conditional:else");
                System.out.println("Conditional:if");
            })* (ELSE cc=statBlock
            {
                System.out.println("Conditional:else");
            })?
            ;

    condition_block : expr statBlock ;

    statBlock : statement | LBRACE block RBRACE ;

    statementWithoutTrailingSubstatement : block | emptyStatement | expStatement
                                            | breakStatement | continueStatement | returnStatement | printStatement;

    expStatement : statementExp SEMI ;

    statementExp :  assignment | methodCall { System.out.println("MethodCall");} | preExp | postExp  ;

    forStatement : FOR
                {
                        System.out.println("Loop:for");
                }
                LPAREN initialStatement? SEMI expr? SEMI updateStatement? RPAREN statBlock;

    initialStatement : assignment (COMMA assignment)* ;

    updateStatement :  assignment (COMMA assignment)* ;

    foreachStatement : FOREACH LPAREN IDENTIFIER IN
                    {
                            System.out.println("Loop:foreach");
                    }
                    (IDENTIFIER(DOT IDENTIFIER)? | THIS DOT IDENTIFIER | expr) RPAREN statBlock;


    breakStatement : BREAK SEMI
                {
                        System.out.println("Control:break");
                }
                ;

    continueStatement : CONTINUE SEMI
                    {
                            System.out.println("Control:continue");
                    }
                    ;

    returnStatement : RETURN
        {
                System.out.println("Return");
        }
        expr? SEMI;

    expressionName
        	:
        	    IDENTIFIER
        	|	expressionName DOT IDENTIFIER
        	;

    primary
    	:	(	primaryNoNewArray_lfno_primary
    		|	classAssignment
    		)
    		(	primaryNoNewArray_lf_primary
    		)*
    	;

    primaryNoNewArray_lf_arrayAccess
    	:
    	;

    primaryNoNewArray_lfno_arrayAccess
    	:	literal
    	|	THIS
    	|	LPAREN expression RPAREN
    	|	classAssignment
    	|	fieldAccess
    	|	methodCall
    	|   returnFuncPointer
    	;

    primaryNoNewArray_lf_primary
    	:
    		fieldAccess_lf_primary
    	|	arrayAccess_lf_primary
    	|	methodCall2
    	|   returnFuncPointer

    	;

    primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
    	:
    	;

    primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
    	:
    		fieldAccess_lf_primary
    	|	methodCall2
    	|   returnFuncPointer

    	;

    primaryNoNewArray_lfno_primary
    	:	literal
    	|	THIS
    	|	LPAREN expression RPAREN
    	|	classAssignment
    	|	arrayAccess_lfno_primary
    	|	methodCall2


    	;

    primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
    	:
    	;

    primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
    	:	literal


    	|	THIS

    	|	LPAREN expression RPAREN
    	|	classAssignment
    	|	methodCall2
    	;

    fieldAccess
    	:	primary DOT IDENTIFIER
    	;

    fieldAccess_lf_primary
    	:	DOT IDENTIFIER
    	;

    arrayAccess
    	:	(	expressionName LBRACK expression RBRACK
    		|	primaryNoNewArray_lfno_arrayAccess LBRACK expression RBRACK
    		)
    		(	primaryNoNewArray_lf_arrayAccess LBRACK expression RBRACK
    		)*
    	;

    arrayAccess_lf_primary
    	:	(	primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary LBRACK expression RBRACK
    		)
    		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary LBRACK expression RBRACK
    		)*
    	;

    arrayAccess_lfno_primary
    	:	(	expressionName LBRACK expression RBRACK
    		|	primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary LBRACK expression RBRACK
    		)
    		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary LBRACK expression RBRACK
    		)*
    	;

    returnFuncPointer : LPAREN expr? (COMMA expr)* RPAREN;

    methodCall : ((IDENTIFIER | primary | expressionName) DOT)? methodCallBody;

    methodCall2 : ((IDENTIFIER | expressionName) DOT)? methodCallBody ;

    methodCallBody : IDENTIFIER LPAREN expr? (COMMA expr)* RPAREN ;

    expression
    	:	expr
    	|   assignment
    	;

    assignment : leftHandSide ASSIGN expr
                    {
                        System.out.println("Operator:=");
                    }
      ;



    leftHandSide
     	:
        expressionName
     	|	fieldAccess
     	|	arrayAccess
     	;

    classAssignment : NEW IDENTIFIER LPAREN expr? (COMMA expr)* RPAREN ;

    listInitializer : LBRACK ((listInitializer | expr) (COMMA (listInitializer | expr))*) RBRACK ;

    preExp : (DEC | INC) literal ;

    postExp : literal (DEC | INC) ;

    expr
	:	conditionalOrExpression | listInitializer
	;

    conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression op = OR conditionalAndExpression
        {
            if ($op.text != null){
                System.out.println("Operator:"+$op.text);
            }
        }
	;

    conditionalAndExpression
	:	equalityExpression
	|	conditionalAndExpression op = AND equalityExpression
        {
            if ($op.text != null){
                System.out.println("Operator:"+$op.text);
            }
        }
	;


    equalityExpression
	:	relationalExpression
	|	equalityExpression op = (EQUAL | NOTEQUAL) relationalExpression
        {
            if ($op.text != null){
                System.out.println("Operator:"+$op.text);
            }
        }
	;

    relationalExpression
	:	additiveExpression
	|	relationalExpression op=(LE | GE | LT | GT) additiveExpression
        {
            if ($op.text != null){
                System.out.println("Operator:"+$op.text);
            }
        }
	;



    additiveExpression
	:	multiplicativeExpression
	|	additiveExpression op = (ADD | SUB) multiplicativeExpression
                {
                    if ($op.text != null){
                        System.out.println("Operator:"+$op.text);
                    }
                }
	;

    multiplicativeExpression
	:	unaryExpression
    |	multiplicativeExpression op = (MUL | DIV | MOD) unaryExpression
    {
        if ($op.text != null){
            System.out.println("Operator:"+$op.text);
        }
    }
	;

	unaryExpression
    	:	preIncrementExpression
    	|	preDecrementExpression
    	|	ADD unaryExpression
    	|	SUB unaryExpression
    	|	unaryExpressionNotPlusMinus
    	;

    preIncrementExpression
    	:	INC unaryExpression
    	;

    preDecrementExpression
    	:	DEC unaryExpression
    	;

    unaryExpressionNotPlusMinus
    	:	postfixExpression
    	|	NOT unaryExpression
    	;

    postfixExpression
    	:	(	primary
    		|	expressionName
    		)
    		(	postIncrementExpression_lf_postfixExpression
    		|	postDecrementExpression_lf_postfixExpression
    		)*
    	;

    postIncrementExpression
    	:	postfixExpression '++'
    	;

    postIncrementExpression_lf_postfixExpression
    	:	INC
    	;

    postDecrementExpression
    	:	postfixExpression '--'
    	;

    postDecrementExpression_lf_postfixExpression
    	:	DEC
    	;

    literal :

          intLiteral
         | BOOL_LITERAL
         | STRING_LITERAL
         ;

    printStatement : PRINT LPAREN printBody RPAREN SEMI
                    {
                            System.out.println("Built-in:print");
                    }
                    ;

    printBody : expr;

    emptyStatement : SEMI ;

    comment : COMMENT ;

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

    COMMENT
        : '//' .*? '\n' -> skip
        ;


     WS
        : [ \t\r\n]+ -> skip
        ;