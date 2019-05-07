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
    public static Hashtable functionParamsTable = new Hashtable();

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
        LinkedList<String> functionNameList = new LinkedList<>();
        functionNameList.add("global");
        this.nodeList.stream().forEachOrdered(node -> {
           node.run(functionNameList);
        });
    }
    
    public void run(LinkedList<String> functionNameList) {
        this.nodeList.stream().forEachOrdered(node -> {
           node.run(functionNameList);
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
    
    static protected Object getVariableFromTable(LinkedList<String> functionNameList, String variableName) {
        Object result = null;
        for(int i=0; i< functionNameList.size(); i++) {
            String curFunctionName = functionNameList.get(i);
            Hashtable curTable = (Hashtable) ParseTreeNode.functionVariableTable.get(curFunctionName);
            if (curTable != null && curTable.containsKey(variableName)) {
                return curTable.get(variableName);
            }
        }
//        throw new Exception("Variable " + variableName + " not found");
        System.out.println("Variable " + variableName + " not found");
        return null;
    }
    
    protected boolean checkParams(String functionName, int paramIndex) {
        boolean curResult = false;
        LinkedList curParamList = (LinkedList) ParseTreeNode.functionParamsTable.get(functionName); // list of params of this function
        Variable curVar = (Variable) (curParamList).get(paramIndex); // get param variable object from params list by using specific paramIndex
        Object childValue = this.getChild(0).value; // get value that is passed as a parameter
        // if param type and type of value that is passed as a parameter is match
        if (curVar.VarType == sym.INT && childValue instanceof Integer ||
            curVar.VarType == sym.DOUBLE && childValue instanceof Double||
            curVar.VarType == sym.BOOLEAN && childValue instanceof Boolean||
            curVar.VarType == sym.CHARACTER && childValue instanceof Character  ) { 
            curVar.setVarValue(childValue);
            // get hashtable of this function                                   put param name as a key and value is param value
            ((Hashtable) ParseTreeNode.functionVariableTable.get(functionName)).put(curVar.name, curVar);
            curResult = true;
        } else {
            curResult = false;
        }
        // if have next param ( param that put by user )
        if (this.nodeList.size() == 2) {
            if (curParamList.size() == paramIndex + 1) {
                System.out.println("Too many params");
                return false;
            }
            return curResult && this.getChild(1).checkParams(functionName, paramIndex + 1); // check next param
        } else { // if doesn't have next param
            if (curParamList.size() != paramIndex + 1) { // param that function require is more than this
                System.out.println("Needed more params");
                return false;
            }
            return curResult;
        }
    }
}
