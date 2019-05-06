/* ------------------User code: empty ---------------------- */
package src;

import java.io.*;
import java_cup.runtime.*;
%%

/* -----------------Options and Declarations----------------- */
%class Lexer

/*
   The name of the class JFlex will create will be Lexer.
   Will write the code to the file Lexer.java.
*/

%line
%column

/*
   Will switch to a CUP compatibility mode to interface with a CUP
   generated parser.
*/
%cup

%{
    /* To create a new java_cup.runtime.Symbol with information about
       the current token, the token will have no value in this
       case. */

    StringBuffer string = new StringBuffer();
    public Lexer(java.io.Reader in, ComplexSymbolFactory sf){
	this(in);
	symbolFactory = sf;
    }
    ComplexSymbolFactory symbolFactory;

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    /* Also creates a new java_cup.runtime.Symbol with information
       about the current token, but this object has a value. */

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}


/* Macro Declarations */
/* A line terminator is a \r (carriage return), \n (line feed), or \r\n. */
/* newline = \r|\n|\r\n */

/* White space is a line terminator, space, tab, or line feed. */
WhiteSpace = [\ \n\r\t\f]

digit = [0-9]

int = 0 | [1-9][0-9]* | -[1-9][0-9]*

real = ({digit}+[.]{digit}*)|({digit}*[.]{digit}+)

id = [:jletter:] [:jletterdigit:]*
bool = true | false

char = \'[:jletterdigit:]\'


%%
/* --------------Lexical Rules---------------------- */

"int"              { System.out.print(" int "); return symbol(sym.INT); }
"double"              { System.out.print(" double "); return symbol(sym.DOUBLE); }
"bool"              { System.out.print(" bool "); return symbol(sym.BOOLEAN); }
"char"              { System.out.print(" char "); return symbol(sym.CHARACTER); }

"+"                { System.out.print(" + "); return symbol(sym.PLUS); }
"-"                { System.out.print(" - "); return symbol(sym.MINUS); }
"*"                { System.out.print(" * "); return symbol(sym.TIMES); }
"/"                { System.out.print(" / "); return symbol(sym.DIVIDE); }
"="               { System.out.print(" = "); return symbol(sym.ASSIGN); }
"("               { System.out.print(" ( "); return symbol(sym.LPAREN); }
")"               { System.out.print(" ) "); return symbol(sym.RPAREN); }
";"               { System.out.print(" ; "); return symbol(sym.SEMI); }
","               { System.out.print(" , "); return symbol(sym.COMMA); }

"if"               { System.out.print(" if "); return symbol(sym.IF); }
"else"               { System.out.print(" else "); return symbol(sym.ELSE); }
"{"               { System.out.print(" { "); return symbol(sym.LBRACKET); }
"}"               { System.out.print(" } "); return symbol(sym.RBRACKET); }

"while"             { System.out.print(" while "); return symbol(sym.WHILE); }

"function"          { System.out.print(" function "); return symbol(sym.FUNCTION); }

"<"               { System.out.print(" < "); return symbol(sym.LT); }
"<="               { System.out.print(" <= "); return symbol(sym.LE); }
"=="               { System.out.print(" == "); return symbol(sym.EQ); }
"!="               { System.out.print(" != "); return symbol(sym.NE); }
">"               { System.out.print(" > "); return symbol(sym.GT); }
">="               { System.out.print(" >= "); return symbol(sym.GE); }

"AND"               { System.out.print(" AND "); return symbol(sym.AND); }
"OR"               { System.out.print(" OR "); return symbol(sym.OR); }

"print"               { System.out.print(" print "); return symbol(sym.PRINT); }

{int}              { System.out.print(" " + yytext() + " ");
                     return symbol(sym.NUMBER, new Integer(yytext())); }
{real}              { System.out.print(" " + yytext() + " ");
                     return symbol(sym.REAL, new Double(yytext())); }
{bool}              { System.out.print(" " + yytext() + " ");
                     return symbol(sym.BOOL, new Boolean(yytext())); }
{char}              { System.out.print(" " + yytext() + " ");
                     return symbol(sym.CHAR, (Character)(yytext().charAt(1))); }

{id}               { System.out.print(" " + yytext() + " ");
                     return symbol(sym.ID, yytext()); }

{WhiteSpace} { /* just skip what was found, do nothing */ }

<<EOF>>            { return symbol(sym.EOF); }
/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */

[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
