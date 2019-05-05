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
    public static Hashtable functionTable = new Hashtable();
    public static Hashtable functionVariableTable = new Hashtable();

    protected LinkedList<ParseTreeNode> nodeList;
    protected Object value;
    private int symbol;
    private String variableName = null;
    private int variableType;
    
    private Variable var;
    
    protected LinkedList<Variable> paramList;

    public ParseTreeNode() {
        nodeList = new LinkedList<>();
        paramList = new LinkedList<>();
        value = null;
    }
    
    public void addParamList(Variable v){
        paramList.add(v);
    }
    
    public LinkedList gerParamList(){
        return this.paramList;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getSymbol() {
        return symbol;
    }

    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }
    
    public int getVariableType() {
        return variableType;
    }

    public void setVariableType(int variableType) {
        this.variableType = variableType;
    }
    
    //////////////////////////////////////////
    public Variable getVariable() {
        return var;
    }

    public void setVariable(Object value, int variableType) {
        this.var = new Variable(value, variableType);
    }
    //////////////////////////////////////////
    
    public void inheritFrom(ParseTreeNode node) {
        this.symbol = node.getSymbol();
        this.value = node.getValue();
        this.variableName = node.getVariableName();
    }

    public void addNode(ParseTreeNode newNode) {
        nodeList.add(newNode);
    }
    
    public ParseTreeNode getChild(int index) {
        return this.nodeList.get(index);
    }
    
    public void run() {
        this.nodeList.stream().forEachOrdered(node -> {
           node.run();
        });
    }
    
    public void run(String functionName) {
        this.nodeList.stream().forEachOrdered(node -> {
           node.run(functionName);
        });
    }
    
    protected static boolean hasDouble(Number value1, Number value2) {
        return (value1 instanceof Double) || (value2 instanceof Double);
    }
    
    protected void assignNumberValue(double dResult, boolean hasDouble) {
        if (!hasDouble) this.value = (int)dResult;
        else {
            this.value =  dResult;
        } 
    }
    
    protected void assignBooleanValue(boolean dResult) {
        this.value =  dResult; 
    }
}
