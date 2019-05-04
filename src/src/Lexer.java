/* The following code was generated by JFlex 1.4_pre3 on 5/5/19 1:29 AM */

/* ------------------User code: empty ---------------------- */
package src;

import java.io.*;
import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4_pre3
 * on 5/5/19 1:29 AM from the specification file
 * <tt>file:/C:/Users/asus/Desktop/plc/plc-assign2/src/flex/lcalc.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int YY_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] yycmap = {
     7,  7,  7,  7,  7,  7,  7,  7,  7,  1,  1,  0,  1,  1,  7,  7, 
     7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  0,  0,  0,  0, 
     1,  0,  0,  0,  6,  0,  0,  0, 27, 28, 24, 23,  0,  4,  5, 25, 
     3,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 29, 33, 26, 34,  0, 
     0,  6,  6,  6,  6,  6,  6,  6,  6,  6,  6,  6,  6,  6,  6,  6, 
     6,  6,  6,  6,  6,  6,  6,  6,  6,  6,  6,  0,  0,  0,  0,  6, 
     0, 13, 20, 21, 18, 11, 12,  6, 22, 16,  6,  6, 14,  6, 17, 19, 
    35,  6,  9, 15,  8, 10,  6, 32,  6,  6,  6, 30,  0, 31,  0,  7
  };


  /** 
   * Translates a state to a row index in the transition table (packed version)
   */
  final private static String yy_rowMap_packed = 
    "\0\0\0\44\0\44\0\110\0\154\0\220\0\264\0\330\0\374\0\u0120"+
    "\0\u0144\0\u0168\0\u018c\0\u01b0\0\u01d4\0\44\0\44\0\44\0\u01f8\0\44"+
    "\0\44\0\44\0\44\0\44\0\u021c\0\u0240\0\u0264\0\u0288\0\264\0\154"+
    "\0\u02ac\0\u02d0\0\u02f4\0\u0318\0\330\0\u033c\0\u0360\0\u0384\0\u03a8\0\44"+
    "\0\u03cc\0\44\0\44\0\44\0\u03f0\0\u0414\0\u0438\0\u045c\0\330\0\u0480"+
    "\0\u04a4\0\u04c8\0\u04ec\0\u0510\0\330\0\330\0\u0534\0\330\0\330\0\u0558"+
    "\0\u057c\0\u05a0\0\330\0\330\0\330";

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int [] yy_rowMap = yy_unpack_rowMap(yy_rowMap_packed);


  /** 
   * Unpacks the compressed row translation table.
   *
   * @param packed   the packed row translation table
   * @return         the unpacked row translation table
   */
  private static int [] yy_unpack_rowMap(String packed) {
    int [] map = new int[130];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
      int high = ((int) packed.charAt(i++)) << 16;
      map[j++] = high | packed.charAt(i++);
    }
    return map;
  }
  /** 
   * The packed transition table of the DFA (part 0)
   */
  private static final String yy_packed0 = 
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\2\10\1\12\1\13\3\10\1\14\1\10\1\15"+
    "\1\10\1\16\1\17\1\10\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\46\0\2\4\1\0\1\35\40\0\2\36\1\0"+
    "\1\35\40\0\1\37\43\0\2\35\42\0\2\10\2\0"+
    "\21\10\11\0\1\10\2\0\1\10\2\0\2\10\2\0"+
    "\3\10\1\40\15\10\11\0\1\10\2\0\1\10\2\0"+
    "\2\10\2\0\10\10\1\41\10\10\11\0\1\10\2\0"+
    "\1\10\2\0\2\10\2\0\7\10\1\42\11\10\11\0"+
    "\1\10\2\0\1\10\2\0\2\10\2\0\6\10\1\43"+
    "\4\10\1\44\5\10\11\0\1\10\2\0\1\10\2\0"+
    "\2\10\2\0\15\10\1\45\3\10\11\0\1\10\2\0"+
    "\1\10\2\0\2\10\2\0\15\10\1\46\3\10\11\0"+
    "\1\10\2\0\1\10\2\0\2\10\2\0\20\10\1\47"+
    "\11\0\1\10\2\0\1\10\32\0\1\50\13\0\2\10"+
    "\2\0\20\10\1\51\11\0\1\10\2\0\1\10\32\0"+
    "\1\52\7\0\1\53\33\0\1\54\13\0\2\10\2\0"+
    "\3\10\1\55\15\10\11\0\1\10\2\0\1\10\2\0"+
    "\2\37\42\0\2\10\2\0\4\10\1\56\14\10\11\0"+
    "\1\10\2\0\1\10\2\0\2\10\2\0\11\10\1\57"+
    "\7\10\11\0\1\10\2\0\1\10\2\0\2\10\2\0"+
    "\10\10\1\60\10\10\11\0\1\10\2\0\1\10\2\0"+
    "\2\10\2\0\2\10\1\61\16\10\11\0\1\10\2\0"+
    "\1\10\2\0\2\10\2\0\4\10\1\62\14\10\11\0"+
    "\1\10\2\0\1\10\2\0\2\10\2\0\15\10\1\63"+
    "\3\10\11\0\1\10\2\0\1\10\2\0\2\10\2\0"+
    "\7\10\1\64\11\10\11\0\1\10\2\0\1\10\2\0"+
    "\2\10\2\0\12\10\1\65\6\10\11\0\1\10\2\0"+
    "\1\10\2\0\2\10\2\0\12\10\1\66\6\10\11\0"+
    "\1\10\2\0\1\10\2\0\2\10\2\0\5\10\1\67"+
    "\13\10\11\0\1\10\2\0\1\10\2\0\2\10\2\0"+
    "\5\10\1\70\13\10\11\0\1\10\2\0\1\10\2\0"+
    "\2\10\2\0\11\10\1\56\7\10\11\0\1\10\2\0"+
    "\1\10\2\0\2\10\2\0\16\10\1\71\2\10\11\0"+
    "\1\10\2\0\1\10\2\0\2\10\2\0\10\10\1\72"+
    "\10\10\11\0\1\10\2\0\1\10\2\0\2\10\2\0"+
    "\3\10\1\73\15\10\11\0\1\10\2\0\1\10\2\0"+
    "\2\10\2\0\10\10\1\74\10\10\11\0\1\10\2\0"+
    "\1\10\2\0\2\10\2\0\13\10\1\75\5\10\11\0"+
    "\1\10\2\0\1\10\2\0\2\10\2\0\10\10\1\76"+
    "\10\10\11\0\1\10\2\0\1\10\2\0\2\10\2\0"+
    "\5\10\1\77\13\10\11\0\1\10\2\0\1\10\2\0"+
    "\2\10\2\0\2\10\1\100\16\10\11\0\1\10\2\0"+
    "\1\10\2\0\2\10\2\0\5\10\1\101\13\10\11\0"+
    "\1\10\2\0\1\10";

  /** 
   * The transition table of the DFA
   */
  private static final int yytrans [] = yy_unpack();


  /* error codes */
  private static final int YY_UNKNOWN_ERROR = 0;
  private static final int YY_ILLEGAL_STATE = 1;
  private static final int YY_NO_MATCH = 2;
  private static final int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  private static final String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final byte YY_ATTRIBUTE[] = {
     0,  9,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  9, 
     9,  9,  1,  9,  9,  9,  9,  9,  1,  1,  1,  1,  1,  0,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  9,  1,  9,  9,  9,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[1476];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 64: 
          {  System.out.print(" double "); return symbol(sym.DOUBLE);  }
        case 66: break;
        case 63: 
          {  System.out.print(" print "); return symbol(sym.PRINT);  }
        case 67: break;
        case 62: 
          {  System.out.print(" while "); return symbol(sym.WHILE);  }
        case 68: break;
        case 58: 
          {  System.out.print(" char "); return symbol(sym.CHAR);  }
        case 69: break;
        case 55: 
          {  System.out.print(" else "); return symbol(sym.ELSE);  }
        case 70: break;
        case 48: 
          {  System.out.print(" int "); return symbol(sym.INT);  }
        case 71: break;
        case 43: 
          {  System.out.print(" >= "); return symbol(sym.GE);  }
        case 72: break;
        case 42: 
          {  System.out.print(" <> "); return symbol(sym.NE);  }
        case 73: break;
        case 41: 
          {  System.out.print(" <= "); return symbol(sym.LE);  }
        case 74: break;
        case 39: 
          {  System.out.print(" == "); return symbol(sym.EQ);  }
        case 75: break;
        case 34: 
          {  System.out.print(" if "); return symbol(sym.IF);  }
        case 76: break;
        case 25: 
          {  System.out.print(" < "); return symbol(sym.LT);  }
        case 77: break;
        case 26: 
          {  System.out.print(" > "); return symbol(sym.GT);  }
        case 78: break;
        case 1: 
        case 6: 
          {  throw new Error("Illegal character <"+yytext()+">");  }
        case 79: break;
        case 22: 
          {  System.out.print(" { "); return symbol(sym.LBRACKET);  }
        case 80: break;
        case 23: 
          {  System.out.print(" } "); return symbol(sym.RBRACKET);  }
        case 81: break;
        case 57: 
          {  System.out.print(" bool "); return symbol(sym.BOOLEAN);  }
        case 82: break;
        case 54: 
          {  System.out.print(" " + yytext() + " ");
                     return symbol(sym.BOOL, new Boolean(yytext()));  }
        case 83: break;
        case 15: 
          {  System.out.print(" + "); return symbol(sym.PLUS);  }
        case 84: break;
        case 7: 
        case 8: 
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 24: 
        case 27: 
        case 31: 
        case 32: 
        case 33: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
        case 40: 
        case 44: 
        case 45: 
        case 46: 
        case 47: 
        case 49: 
        case 50: 
        case 51: 
        case 52: 
        case 53: 
        case 56: 
        case 59: 
        case 60: 
        case 61: 
          {  System.out.print(" " + yytext() + " ");
                     return symbol(sym.ID, yytext());  }
        case 85: break;
        case 3: 
        case 4: 
        case 30: 
          {  System.out.print(" " + yytext() + " ");
                     return symbol(sym.NUMBER, new Integer(yytext()));  }
        case 86: break;
        case 2: 
          {  /* just skip what was found, do nothing */  }
        case 87: break;
        case 21: 
          {  System.out.print(" ; "); return symbol(sym.SEMI);  }
        case 88: break;
        case 28: 
          {  System.out.print(" " + yytext() + " ");
                     return symbol(sym.REAL, new Double(yytext()));  }
        case 89: break;
        case 17: 
          {  System.out.print(" / "); return symbol(sym.DIVIDE);  }
        case 90: break;
        case 16: 
          {  System.out.print(" * "); return symbol(sym.TIMES);  }
        case 91: break;
        case 5: 
          {  System.out.print(" - "); return symbol(sym.MINUS);  }
        case 92: break;
        case 18: 
          {  System.out.print(" = "); return symbol(sym.ASSIGN);  }
        case 93: break;
        case 19: 
          {  System.out.print(" ( "); return symbol(sym.LPAREN);  }
        case 94: break;
        case 20: 
          {  System.out.print(" ) "); return symbol(sym.RPAREN);  }
        case 95: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {  return symbol(sym.EOF);  }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
