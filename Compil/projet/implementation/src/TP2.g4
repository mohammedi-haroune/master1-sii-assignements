grammar TP2;

start_rule : 'compil' PROGNAME '(' ')'
'{'
declarations
'start'
instructions
'}';

declarations
           :    type ID (',' ID)* ';' declarations?
           ;

type : 'intcompil' | 'floatcompil';

instructions
           :    (ID '=' expression ';' | if) instructions?
           ;

if: 'if' '(' condition ')' 'then' instructions ('else' instructions 'endif' ';')? ;

condition: expression ('>'|'<') expression ;

expression
         :  expression ('*'|'/') expression
         |  expression ('+'|'-') expression
         |  '(' expression ')'
         |  INT
         |  FLOAT
         |  ID
         ;

//Lexicale

PROGNAME : [A-Z]+[a-zA-Z0-9_]* ;
ID : [a-zA-Z]+[a-zA-Z0-9]* ;

FLOAT
    :   '-'? INT '.' INT
    |   '-'? INT
    ;

INT :   '0' | [1-9] [0-9]* ; // no leading zeros

COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;

WS : [ \t\n\r]+ -> channel(HIDDEN) ;

