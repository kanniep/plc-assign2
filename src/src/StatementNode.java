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
        Declaration,
        DeclareAndAssign,
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
    
    // Declaration variable statement
    public StatementNode(int varType, String name) {
        super();
        type = StatementType.Declaration;
        this.addNode(new TerminalNode(varType));
        this.setVariableName(name);
        
        if(varType == sym.INT){
            this.setVariableType(sym.INT);
        }else if (varType == sym.DOUBLE){
            this.setVariableType(sym.DOUBLE);
        }else if (varType == sym.BOOLEAN){
            this.setVariableType(sym.BOOLEAN);
        }
        
        this.setVariable(null, varType);
    }
    
    // Declaration and assign value of variable statement
    public StatementNode(int varType, String name, ExpressionNode node) {
        super();
        type = StatementType.DeclareAndAssign;
        this.addNode(new TerminalNode(varType));
        this.setVariableName(name);
        this.addNode(new TerminalNode(sym.ASSIGN));
        this.addNode(node);
        
        if(varType == sym.INT){
            this.setVariableType(sym.INT);
        }else if (varType == sym.DOUBLE){
            this.setVariableType(sym.DOUBLE);
        }else if (varType == sym.BOOLEAN){
            this.setVariableType(sym.BOOLEAN);
        }
        
    }

    // Assignment statement
    public StatementNode(String name, ExpressionNode node) {
        super();
        type = StatementType.Assign;
        this.setVariableName(name);
        this.addNode(new TerminalNode(sym.ASSIGN));
        this.addNode(node);
    }

    // If and While
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
            if(ParseTreeNode.varTable.containsKey(this.getVariableName())){
                Object curValue = this.getChild(assignExpIndex).getValue();
                Variable v = (Variable) ParseTreeNode.varTable.get(this.getVariableName());
                int varType = v.getVarType();
                this.setVariable(this.getChild(assignExpIndex).getValue(), varType);
                if( curValue instanceof Integer && varType == sym.INT ){
                    ParseTreeNode.varTable.put(this.getVariableName(),
                                       this.getVariable());
                }
                else if( curValue instanceof Double && varType == sym.DOUBLE ){
                    ParseTreeNode.varTable.put(this.getVariableName(),
                                       this.getVariable());
                }else if( curValue instanceof Boolean && varType == sym.BOOLEAN ){
                    ParseTreeNode.varTable.put(this.getVariableName(),
                                       this.getVariable());
                }else {
                    //System.out.println(varType);
                    System.out.println("value of "+ this.getVariableName() + " variable is incompatible for this type");
                    System.exit(0);
                }
            }else{
                
                System.out.println("variable "+this.getVariableName()+" doesn't exist");
                System.exit(0);
            }
        } else if (this.type == StatementType.Declaration){
            super.run();
            ParseTreeNode.varTable.put(this.getVariableName(),
                                       this.getVariable());
            //Variable v = (Variable) ParseTreeNode.varTable.get(this.getVariableName());
            //System.out.println(v.getVarValue());
        } else if(this.type == StatementType.DeclareAndAssign){
            ExpressionNode expression = (ExpressionNode) this.getChild(expIndex);
            expression.run();
            Object curValue = expression.getValue();
            
            if (curValue instanceof Integer && this.getVariableType() == sym.INT) {
                this.setVariable(curValue, this.getVariableType());
                ParseTreeNode.varTable.put(this.getVariableName(),
                                       this.getVariable());
            } else if (curValue instanceof Double && this.getVariableType() == sym.DOUBLE) {
                this.setVariable(curValue, this.getVariableType());
                ParseTreeNode.varTable.put(this.getVariableName(),
                                       this.getVariable());
            } else if (curValue instanceof Boolean && this.getVariableType() == sym.BOOLEAN) {
                this.setVariable(curValue, this.getVariableType());
                ParseTreeNode.varTable.put(this.getVariableName(),
                                       this.getVariable());
            } else{
                //System.out.println(this.getVariableType());
                System.out.print("value of "+ this.getVariableName() + " variable is incompatible for this type");
                System.exit(0);
            }
        }else if (this.type == StatementType.If || 
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
                this.run();
            }          
            
        }else if (this.type == StatementType.Print) {
            ExpressionNode expression = (ExpressionNode) this.getChild(0);
            expression.run();
            Object curValue = expression.getValue();   
            System.out.println(curValue);
        } else {
            super.run();
        }
    }
}
