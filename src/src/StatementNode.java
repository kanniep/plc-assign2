/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author kannie
 */
public class StatementNode extends ParseTreeNode {

    public enum StatementType {
        Root,
        List,
        Expression,
        Assign,
        If,
        IfElse,
        WHILE,
        Print
    }

    private StatementType type = StatementType.Root;
    private static final int expIndex = 2, assignExpIndex = 1, state1Index = 5,
                             state2Index = 9;

    // Root node
    public StatementNode() {
        super();
    }

    // List of statements
    public StatementNode(StatementNode node1, StatementNode node2) {
        super();
        type = StatementType.List;
        node1.nodeList.stream().forEach(curNode -> {
            this.addNode(curNode);
        });
        this.addNode(node2);
    }

    // From an expression
    public StatementNode(ExpressionNode node) {
        super();
        type = StatementType.Expression;
        this.addNode(node);
        this.addNode(new TerminalNode(sym.SEMI));
    }

    // Assignment statement
    public StatementNode(String name, ExpressionNode node) {
        super();
        type = StatementType.Assign;
        this.setVariableName(name);
        this.addNode(new TerminalNode(sym.ASSIGN));
        this.addNode(node);
    }

    // If
    public StatementNode(int statementType, ExpressionNode eNode, StatementNode sNode) {
        super();
        if(statementType == sym.IF){
            type = StatementType.If;
            this.addNode(new TerminalNode(sym.IF));
        }else if(statementType == sym.WHILE){
            type = StatementType.WHILE;
            this.addNode(new TerminalNode(sym.WHILE));
        }
        
        this.addNode(new TerminalNode(sym.LPAREN));
        this.addNode(eNode);
        this.addNode(new TerminalNode(sym.RPAREN));
        this.addNode(new TerminalNode(sym.LBRACKET));
        this.addNode(sNode);
        this.addNode(new TerminalNode(sym.RBRACKET));
    }
    
    // Print statement
    public StatementNode(StatementType type, ExpressionNode node) {
        super();
        this.type = type;
        this.addNode(node);
    }

    // If else
    public StatementNode(ExpressionNode eNode, StatementNode sNode1, StatementNode sNode2) {
        super();
        type = StatementType.IfElse;
        this.addNode(new TerminalNode(sym.IF));
        this.addNode(new TerminalNode(sym.LPAREN));
        this.addNode(eNode);
        this.addNode(new TerminalNode(sym.RPAREN));
        this.addNode(new TerminalNode(sym.LBRACKET));
        this.addNode(sNode1);
        this.addNode(new TerminalNode(sym.RBRACKET));
        this.addNode(new TerminalNode(sym.ELSE));
        this.addNode(new TerminalNode(sym.LBRACKET));
        this.addNode(sNode2);
        this.addNode(new TerminalNode(sym.RBRACKET));
    }

    @Override
    public void run() {
        if (this.type == StatementType.Assign) {
            super.run();
            ParseTreeNode.varTable.put(this.getVariableName(),
                                       this.getChild(assignExpIndex).getValue());
        } else if (this.type == StatementType.If ||
                   this.type == StatementType.IfElse) {
            ExpressionNode expression = (ExpressionNode) this.getChild(expIndex);
            expression.run();
            Object curValue = expression.getValue();
            boolean isTrue = false;          
            if (curValue instanceof Boolean) {
                isTrue = ((Boolean) curValue);
            } else if (curValue instanceof Double) {
                isTrue = ((Double) curValue) != 0;
            } else if (curValue instanceof Integer) {
                isTrue = ((Integer) curValue) != 0;
            }
            if (isTrue) {                
                this.getChild(state1Index).run();
            } else if (this.type == StatementType.IfElse) {
                this.getChild(state2Index).run();
            }
        } else if(this.type == StatementType.WHILE){
            boolean isLoopTrue = true; 
            while(isLoopTrue){
                ExpressionNode expression = (ExpressionNode) this.getChild(expIndex);
                expression.run();
                Object curValue = expression.getValue();
                boolean isTrue = false;          
                if (curValue instanceof Boolean) {
                    isTrue = ((Boolean) curValue);
                } else if (curValue instanceof Double) {
                    isTrue = ((Double) curValue) != 0;
                } else if (curValue instanceof Integer) {
                    isTrue = ((Integer) curValue) != 0;
                }
                if (isTrue) {
                    this.getChild(state1Index).run();
                    System.out.print("true");
                    isLoopTrue = true;
                }else{
                    isLoopTrue = false;
                }
            }
            
        }else if (this.type == StatementType.Print) {
            ExpressionNode expression = (ExpressionNode) this.getChild(0);
            expression.run();
            Object curValue = expression.getValue();   
            System.out.print(curValue);
//            if (curValue instanceof Boolean) {
//                System.out.print(((Boolean) curValue));
//            } else if (curValue instanceof Double) {
//                System.out.print(((Double) curValue));
//                isTrue = ((Double) curValue) != 0;
//            } else if (curValue instanceof Integer) {
//                System.out.print(((Boolean) curValue));
//                isTrue = ((Integer) curValue) != 0;
//            }
        } else {
            super.run();
        }
    }
}
