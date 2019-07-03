grammar Figure;

@parser::header {
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
}

@parser::members {
static protected Map<String,FigureSymbol> symbolTable = new HashMap<>();
static protected List<String> loopSymbol = new ArrayList<>();
}

main: statList EOF;

statList: canvas*;

stat: print
    | element
    | rotate
    | loop
    ;

statement: (stat? ';')*;

canvas: 'canvas(' NUMBER? ')' statement 'endcanvas';

loop returns[String list]: 
      'loop(' (ct=ID '=' setct=NUMBER ',')? nloop=NUMBER (',' step=NUMBER)? ')' statement 'endloop'           #numLoop
    | 'loop('ct=ID ',' (COLOR ',' COLOR)+ ')' statement 'endloop'                                             #colorLoop
    ;

print: 'print' expr;

element: figName=FIGNAME '<'NUMBER (','NUMBER)* (','cl=COLOR)? '>' ID;

fill returns[FigureSymbol fig]: ID '.fill('c1=COLOR (','c2=COLOR)? ')';

translate returns[FigureSymbol fig]: ID '.translate('n1=NUMBER ',' n2=NUMBER ')';

rotate: 'rotate('NUMBER')' ('|' expr)?;

expr returns[FigureSymbol fig]: 
      e1=expr '|' e2=expr       #addExpr
    | fill                      #fillExpr
    | translate                 #transExpr
    | rotate                    #rotExpr
    | ID                        #idExpr
    ;

// Parser rules
FIGNAME: 'circle' | 'square' | 'rect' | 'line';
COLOR: 'white' | 'black' | 'red' | 'green' | 'blue' | 'cyan' | 'magenta' | 'yellow';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+ '.'? [0-9]*;
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;
ERROR: .;
