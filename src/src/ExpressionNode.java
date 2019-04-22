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
    
    @Override
    public void run() {
        super.run();
        if (this.hasOperation) {
            switch(this.nodeList.get(1).getSymbol()) {
                case sym.PLUS: this.add(); break;
                case sym.MINUS: this.minus(); break;
            }
        } else {
            this.setValue(this.nodeList.get(0).getValue());
        }
    }
}
