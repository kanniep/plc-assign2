/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Hashtable;
import java.util.LinkedList;

/**
 *
 * @author kannie
 */
public abstract class ParseTreeNode {
    public static Hashtable varTable = new Hashtable();

    protected LinkedList<ParseTreeNode> nodeList;
    private Object value;
    private int name;

    public ParseTreeNode() {
        nodeList = new LinkedList<>();
        value = null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
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
    
    public void add() {
        Number value1 = (Number) this.nodeList.get(0).getValue();
        Number value2 = (Number) this.nodeList.get(2).getValue();
        double dResult = value1.doubleValue() + value2.doubleValue();
        assignValue(dResult, hasDouble(value1, value2));
    }
    
    public void minus() {
        Number value1 = (Number) this.nodeList.get(0).getValue();
        Number value2 = (Number) this.nodeList.get(2).getValue();
        double dResult = value1.doubleValue() - value2.doubleValue();
        assignValue(dResult, hasDouble(value1, value2));
    }
    
    public void times() {
        Number value1 = (Number) this.nodeList.get(0).getValue();
        Number value2 = (Number) this.nodeList.get(2).getValue();
        double dResult = value1.doubleValue() * value2.doubleValue();
        assignValue(dResult, hasDouble(value1, value2));
    }
    
    public void divide() {
        Number value1 = (Number) this.nodeList.get(0).getValue();
        Number value2 = (Number) this.nodeList.get(2).getValue();
        double dResult = value1.doubleValue() / value2.doubleValue();
        assignValue(dResult, hasDouble(value1, value2));
    }
    
    public void run() {
        this.nodeList.stream().forEach(node -> {
           node.run();
        });
    }
}
