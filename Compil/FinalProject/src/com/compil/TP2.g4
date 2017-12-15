grammar TP2;

start_rule : 'compil' PROGNAME '(' ')'
'{'
declarations
'start'
instructions
'}';


declarations : (suite declarations)|suite  ;
suite : type variables ';' ;
variables:  ((ID ',' variables) | ID) ;

identifier : ID ;

type : INTcompil | FLOATcompil;

instructions
           :    instAff ';' instructions?
           |    instIf instructions?
           |    instScan ';' instructions?
           |    instPrint';' instructions?
           |    instFor instructions?
           |    instWhile instructions?
           |    instCase instructions?
           ;

instAff:    identifier '=' expression;

instIf: IF '(' condition ')' THEN instructions (instElse instructions ENDIF ';')? ;
instElse : ELSE;

instScan : SCANcompil '(' variables ')' ;
instPrint : PRINTcompil '(' (variables | TEXT) ')' ;
instFor : FOR '('instAff ';' condition ';' instAff ')' '{' instructions '}' ;
instWhile : WHILE '('condition')' '{' instructions '}' ;
instCase : identifier MATCH '{' cases '}' ;

cases : CASE value ARROW instructions BREAK ';' cases? ;

condition : expression si expression ;
si : (SUP|INF) ;

expression : expression pm expression1 | expression1;
expression1 : expression1 md expression2 | expression2;

pm : (PLUS|MINUS) ;
md : (MULT|DIV) ;

expression2 : identifier | '(' expression ')' | value ;


value :     INT
      |     FLOAT
      |     identifier
      ;

//Lexicale

INTcompil : 'intCompil';
FLOATcompil : 'floatCompil';
SCANcompil : 'scancompil' ;
PRINTcompil : 'printcompil' ;
CASE : 'case';
ARROW : '=>';
BREAK : 'break';
START : 'start' ;
IF : 'if';
THEN : 'then';
ELSE : 'else';
ENDIF : 'endif';
MATCH : 'match';
FOR : 'for';
WHILE : 'while';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
SUP : '>';
INF : '<';

PROGNAME : [A-Z]+[a-zA-Z0-9_]* ;
ID : [a-zA-Z]+[a-zA-Z0-9]* ;

INT :   '0' | [1-9] [0-9]* ; // no leading zeros

FLOAT
    :   '-'? INT '.' INT
    |   '-'? INT
    ;


COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;

TEXT : '"' (~'"'|'\\"')* '"'  ;

WS : [ \t\n\r]+ -> channel(HIDDEN) ;

