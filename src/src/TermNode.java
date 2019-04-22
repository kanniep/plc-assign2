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
public class TermNode extends ParseTreeNode {
    public TermNode(FactorNode node) {
        super();
        this.addNode(node);
    }
    
    public TermNode(int symbol, TermNode node1, FactorNode node2) {
        super();
        this.addNode(node1);
        this.addNode(new TerminalNode(symbol));
        this.addNode(node2);
    }
}
