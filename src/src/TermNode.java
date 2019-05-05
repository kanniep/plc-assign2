/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.LinkedList;

/**
 *
 * @author kannie
 */
public class TermNode extends ParseTreeNode {
    private boolean hasOperation = false;
    
    public TermNode(FactorNode node) {
        super();
        this.addNode(node);
    }
    
    public TermNode(int symbol, TermNode node1, FactorNode node2) {
        super();
        this.addNode(node1);
        this.addNode(new TerminalNode(symbol));
        this.addNode(node2);
        this.hasOperation = true;
    }
    
    public void times() {
        Number value1 = (Number) this.nodeList.get(0).getValue();
        Number value2 = (Number) this.nodeList.get(2).getValue();
        double dResult = value1.doubleValue() * value2.doubleValue();
        this.assignNumberValue(dResult, hasDouble(value1, value2));
    }
    
    public void divide() {
        Number value1 = (Number) this.nodeList.get(0).getValue();
        Number value2 = (Number) this.nodeList.get(2).getValue();
        double dResult = value1.doubleValue() / value2.doubleValue();
        this.assignNumberValue(dResult, hasDouble(value1, value2));
    }
    
    @Override
    public void run(LinkedList<String> functionNameList) {
        super.run(functionNameList);
        if (this.hasOperation) {
            switch(this.nodeList.get(1).getSymbol()) {
                case sym.TIMES: this.times(); break;
                case sym.DIVIDE: this.divide(); break;
            }
        } else {
            this.inheritFrom(this.getChild(0));
        }
    }
}
