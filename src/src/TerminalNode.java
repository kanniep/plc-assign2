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
    private String variableName = null;
    
    public TerminalNode(int name) {
        super();
        this.setName(name);
    }
    
    public TerminalNode(Integer value) {
        super();
        this.setValue(value);
    }
    
    public TerminalNode(Double value) {
        super();
        this.setValue(value);
    }
    public TerminalNode(String name) {
        super();
        this.variableName = name;
    }
}
