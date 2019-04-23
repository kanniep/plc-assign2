
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Apr 23 13:23:19 ICT 2019
//----------------------------------------------------

package src;

import java.util.*;
import java.io.*;
import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Apr 23 13:23:19 ICT 2019
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
    "\000\022\000\002\002\002\000\002\002\004\000\002\002" +
    "\004\000\002\003\006\000\002\003\004\000\002\003\011" +
    "\000\002\003\015\000\002\003\007\000\002\004\005\000" +
    "\002\004\005\000\002\004\003\000\002\005\005\000\002" +
    "\005\005\000\002\005\003\000\002\006\003\000\002\006" +
    "\003\000\002\006\003\000\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\020\002\001\011\001\021\001\026\001\027" +
    "\001\030\001\031\001\001\002\000\020\002\006\011\017" +
    "\021\010\026\016\027\005\030\014\031\013\001\002\000" +
    "\016\004\ufff3\005\ufff3\006\ufff3\007\ufff3\012\ufff3\025\ufff3" +
    "\001\002\000\004\002\000\001\002\000\010\004\023\005" +
    "\024\025\054\001\002\000\004\011\042\001\002\000\020" +
    "\002\uffff\011\uffff\021\uffff\026\uffff\027\uffff\030\uffff\031" +
    "\uffff\001\002\000\016\004\ufff7\005\ufff7\006\027\007\026" +
    "\012\ufff7\025\ufff7\001\002\000\016\004\ufff1\005\ufff1\006" +
    "\ufff1\007\ufff1\010\037\025\ufff1\001\002\000\016\004\ufff2" +
    "\005\ufff2\006\ufff2\007\ufff2\012\ufff2\025\ufff2\001\002\000" +
    "\016\004\ufff4\005\ufff4\006\ufff4\007\ufff4\012\ufff4\025\ufff4" +
    "\001\002\000\004\011\033\001\002\000\012\011\017\027" +
    "\005\030\014\031\020\001\002\000\016\004\ufff1\005\ufff1" +
    "\006\ufff1\007\ufff1\012\ufff1\025\ufff1\001\002\000\010\004" +
    "\023\005\024\012\022\001\002\000\016\004\ufff0\005\ufff0" +
    "\006\ufff0\007\ufff0\012\ufff0\025\ufff0\001\002\000\012\011" +
    "\017\027\005\030\014\031\020\001\002\000\012\011\017" +
    "\027\005\030\014\031\020\001\002\000\016\004\ufff8\005" +
    "\ufff8\006\027\007\026\012\ufff8\025\ufff8\001\002\000\012" +
    "\011\017\027\005\030\014\031\020\001\002\000\012\011" +
    "\017\027\005\030\014\031\020\001\002\000\016\004\ufff6" +
    "\005\ufff6\006\ufff6\007\ufff6\012\ufff6\025\ufff6\001\002\000" +
    "\016\004\ufff5\005\ufff5\006\ufff5\007\ufff5\012\ufff5\025\ufff5" +
    "\001\002\000\016\004\ufff9\005\ufff9\006\027\007\026\012" +
    "\ufff9\025\ufff9\001\002\000\012\011\017\027\005\030\014" +
    "\031\020\001\002\000\010\004\023\005\024\012\035\001" +
    "\002\000\004\025\036\001\002\000\022\002\ufffa\011\ufffa" +
    "\021\ufffa\024\ufffa\026\ufffa\027\ufffa\030\ufffa\031\ufffa\001" +
    "\002\000\012\011\017\027\005\030\014\031\020\001\002" +
    "\000\010\004\023\005\024\025\041\001\002\000\022\002" +
    "\ufffe\011\ufffe\021\ufffe\024\ufffe\026\ufffe\027\ufffe\030\ufffe" +
    "\031\ufffe\001\002\000\012\011\017\027\005\030\014\031" +
    "\020\001\002\000\010\004\023\005\024\012\044\001\002" +
    "\000\004\023\045\001\002\000\016\011\017\021\010\026" +
    "\016\027\005\030\014\031\013\001\002\000\004\024\047" +
    "\001\002\000\024\002\ufffc\011\ufffc\021\ufffc\022\050\024" +
    "\ufffc\026\ufffc\027\ufffc\030\ufffc\031\ufffc\001\002\000\004" +
    "\023\051\001\002\000\016\011\017\021\010\026\016\027" +
    "\005\030\014\031\013\001\002\000\004\024\053\001\002" +
    "\000\022\002\ufffb\011\ufffb\021\ufffb\024\ufffb\026\ufffb\027" +
    "\ufffb\030\ufffb\031\ufffb\001\002\000\022\002\ufffd\011\ufffd" +
    "\021\ufffd\024\ufffd\026\ufffd\027\ufffd\030\ufffd\031\ufffd\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\004\002\003\001\001\000\012\003\010\004" +
    "\006\005\011\006\014\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\004\020\005" +
    "\011\006\014\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\005\031\006\014\001\001\000" +
    "\006\005\024\006\014\001\001\000\002\001\001\000\004" +
    "\006\030\001\001\000\004\006\027\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\004\033" +
    "\005\011\006\014\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\004\037\005\011\006\014" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\004" +
    "\042\005\011\006\014\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\003\045\004\006\005\011\006\014\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\003\051\004\006\005\011\006\014\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

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
          case 17: // Factor ::= LPAREN Expression RPAREN 
            {
              FactorNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  RESULT = new FactorNode(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Factor ::= ID 
            {
              FactorNode RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new FactorNode(new TerminalNode(id)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Factor ::= REAL 
            {
              FactorNode RESULT =null;
		int realleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int realright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double real = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new FactorNode(new TerminalNode(real)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Factor ::= NUMBER 
            {
              FactorNode RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer num = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new FactorNode(new TerminalNode(num)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Term ::= Factor 
            {
              TermNode RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		FactorNode f = (FactorNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new TermNode(f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Term ::= Term DIVIDE Factor 
            {
              TermNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		TermNode t = (TermNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		FactorNode f = (FactorNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new TermNode(sym.DIVIDE, t, f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Term ::= Term TIMES Factor 
            {
              TermNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		TermNode t = (TermNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		FactorNode f = (FactorNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new TermNode(sym.TIMES, t, f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Expression ::= Term 
            {
              ExpressionNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		TermNode t = (TermNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(t); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Expression ::= Expression MINUS Term 
            {
              ExpressionNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		TermNode t = (TermNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(sym.MINUS, e, t); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Expression ::= Expression PLUS Term 
            {
              ExpressionNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		TermNode t = (TermNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = new ExpressionNode(sym.PLUS, e, t); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Statement ::= PRINT LPAREN Expression RPAREN SEMI 
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
          case 6: // Statement ::= IF LPAREN Expression RPAREN LBRACKET Statement RBRACKET ELSE LBRACKET Statement RBRACKET 
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
          case 5: // Statement ::= IF LPAREN Expression RPAREN LBRACKET Statement RBRACKET 
            {
              StatementNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		StatementNode s = (StatementNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  RESULT = new StatementNode(e, s); 
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

