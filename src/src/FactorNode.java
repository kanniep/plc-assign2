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
public class FactorNode extends ParseTreeNode {
    public FactorNode(ParseTreeNode node) {
        super();
        this.addNode(node);
    }
}
