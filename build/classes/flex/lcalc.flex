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
newline = \r|\n|\r\n

/* White space is a line terminator, space, tab, or line feed. */
WhiteSpace     = [ \t\f]

digit = [0-9]

int = 0 | [1-9][0-9]* | -[1-9][0-9]*

real = ({digit}+[.]{digit}*)|({digit}*[.]{digit}+)

id = [:jletter:] [:jletterdigit:]*

%%
/* --------------Lexical Rules---------------------- */

"+"                { System.out.print(" + "); return symbol(sym.PLUS); }
"-"                { System.out.print(" - "); return symbol(sym.MINUS); }
"*"                { System.out.print(" * "); return symbol(sym.TIMES); }
"/"                { System.out.print(" / "); return symbol(sym.DIVIDE); }
"="               { System.out.print(" = "); return symbol(sym.ASSIGN); }
"("               { System.out.print(" ( "); return symbol(sym.LPAREN); }
")"               { System.out.print(" ) "); return symbol(sym.RPAREN); }
";"               { System.out.print(" ) "); return symbol(sym.SEMI); }

"if"               { System.out.print(" if "); return symbol(sym.IF); }
"else"               { System.out.print(" else "); return symbol(sym.ELSE); }
"{"               { System.out.print(" { "); return symbol(sym.LBRACKET); }
"}"               { System.out.print(" } "); return symbol(sym.RBRACKET); }

"<"               { System.out.print(" < "); return symbol(sym.LT); }
"<="               { System.out.print(" <= "); return symbol(sym.LE); }
"=="               { System.out.print(" == "); return symbol(sym.EQ); }
"<>"               { System.out.print(" <> "); return symbol(sym.NE); }
">"               { System.out.print(" > "); return symbol(sym.GT); }
">="               { System.out.print(" >= "); return symbol(sym.GE); }

{int}              { System.out.print(" " + yytext() + " ");
                     return symbol(sym.NUMBER, new Integer(yytext())); }
{real}              { System.out.print(" " + yytext() + " ");
                     return symbol(sym.REAL, new Double(yytext())); }

{id}               { System.out.print(" " + yytext() + " ");
                     return symbol(sym.ID, yytext()); }

{newline}          { System.out.print(yytext());
                    return symbol(sym.NEWLINE); }

{WhiteSpace} { /* just skip what was found, do nothing */ }

<<EOF>>            { return symbol(sym.EOF); }
/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */

[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
