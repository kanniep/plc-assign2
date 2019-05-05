/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void run(LinkedList<String> functionNameList) {
        // Run only when call variable.
        if (this.getVariableName() != null){
            Object curValue = ParseTreeNode.getVariableFromTable(functionNameList, this.getVariableName());
            if (curValue instanceof Variable){
                Variable v = (Variable) curValue;
                this.setValue(v.getVarValue());
            }else{
                this.setValue(curValue);
            }
        }
    }
}
