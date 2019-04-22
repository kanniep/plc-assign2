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
    
    public StatementNode() {
        super();
    }
    
    public StatementNode(StatementNode node1, StatementNode node2) {
        super();
        node1.nodeList.stream().forEach(curNode -> {
            this.addNode(curNode);
        });
        this.addNode(node2);
    }
    
    public StatementNode(ExpressionNode node) {
        super();
        this.addNode(node);
        this.addNode(new TerminalNode(sym.SEMI));
    }
    
    public StatementNode(String name, ExpressionNode node) {
        super();
        this.addNode(new TerminalNode(name));
        this.addNode(new TerminalNode(sym.ASSIGN));
        this.addNode(node);
    }
    
    public StatementNode(ExpressionNode eNode, StatementNode sNode) {
        super();
        this.addNode(new TerminalNode(sym.IF));
        this.addNode(new TerminalNode(sym.LPAREN));
        this.addNode(eNode);
        this.addNode(new TerminalNode(sym.RPAREN));
        this.addNode(new TerminalNode(sym.LBRACKET));
        this.addNode(sNode);
        this.addNode(new TerminalNode(sym.RBRACKET));
    }
    
    public StatementNode(ExpressionNode eNode, StatementNode sNode1, StatementNode sNode2) {
        super();
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
}
