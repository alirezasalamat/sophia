grammar sophia;

    sophia :classDeclaration*  EOF ;
    type : INT | STRING | BOOL | funcPointerDeclarationBody;

    classDeclaration : CLASS aa=IDENTIFIER (EXTENDS bb=IDENTIFIER)?
    {
           if ($bb.text == null){
               System.out.println("ClassDec:"+$aa.text);
           } else {
               System.out.println("ClassDec:"+$aa.text+","+$bb.text);
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

    listDeclaration : LIST LPAREN (( POS_INT '#' (type | listDeclaration)) | (listBody (COMMA listBody)* ))? RPAREN;

    listBody : listvariableDeclaration | listDeclaration | type ;

    block : LBRACE blockStatements? RBRACE ;

    blockStatements : blockStatement+ ;

    blockStatement : statement ;

    statement : statementWithoutSubstatement | ifStatement | forStatement | foreachStatement ;

    ifStatement : IF
            {
                System.out.println("Conditional:if");
            }
            conditionBlock (ELSE IF bb=conditionBlock {
                System.out.println("Conditional:else");
                System.out.println("Conditional:if");
            })* (ELSE cc=statBlock
            {
                System.out.println("Conditional:else");
            })?
            ;

    conditionBlock : exprBody statBlock ;

    statBlock : statement | LBRACE block RBRACE ;

    statementWithoutSubstatement : block | emptyStatement | expStatement
                                            | breakStatement | continueStatement | returnStatement | printStatement;

    expStatement : statementExp SEMI ;

    statementExp :  assignment | methodCall { System.out.println("MethodCall");}  ;

    forStatement : FOR
                {
                        System.out.println("Loop:for");
                }
                LPAREN initialStatement? SEMI exprBody? SEMI updateStatement? RPAREN statBlock;

    initialStatement : assignment (COMMA assignment)* ;

    updateStatement :  assignment (COMMA assignment)* ;

    foreachStatement : FOREACH LPAREN IDENTIFIER IN
                    {
                            System.out.println("Loop:foreach");
                    }
                    (IDENTIFIER(DOT IDENTIFIER)? | THIS DOT IDENTIFIER | exprBody) RPAREN statBlock;


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
        exprBody? SEMI;

    expressionName
        	:   IDENTIFIER
        	|	expressionName DOT IDENTIFIER
        	;

    primary
    	:	(	primary6
    		|	classAssignment
    		)
    		(	primary5
    		)*
    	;

    primary4
    	:	literal
    	|	THIS
    	|	LPAREN expression RPAREN
    	|	classAssignment
    	|	fieldCall
    	|	methodCall
    	|   returnFuncPointer
    	;

    primary5
    	:	fieldCallPrimary
    	|	aarrayCallPrimary
    	|	methodCall2
    	|   returnFuncPointer
    	;


    primary3
    	:	fieldCallPrimary
    	|	methodCall2
    	|   returnFuncPointer
    	;

    primary6
    	:	literal
    	|	THIS
    	|	LPAREN expression RPAREN
    	|	classAssignment
    	|	arrayCallNoPrimary
    	|	methodCall2
    	;

    primary2
    	:	literal
    	|	THIS
    	|	LPAREN expression RPAREN
    	|	classAssignment
    	|	methodCall2
    	;

    fieldCall
    	:	primary DOT IDENTIFIER
    	;

    fieldCallPrimary
    	:	DOT IDENTIFIER
    	;

    arrayCall
    	:	(	expressionName LBRACK expression RBRACK
    		|	primary4 LBRACK expression RBRACK
    		)
    		( LBRACK expression RBRACK
    		)*
    	;

    aarrayCallPrimary
    	:	(	primary3 LBRACK expression RBRACK
    		)
    		(	LBRACK expression RBRACK
    		)*
    	;

    arrayCallNoPrimary
    	:	(	expressionName LBRACK expression RBRACK
    		|	primary2 LBRACK expression RBRACK
    		)
    		(	LBRACK expression RBRACK
    		)*
    	;

    returnFuncPointer : LPAREN ( empty | exprBody (COMMA exprBody)* ) RPAREN;

    methodCall : ((IDENTIFIER | primary | expressionName) DOT)? methodCallBody;

    methodCall2 : ((IDENTIFIER | expressionName) DOT)? methodCallBody ;

    methodCallBody : IDENTIFIER LPAREN ( empty | exprBody (COMMA exprBody)* ) RPAREN ;

    empty: ;

    expression
    	:	exprBody
    	|   assignment
    	;

    assignment : leftSide ASSIGN (exprBody | assignment)
                    {
                        System.out.println("Operator:=");
                    };

    leftSide
     	:
        expressionName
     	|	fieldCall
     	|	arrayCall
     	| exprBody
     	;

    classAssignment : NEW IDENTIFIER LPAREN ( empty | exprBody (COMMA exprBody)* ) RPAREN ;

    listInitializer : LBRACK ((listInitializer | exprBody) (COMMA (listInitializer | exprBody))*)? RBRACK ;

    exprBody
	:	conditionalOrExpression | listInitializer
	;

    conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression OR conditionalAndExpression
        {
            System.out.println("Operator:||");
        }
	;

    conditionalAndExpression
	:	equalityExpression
	|	conditionalAndExpression AND equalityExpression
        {
            System.out.println("Operator:&&");
        }
	;

    equalityExpression
	:	relationExpression
	|	equalityExpression op = (EQUAL | NOTEQUAL) relationExpression
        {
            System.out.println("Operator:"+$op.text);
        }
	;

    relationExpression
	:	addExpression
	|	relationExpression  op=(LE | GE | LT | GT) addExpression
        {
            System.out.println("Operator:"+$op.text);
        }
	;

    addExpression
	:	multipleExpression
	|	addExpression  op = (ADD | SUB) multipleExpression
                {
                    System.out.println("Operator:"+$op.text);
                }
	;

    multipleExpression
	:	unaryExpression
    |	multipleExpression  op = (MUL | DIV | MOD) unaryExpression
    {
        System.out.println("Operator:"+$op.text);
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
    	        {
                    System.out.println("Operator:++");
                }
    	;

    preDecrementExpression
    	:	DEC unaryExpression
    	        {
                    System.out.println("Operator:--");
                }
    	;

    unaryExpressionNotPlusMinus
    	:	postfixExpression
    	|	NOT unaryExpression
    	        {
                    System.out.println("Operator:!");
                }
    	;

    postfixExpression
    	:	(	primary
    		|	expressionName
    		)
    		(	postIncExpressionPostfix
    		|	postDecExpressionPostfix
    		)*
    	;


    postIncExpressionPostfix
    	:	INC
    	        {
                    System.out.println("Operator:++");
                }
    	;

    postDecExpressionPostfix
    	:	DEC
    	        {
                    System.out.println("Operator:--");
                }
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

    printBody : exprBody ;

    emptyStatement : SEMI ;

    comment : COMMENT ;

    BOOL_LITERAL : FALSE | TRUE;
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
    MOD: '%';

    COMMENT
        : '//' .*? '\n' -> skip
        ;


     WS
        : [ \t\r\n]+ -> skip
        ;