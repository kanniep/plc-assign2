
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat May 04 22:11:55 ICT 2019
//----------------------------------------------------

package src;

import java.util.*;
import java.io.*;
import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat May 04 22:11:55 ICT 2019
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\002\000\002\002\004\000\002\002" +
    "\004\000\002\003\006\000\002\003\004\000\002\003\011" +
    "\000\002\003\011\000\002\003\015\000\002\003\007\000" +
    "\002\004\003\000\002\004\003\000\002\005\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\005\000\002\005" +
    "\005\000\002\005\005\000\002\006\005\000\002\006\005" +
    "\000\002\006\002\000\002\006\003\000\002\007\005\000" +
    "\002\007\005\000\002\007\003\000\002\010\003\000\002" +
    "\010\003\000\002\010\003\000\002\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\077\000\044\002\001\004\001\005\001\011\001\013" +
    "\001\014\001\015\001\016\001\017\001\020\001\021\001" +
    "\023\001\026\001\027\001\030\001\031\001\032\001\001" +
    "\002\000\044\002\010\004\uffee\005\uffee\011\022\013\uffee" +
    "\014\uffee\015\uffee\016\uffee\017\uffee\020\uffee\021\013\023" +
    "\005\026\uffee\027\021\030\007\031\017\032\016\001\002" +
    "\000\004\011\074\001\002\000\006\012\ufff8\026\ufff8\001" +
    "\002\000\032\004\uffe9\005\uffe9\006\uffe9\007\uffe9\012\uffe9" +
    "\013\uffe9\014\uffe9\015\uffe9\016\uffe9\017\uffe9\020\uffe9\026" +
    "\uffe9\001\002\000\004\002\000\001\002\000\004\026\073" +
    "\001\002\000\026\004\056\005\061\012\ufff7\013\054\014" +
    "\057\015\053\016\062\017\055\020\060\026\ufff7\001\002" +
    "\000\004\011\041\001\002\000\046\002\uffff\004\uffff\005" +
    "\uffff\011\uffff\013\uffff\014\uffff\015\uffff\016\uffff\017\uffff" +
    "\020\uffff\021\uffff\023\uffff\025\uffff\026\uffff\027\uffff\030" +
    "\uffff\031\uffff\032\uffff\001\002\000\032\004\uffed\005\uffed" +
    "\006\036\007\035\012\uffed\013\uffed\014\uffed\015\uffed\016" +
    "\uffed\017\uffed\020\uffed\026\uffed\001\002\000\032\004\uffe7" +
    "\005\uffe7\006\uffe7\007\uffe7\010\032\013\uffe7\014\uffe7\015" +
    "\uffe7\016\uffe7\017\uffe7\020\uffe7\026\uffe7\001\002\000\032" +
    "\004\uffe8\005\uffe8\006\uffe8\007\uffe8\012\uffe8\013\uffe8\014" +
    "\uffe8\015\uffe8\016\uffe8\017\uffe8\020\uffe8\026\uffe8\001\002" +
    "\000\032\004\uffea\005\uffea\006\uffea\007\uffea\012\uffea\013" +
    "\uffea\014\uffea\015\uffea\016\uffea\017\uffea\020\uffea\026\uffea" +
    "\001\002\000\004\011\026\001\002\000\034\004\uffee\005" +
    "\uffee\011\022\012\uffee\013\uffee\014\uffee\015\uffee\016\uffee" +
    "\017\uffee\020\uffee\030\007\031\017\032\024\001\002\000" +
    "\004\012\025\001\002\000\032\004\uffe7\005\uffe7\006\uffe7" +
    "\007\uffe7\012\uffe7\013\uffe7\014\uffe7\015\uffe7\016\uffe7\017" +
    "\uffe7\020\uffe7\026\uffe7\001\002\000\032\004\uffe6\005\uffe6" +
    "\006\uffe6\007\uffe6\012\uffe6\013\uffe6\014\uffe6\015\uffe6\016" +
    "\uffe6\017\uffe6\020\uffe6\026\uffe6\001\002\000\034\004\uffee" +
    "\005\uffee\011\022\012\uffee\013\uffee\014\uffee\015\uffee\016" +
    "\uffee\017\uffee\020\uffee\030\007\031\017\032\024\001\002" +
    "\000\004\012\030\001\002\000\004\026\031\001\002\000" +
    "\046\002\ufff9\004\ufff9\005\ufff9\011\ufff9\013\ufff9\014\ufff9" +
    "\015\ufff9\016\ufff9\017\ufff9\020\ufff9\021\ufff9\023\ufff9\025" +
    "\ufff9\026\ufff9\027\ufff9\030\ufff9\031\ufff9\032\ufff9\001\002" +
    "\000\034\004\uffee\005\uffee\011\022\013\uffee\014\uffee\015" +
    "\uffee\016\uffee\017\uffee\020\uffee\026\uffee\030\007\031\017" +
    "\032\024\001\002\000\004\026\034\001\002\000\046\002" +
    "\ufffe\004\ufffe\005\ufffe\011\ufffe\013\ufffe\014\ufffe\015\ufffe" +
    "\016\ufffe\017\ufffe\020\ufffe\021\ufffe\023\ufffe\025\ufffe\026" +
    "\ufffe\027\ufffe\030\ufffe\031\ufffe\032\ufffe\001\002\000\012" +
    "\011\022\030\007\031\017\032\024\001\002\000\012\011" +
    "\022\030\007\031\017\032\024\001\002\000\032\004\uffec" +
    "\005\uffec\006\uffec\007\uffec\012\uffec\013\uffec\014\uffec\015" +
    "\uffec\016\uffec\017\uffec\020\uffec\026\uffec\001\002\000\032" +
    "\004\uffeb\005\uffeb\006\uffeb\007\uffeb\012\uffeb\013\uffeb\014" +
    "\uffeb\015\uffeb\016\uffeb\017\uffeb\020\uffeb\026\uffeb\001\002" +
    "\000\034\004\uffee\005\uffee\011\022\012\uffee\013\uffee\014" +
    "\uffee\015\uffee\016\uffee\017\uffee\020\uffee\030\007\031\017" +
    "\032\024\001\002\000\004\012\043\001\002\000\004\024" +
    "\044\001\002\000\044\004\001\005\001\011\001\013\001" +
    "\014\001\015\001\016\001\017\001\020\001\021\001\023" +
    "\001\025\001\026\001\027\001\030\001\031\001\032\001" +
    "\001\002\000\044\004\uffee\005\uffee\011\022\013\uffee\014" +
    "\uffee\015\uffee\016\uffee\017\uffee\020\uffee\021\013\023\005" +
    "\025\046\026\uffee\027\021\030\007\031\017\032\016\001" +
    "\002\000\050\002\ufffb\004\ufffb\005\ufffb\011\ufffb\013\ufffb" +
    "\014\ufffb\015\ufffb\016\ufffb\017\ufffb\020\ufffb\021\ufffb\022" +
    "\047\023\ufffb\025\ufffb\026\ufffb\027\ufffb\030\ufffb\031\ufffb" +
    "\032\ufffb\001\002\000\004\024\050\001\002\000\044\004" +
    "\001\005\001\011\001\013\001\014\001\015\001\016\001" +
    "\017\001\020\001\021\001\023\001\025\001\026\001\027" +
    "\001\030\001\031\001\032\001\001\002\000\044\004\uffee" +
    "\005\uffee\011\022\013\uffee\014\uffee\015\uffee\016\uffee\017" +
    "\uffee\020\uffee\021\013\023\005\025\052\026\uffee\027\021" +
    "\030\007\031\017\032\016\001\002\000\046\002\ufffa\004" +
    "\ufffa\005\ufffa\011\ufffa\013\ufffa\014\ufffa\015\ufffa\016\ufffa" +
    "\017\ufffa\020\ufffa\021\ufffa\023\ufffa\025\ufffa\026\ufffa\027" +
    "\ufffa\030\ufffa\031\ufffa\032\ufffa\001\002\000\022\004\uffee" +
    "\005\uffee\011\022\012\uffee\026\uffee\030\007\031\017\032" +
    "\024\001\002\000\022\004\uffee\005\uffee\011\022\012\uffee" +
    "\026\uffee\030\007\031\017\032\024\001\002\000\022\004" +
    "\uffee\005\uffee\011\022\012\uffee\026\uffee\030\007\031\017" +
    "\032\024\001\002\000\012\011\022\030\007\031\017\032" +
    "\024\001\002\000\022\004\uffee\005\uffee\011\022\012\uffee" +
    "\026\uffee\030\007\031\017\032\024\001\002\000\022\004" +
    "\uffee\005\uffee\011\022\012\uffee\026\uffee\030\007\031\017" +
    "\032\024\001\002\000\012\011\022\030\007\031\017\032" +
    "\024\001\002\000\022\004\uffee\005\uffee\011\022\012\uffee" +
    "\026\uffee\030\007\031\017\032\024\001\002\000\012\004" +
    "\056\005\061\012\ufff1\026\ufff1\001\002\000\032\004\uffef" +
    "\005\uffef\006\036\007\035\012\uffef\013\uffef\014\uffef\015" +
    "\uffef\016\uffef\017\uffef\020\uffef\026\uffef\001\002\000\012" +
    "\004\056\005\061\012\ufff2\026\ufff2\001\002\000\012\004" +
    "\056\005\061\012\ufff5\026\ufff5\001\002\000\032\004\ufff0" +
    "\005\ufff0\006\036\007\035\012\ufff0\013\ufff0\014\ufff0\015" +
    "\ufff0\016\ufff0\017\ufff0\020\ufff0\026\ufff0\001\002\000\012" +
    "\004\056\005\061\012\ufff3\026\ufff3\001\002\000\012\004" +
    "\056\005\061\012\ufff6\026\ufff6\001\002\000\012\004\056" +
    "\005\061\012\ufff4\026\ufff4\001\002\000\046\002\ufffd\004" +
    "\ufffd\005\ufffd\011\ufffd\013\ufffd\014\ufffd\015\ufffd\016\ufffd" +
    "\017\ufffd\020\ufffd\021\ufffd\023\ufffd\025\ufffd\026\ufffd\027" +
    "\ufffd\030\ufffd\031\ufffd\032\ufffd\001\002\000\034\004\uffee" +
    "\005\uffee\011\022\012\uffee\013\uffee\014\uffee\015\uffee\016" +
    "\uffee\017\uffee\020\uffee\030\007\031\017\032\024\001\002" +
    "\000\004\012\076\001\002\000\004\024\077\001\002\000" +
    "\044\004\001\005\001\011\001\013\001\014\001\015\001" +
    "\016\001\017\001\020\001\021\001\023\001\025\001\026" +
    "\001\027\001\030\001\031\001\032\001\001\002\000\044" +
    "\004\uffee\005\uffee\011\022\013\uffee\014\uffee\015\uffee\016" +
    "\uffee\017\uffee\020\uffee\021\013\023\005\025\101\026\uffee" +
    "\027\021\030\007\031\017\032\016\001\002\000\046\002" +
    "\ufffc\004\ufffc\005\ufffc\011\ufffc\013\ufffc\014\ufffc\015\ufffc" +
    "\016\ufffc\017\ufffc\020\ufffc\021\ufffc\023\ufffc\025\ufffc\026" +
    "\ufffc\027\ufffc\030\ufffc\031\ufffc\032\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\077\000\004\002\003\001\001\000\016\003\013\004" +
    "\010\005\005\006\011\007\014\010\017\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\004\022\005\005\006\011\007\014\010\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\004\026\005\005\006\011\007\014\010\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\004\032\005\005\006\011\007\014\010\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\037\001\001" +
    "\000\004\010\036\001\001\000\002\001\001\000\002\001" +
    "\001\000\014\004\041\005\005\006\011\007\014\010\017" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\002" +
    "\044\001\001\000\016\003\013\004\010\005\005\006\011" +
    "\007\014\010\017\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\002\050\001\001\000\016\003\013\004\010" +
    "\005\005\006\011\007\014\010\017\001\001\000\002\001" +
    "\001\000\010\006\071\007\014\010\017\001\001\000\010" +
    "\006\070\007\014\010\017\001\001\000\010\006\067\007" +
    "\014\010\017\001\001\000\006\007\066\010\017\001\001" +
    "\000\010\006\065\007\014\010\017\001\001\000\010\006" +
    "\064\007\014\010\017\001\001\000\006\007\063\010\017" +
    "\001\001\000\010\006\062\007\014\010\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\004\074" +
    "\005\005\006\011\007\014\010\017\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\002\077\001\001\000\016" +
    "\003\013\004\010\005\005\006\011\007\014\010\017\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // Factor ::= LPAREN Expression RPAREN 
            {
              FactorNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  RESULT = new FactorNode(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Factor ::= ID 
            {
              FactorNode RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new FactorNode(new TerminalNode(id)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Factor ::= REAL 
            {
              FactorNode RESULT =null;
		int realleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int realright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double real = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new FactorNode(new TerminalNode(real)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Factor ::= NUMBER 
            {
              FactorNode RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer num = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new FactorNode(new TerminalNode(num)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Term ::= Factor 
            {
              TermNode RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		FactorNode f = (FactorNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new TermNode(f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Term ::= Term DIVIDE Factor 
            {
              TermNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		TermNode t = (TermNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		FactorNode f = (FactorNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new TermNode(sym.DIVIDE, t, f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Term ::= Term TIMES Factor 
            {
              TermNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		TermNode t = (TermNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		FactorNode f = (FactorNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new TermNode(sym.TIMES, t, f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Arithmetic_Expression ::= Term 
            {
              ExpressionNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		TermNode t = (TermNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(t); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Arithmetic_Expression",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Arithmetic_Expression ::= 
            {
              ExpressionNode RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Arithmetic_Expression",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Arithmetic_Expression ::= Arithmetic_Expression MINUS Term 
            {
              ExpressionNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		TermNode t = (TermNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(sym.MINUS, e, t); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Arithmetic_Expression",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Arithmetic_Expression ::= Arithmetic_Expression PLUS Term 
            {
              ExpressionNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		TermNode t = (TermNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(sym.PLUS, e, t); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Arithmetic_Expression",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Comparison_Expression ::= Arithmetic_Expression NE Arithmetic_Expression 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(sym.NE, e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Comparison_Expression",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Comparison_Expression ::= Arithmetic_Expression GE Arithmetic_Expression 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(sym.GE, e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Comparison_Expression",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Comparison_Expression ::= Arithmetic_Expression GT Arithmetic_Expression 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(sym.GT, e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Comparison_Expression",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Comparison_Expression ::= Arithmetic_Expression EQ Arithmetic_Expression 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(sym.EQ, e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Comparison_Expression",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Comparison_Expression ::= Arithmetic_Expression LE Arithmetic_Expression 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(sym.LE, e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Comparison_Expression",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Comparison_Expression ::= Arithmetic_Expression LT Arithmetic_Expression 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(sym.LT, e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Comparison_Expression",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Expression ::= Arithmetic_Expression 
            {
              ExpressionNode RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode a = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Expression ::= Comparison_Expression 
            {
              ExpressionNode RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode c = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = c; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Statement ::= PRINT LPAREN Expression RPAREN SEMI 
            {
              StatementNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		  RESULT = new StatementNode(StatementNode.StatementType.Print, e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Statement ::= IF LPAREN Expression RPAREN LBRACKET StatementList RBRACKET ELSE LBRACKET StatementList RBRACKET 
            {
              StatementNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		int s1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		StatementNode s1 = (StatementNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		StatementNode s2 = (StatementNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  RESULT = new StatementNode(e, s1, s2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Statement ::= IF LPAREN Expression RPAREN LBRACKET StatementList RBRACKET 
            {
              StatementNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		StatementNode s = (StatementNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  RESULT = new StatementNode(sym.IF, e, s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Statement ::= WHILE LPAREN Expression RPAREN LBRACKET StatementList RBRACKET 
            {
              StatementNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		StatementNode s = (StatementNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  RESULT = new StatementNode(sym.WHILE, e, s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Statement ::= Expression SEMI 
            {
              StatementNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  RESULT = new StatementNode(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Statement ::= ID ASSIGN Expression SEMI 
            {
              StatementNode RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  RESULT = new StatementNode(id, e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // StatementList ::= StatementList Statement 
            {
              StatementNode RESULT =null;
		int slleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int slright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		StatementNode sl = (StatementNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		StatementNode s = (StatementNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new StatementNode(sl, s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("StatementList",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= StatementList EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		StatementNode start_val = (StatementNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // StatementList ::= 
            {
              StatementNode RESULT =null;
		  RESULT = new StatementNode(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("StatementList",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

