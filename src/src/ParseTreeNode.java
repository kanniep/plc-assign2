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
public class ParseTreeNode {

    private LinkedList<ParseTreeNode> nodeList;
    private Number value;
    private String name;
    private Type nodeType = Type.StatementList;
    private Operation nodeOperation = Operation.None;

    public static enum Type {

        StatementList,
        Statement,
        Expression,
        Term,
        Factor,
        Final
    }
    
    public static enum Operation {
        None,
        Add,
        Minus,
        Times,
        Divide
    }

    public ParseTreeNode() {
        nodeList = new LinkedList<>();
        value = null;
        name = null;
    }
    
    // Number --> Factor
    public ParseTreeNode(Number value) {
        this();
        this.value = value;
        this.nodeType = Type.Factor;
    }
    
    // Number
    public ParseTreeNode(Number value, Type nodeType) {
        this();
        this.value = value;
        this.nodeType = nodeType;
    }

    // Symbol --> Final
    public ParseTreeNode(Operation oper) {
        this();
        this.nodeOperation = oper;
        this.nodeType = Type.Final;
    }
    
    // ID --> Factor
    public ParseTreeNode(String name, Number value) {
        this();
        this.name = name;
        this.value = value;
        this.nodeType = Type.Factor;
    }
    
    // Assign variable from variable
    public ParseTreeNode(String name, ParseTreeNode node) {
        this();
        this.addNode(node);
        this.name = name;
        this.value = node.getValue();
        this.nodeType = Type.Statement;
    }
    
    // General inheritate
    public ParseTreeNode(ParseTreeNode node1, Operation oper, ParseTreeNode node2, Type nodeType) {
        this();
        this.addNode(node1);
        this.addNode(new ParseTreeNode(oper));
        this.addNode(node2);        
        this.nodeType = nodeType;
        if (oper == Operation.Add) {
            this.add(node1, node2);
        } else if (oper == Operation.Minus) {
            this.minus(node1, node2);
        } else if (oper == Operation.Times) {
            this.times(node1, node2);
        } else if (oper == Operation.Divide) {
            this.divide(node1, node2);
        }
    }

    // General inheritate
    public ParseTreeNode(ParseTreeNode node, Type nodeType) {
        this();
        this.addNode(node);
        this.value = node.getValue();
        this.name = node.getName();
        this.nodeType = nodeType;
    }

    public Number getValue() {
        return value;
    }

    public Integer intValue() {
        return (Integer) value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Type getNodeType() {
        return nodeType;
    }

    public void setNodeType(Type nodeType) {
        this.nodeType = nodeType;
    }

    public void addNode(ParseTreeNode newNode) {
        nodeList.add(newNode);
    }
    
    private static boolean hasDouble(Number value1, Number value2) {
        boolean hasDouble = value1 instanceof Double;
        hasDouble = value2 instanceof Double;
        return hasDouble;
    }
    
    private void assignValue(double dResult, boolean hasDouble) {
        if (!hasDouble) this.value = new Integer((int)dResult);
        else this.value =  new Double(dResult); 
    }
    
    public void add(ParseTreeNode node1, ParseTreeNode node2) {
        Number value1 = node1.getValue();
        Number value2 = node2.getValue();
        double dResult = value1.doubleValue() + value2.doubleValue();
        assignValue(dResult, hasDouble(value1, value2));
    }
    
    public void minus(ParseTreeNode node1, ParseTreeNode node2) {
        Number value1 = node1.getValue();
        Number value2 = node2.getValue();
        double dResult = value1.doubleValue() - value2.doubleValue();
        assignValue(dResult, hasDouble(value1, value2));
    }
    
    public void times(ParseTreeNode node1, ParseTreeNode node2) {
        Number value1 = node1.getValue();
        Number value2 = node2.getValue();
        double dResult = value1.doubleValue() * value2.doubleValue();
        assignValue(dResult, hasDouble(value1, value2));
    }
    
    public void divide(ParseTreeNode node1, ParseTreeNode node2) {
        Number value1 = node1.getValue();
        Number value2 = node2.getValue();
        double dResult = value1.doubleValue() / value2.doubleValue();
        assignValue(dResult, hasDouble(value1, value2));
    }
}
