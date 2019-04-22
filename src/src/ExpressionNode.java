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
    public ExpressionNode(TermNode node) {
        super();
        this.addNode(node);
    }
    
    public ExpressionNode(int symbol, ExpressionNode node1, TermNode node2) {
        super();
        this.addNode(node1);
        this.addNode(new TerminalNode(symbol));
        this.addNode(node2);
    }
}
