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
public class TerminalNode extends ParseTreeNode {
    
    // Symbol
    public TerminalNode(int name) {
        super();
        this.setSymbol(name);
    }
    
    // Number and Boolean
    public TerminalNode(Object value) {
        super();
        this.setValue(value);
    }
    
    // Variable
    public TerminalNode(String name) {
        super();
        this.setVariableName(name);
    }
    
    @Override
    public void run() {
        // Run only when call variable.
        if (this.getVariableName() != null)
            this.setValue(ParseTreeNode.varTable.get(this.getVariableName()));
    }
}
