// Other than the subject's slides, these sources were used to help understand the grammar.
// For left-recursion errors and function recursion examples:
// https://stackoverflow.com/questions/41017948/antlr4-the-following-sets-of-rules-are-mutually-left-recursive
// For operation priority:
// https://stackoverflow.com/questions/47031635/antlr-parser-operator-priority#47034131
grammar Calculator;
statement : //futureproofing it!
expression SEMICOLON EOF //| expression SEMICOLON statement//+ = at least one
; // expression syntax


// math and logic function ids
ADD : '+';
MINUS : '-';
MULT : '*';
DIVIDE : '/';
POWER: '**';
SINE: 'sin';
COSINE: 'cos';
TANGENT: 'tan';
COTAN: 'cot';
MODULUS: 'mod';
NOT: '!';
AND: '&&';
OR: '||';
XOR: '|/|';
NAND: '!&';
LOGARITHM: 'log';
FACTORIAL: 'fac';
PI: 'pi';
EULER: 'e';
ROOT: 'root';

NUM : [-]?[0-9]+ | [-]?[0-9]+ DOT [0-9]; // This used to be INTEGER | REAL but Antlr didn't like that...

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
LOGIC: 'true' | 'false';
SEMICOLON: ';';
LEFTPAR: '(';
RIGHTPAR: ')';
COMMA: ',';
DOT: '.';

ID: [a-zA-Z]+ | [a-zA-Z]+ [0-9]+ | [0-9]+ [a-zA-Z]+;


// Priorities for the operations are done according to which operation we put first.
// EG: we want to calculate 2*3+4 as (2*3)+4 and not like 2*(3+4) so we put the multiplication function
// first like shown in later and then the addition function.
// There was a bug here as well where divisions and subtractions where higher in hierarchy and caused
// wrong results. Now it is fixed : )

// math expression logic
math_base:
NUM																#BASE_MATH_EXP
| PI															#PI_OP
| EULER															#EULER_OP
;


level1prioritymath:
math_base MINUS level2prioritymath                         #SUBTRACTION_OP
| math_base ADD level2prioritymath                           #ADDITION_OP
;

level2prioritymath:
level1prioritymath											#L1P
| math_base POWER level3prioritymath                         #EXPONENT_OP
| math_base DIVIDE level3prioritymath                        #DIVISION_OP
| math_base MULT level3prioritymath                          #MULTIPLICATION_OP
| math_base MODULUS level3prioritymath                       #MODULUS_OP	// Modulus and Factorial operations are using the floor of the number for the second operator (just like Java intended).
;

level3prioritymath:
level2prioritymath												#L3P
| FACTORIAL LEFTPAR math_expression RIGHTPAR                    #FACTORIAL_OP
| LOGARITHM LEFTPAR math_expression RIGHTPAR					#LOG_OP
| SINE LEFTPAR math_expression RIGHTPAR                         #SINE_OP
| COSINE LEFTPAR math_expression RIGHTPAR                       #COSINE_OP
| TANGENT LEFTPAR math_expression RIGHTPAR                      #TANGENT_OP
| COTAN LEFTPAR math_expression RIGHTPAR                        #COTANGENT_OP
| ROOT LEFTPAR math_expression COMMA math_expression RIGHTPAR   #ROOT_OP
| LEFTPAR math_expression RIGHTPAR                              #MATH_IN_PARENTH
;

math_expression:						// These help with detecting with which case we got an expression
math_base
| level3prioritymath														                                                     
| level2prioritymath
| level1prioritymath
;

// logic expression logic
logic_expression:
LOGIC                                       #BASE_LOGIC_EXP
| NOT logic_expression                      #NOT_OP
| LOGIC AND logic_expression     #AND_OP
| LOGIC NAND logic_expression    #NAND_OP
| LOGIC OR logic_expression      #OR_OP
| LOGIC XOR logic_expression     #XOR_OP
| LEFTPAR logic_expression RIGHTPAR         #LOGIC_IN_PARENTH
;

string_expression:
ID											#BASE_ID_EXP
|	ID ADD string_expression	#CONCAT_OP
|	math_expression ADD string_expression	#CONCAT_OP
|	string_expression ADD math_expression	#CONCAT_OP
;
//expression logic
expression:					// I wanted to differentiate between logic and math expressions so that you cannot use them simultaneously because in most contexts, it doesn't make sense.
math_expression
| logic_expression
| string_expression
;
