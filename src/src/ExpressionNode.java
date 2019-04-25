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
public class ExpressionNode extends ParseTreeNode {
    private boolean hasOperation = false;
    
    public ExpressionNode(TermNode node) {
        super();
        this.addNode(node);
    }
    
    public ExpressionNode(int symbol, ExpressionNode node1, TermNode node2) {
        super();
        this.addNode(node1);
        this.addNode(new TerminalNode(symbol));
        this.addNode(node2);
        this.hasOperation = true;
    }
    
    public ExpressionNode(int symbol, ExpressionNode node1, ExpressionNode node2){
        super();
        this.addNode(node1);
        this.addNode(new TerminalNode(symbol));
        this.addNode(node2);
        this.hasOperation = true;
    }
    
    public void add() {
        Number value1 = (Number) this.nodeList.get(0).getValue();
        Number value2 = (Number) this.nodeList.get(2).getValue();
        double dResult = value1.doubleValue() + value2.doubleValue();
        this.assignNumberValue(dResult, ParseTreeNode.hasDouble(value1, value2));
    }
    
    public void minus() {
        Number value1 = (Number) this.nodeList.get(0).getValue();
        Number value2 = (Number) this.nodeList.get(2).getValue();
        double dResult = value1.doubleValue() - value2.doubleValue();
        this.assignNumberValue(dResult, hasDouble(value1, value2));
    }
    
    public void lessThan() {
        ExpressionNode expression1 = (ExpressionNode) this.getChild(0);
        expression1.run();
        Number value1 = (Number) expression1.getValue();
        
        ExpressionNode expression2 = (ExpressionNode) this.getChild(2);
        expression2.run();
        Number value2 = (Number) expression2.getValue();
        
        boolean dResult = value1.doubleValue() < value2.doubleValue();
        this.assignBooleanValue(dResult);
        
    }
    
    public void lessThanEqual() {
        ExpressionNode expression1 = (ExpressionNode) this.getChild(0);
        expression1.run();
        Number value1 = (Number) expression1.getValue();
        
        ExpressionNode expression2 = (ExpressionNode) this.getChild(2);
        expression2.run();
        Number value2 = (Number) expression2.getValue();
        
        boolean dResult = value1.doubleValue() <= value2.doubleValue();
        this.assignBooleanValue(dResult);
        
    }
    
    public void equal() {
        ExpressionNode expression1 = (ExpressionNode) this.getChild(0);
        expression1.run();
        Number value1 = (Number) expression1.getValue();
        
        ExpressionNode expression2 = (ExpressionNode) this.getChild(2);
        expression2.run();
        Number value2 = (Number) expression2.getValue();
        
        boolean dResult = value1.doubleValue() == value2.doubleValue();
        this.assignBooleanValue(dResult);
        
    }
    
    public void greaterThan() {
        ExpressionNode expression1 = (ExpressionNode) this.getChild(0);
        expression1.run();
        Number value1 = (Number) expression1.getValue();
        
        ExpressionNode expression2 = (ExpressionNode) this.getChild(2);
        expression2.run();
        Number value2 = (Number) expression2.getValue();
        
        boolean dResult = value1.doubleValue() > value2.doubleValue();
        this.assignBooleanValue(dResult);
        
    }
    
    public void greaterThanEqual() {
        ExpressionNode expression1 = (ExpressionNode) this.getChild(0);
        expression1.run();
        Number value1 = (Number) expression1.getValue();
        
        ExpressionNode expression2 = (ExpressionNode) this.getChild(2);
        expression2.run();
        Number value2 = (Number) expression2.getValue();
        
        boolean dResult = value1.doubleValue() >= value2.doubleValue();
        this.assignBooleanValue(dResult);
        
    }
    
    @Override
    public void run() {
        super.run();
        if (this.hasOperation) {
            switch(this.nodeList.get(1).getSymbol()) {
                case sym.PLUS: this.add(); break;
                case sym.MINUS: this.minus(); break;
                case sym.LT: this.lessThan(); break;
                case sym.LE: this.lessThanEqual(); break;
                case sym.EQ: this.equal(); break;
                case sym.GT: this.greaterThan(); break;
                case sym.GE: this.greaterThanEqual(); break;
            }
        } else {
            this.setValue(this.nodeList.get(0).getValue());
        }
    }
}
