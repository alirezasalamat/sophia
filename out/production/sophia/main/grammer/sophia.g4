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

    ifStatement : IF
            {
                System.out.println("Conditional:if");
            }
            (ELSE IF bb=condition_block {
                System.out.println("Conditional:if");
                System.out.println("Conditional:else");
            })* (ELSE cc=statBlock
            {
                System.out.println("Conditional:else");
            })?
            condition_block;

    condition_block : expr statBlock ;

    statBlock : statement | LBRACE block RBRACE ;

    statementWithoutTrailingSubstatement : block | emptyStatement | expStatement
                                            | breakStatement | continueStatement | returnStatement | printStatement;

    expStatement : statementExp SEMI ;

    statementExp :  assignment | methodCall | preExp | postExp  ;

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

    primaryNoNewArray
    	:	literal
    	|	'this'
    	|	'(' expression ')'
    	|	classAssignment
    	|	fieldAccess
    	|	arrayAccess
    	|	methodCall
    	;

    primaryNoNewArray_lf_arrayAccess
    	:
    	;

    primaryNoNewArray_lfno_arrayAccess
    	:	literal
    	|	'this'
    	|	'(' expression ')'
    	|	classAssignment
    	|	fieldAccess
    	|	methodCall
    	;

    primaryNoNewArray_lf_primary
    	:
    		fieldAccess_lf_primary
    	|	arrayAccess_lf_primary
    	|	methodCall2

    	;

    primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
    	:
    	;

    primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
    	:
    		fieldAccess_lf_primary
    	|	methodCall2

    	;

    primaryNoNewArray_lfno_primary
    	:	literal
    	|	'this'
    	|	'(' expression ')'
    	|	classAssignment
    	|	arrayAccess_lfno_primary
    	|	methodCall2

    	;

    primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
    	:
    	;

    primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
    	:	literal


    	|	'this'

    	|	'(' expression ')'
    	|	classAssignment
    	|	methodCall2
    	;

    fieldAccess
    	:	primary '.' IDENTIFIER

    	;

    fieldAccess_lf_primary
    	:	'.' IDENTIFIER
    	;



    arrayAccess
    	:	(	expressionName '[' expression ']'
    		|	primaryNoNewArray_lfno_arrayAccess '[' expression ']'
    		)
    		(	primaryNoNewArray_lf_arrayAccess '[' expression ']'
    		)*
    	;

    arrayAccess_lf_primary
    	:	(	primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary '[' expression ']'
    		)
    		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary '[' expression ']'
    		)*
    	;

    arrayAccess_lfno_primary
    	:	(	expressionName '[' expression ']'
    		|	primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary '[' expression ']'
    		)
    		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary '[' expression ']'
    		)*
    	;
    methodCall : ((IDENTIFIER | primary | expressionName) DOT)? methodCallBody
                {
                        System.out.println("MethodCall");
                }
                ;

   methodCall2 : ((IDENTIFIER | expressionName) DOT)? methodCallBody
                   {
                           System.out.println("MethodCall");
                   }
                   ;

    methodCallBody : IDENTIFIER LPAREN expr? (COMMA expr)* RPAREN ;

    expression
    	:	expr
    	| assignment
    	;





     assignment : leftHandSide ASSIGN expr ;



    leftHandSide
     	:
        expressionName
     	|	fieldAccess
     	|	arrayAccess
     	;





   // afterDot : (methodCallBody | (IDENTIFIER | THIS)) index ;

    classAssignment : NEW IDENTIFIER LPAREN expr? (COMMA expr)* RPAREN ;

    listInitializer : LBRACK ((listInitializer | expr) (COMMA (listInitializer | expr))*) RBRACK ;

    preExp : (DEC | INC) literal ;

    postExp : literal (DEC | INC) ;

expr
	:	conditionalOrExpression | listInitializer
	;

conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression '||' conditionalAndExpression
	;

conditionalAndExpression
	:	inclusiveOrExpression
	|	conditionalAndExpression '&&' inclusiveOrExpression
	;

inclusiveOrExpression
	:	exclusiveOrExpression
	|	inclusiveOrExpression '|' exclusiveOrExpression
	;

exclusiveOrExpression
	:	andExpression
	|	exclusiveOrExpression '^' andExpression
	;

andExpression
	:	equalityExpression
	|	andExpression '&' equalityExpression
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression '==' relationalExpression
	|	equalityExpression '!=' relationalExpression
	;

relationalExpression
	:	shiftExpression
	|	relationalExpression '<' shiftExpression
	|	relationalExpression '>' shiftExpression
	|	relationalExpression '<=' shiftExpression
	|	relationalExpression '>=' shiftExpression
	;

shiftExpression
	:	additiveExpression
	|	shiftExpression '<' '<' additiveExpression
	|	shiftExpression '>' '>' additiveExpression
	|	shiftExpression '>' '>' '>' additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression
	|	additiveExpression '-' multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression '*' unaryExpression
	|	multiplicativeExpression '/' unaryExpression
	|	multiplicativeExpression '%' unaryExpression
	;

	unaryExpression
    	:	preIncrementExpression
    	|	preDecrementExpression
    	|	'+' unaryExpression
    	|	'-' unaryExpression
    	|	unaryExpressionNotPlusMinus
    	;

    preIncrementExpression
    	:	'++' unaryExpression
    	;

    preDecrementExpression
    	:	'--' unaryExpression
    	;

    unaryExpressionNotPlusMinus
    	:	postfixExpression
    	|	'~' unaryExpression
    	|	'!' unaryExpression
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
    	:	'++'
    	;

    postDecrementExpression
    	:	postfixExpression '--'
    	;

    postDecrementExpression_lf_postfixExpression
    	:	'--'
    	;
   /* expr :
            // methodCallBody
            //| expr DOT expr
             postExp
            | preExp
            | NOT expr
            | expr op=(MUL | DIV | MOD) expr
                    {
                        if ($op.text != null){
                            System.out.println("Operator:"+$op.text);
                        }
                    }
            | expr op=(ADD | SUB) expr
                    {
                        if ($op.text != null){
                            System.out.println("Operator:"+$op.text);
                        }
                    }
            | expr op=(LE | GE | LT | GT) expr
                    {
                        if ($op.text != null){
                            System.out.println("Operator:"+$op.text);
                        }
                    }
            | expr op=(EQUAL | NOTEQUAL) expr
                    {
                        if ($op.text != null){
                            System.out.println("Operator:"+$op.text);
                        }
                    }
            | expr AND expr
            | expr OR expr
            | IDENTIFIER


           // | afterDot
            ;*/


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