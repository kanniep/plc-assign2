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
public class StatementNode extends ParseTreeNode {

    public enum StatementType {

        Root,
        List,
        Expression,
        Declaration,
        DeclareAndAssign,
        Assign,
        If,
        IfElse,
        WHILE,
        Print,
        FunctionParam,
        Function,
        FunctionCall,
        FunctionCallWithParam,
        FunctionWithOutParam,
    }

    private StatementType type = StatementType.Root;
    private static final int expIndex = 2, assignExpIndex = 1, state1Index = 5,
            state2Index = 9;
    protected String functionName = null;

    // Root node
    public StatementNode() {
        super();
        this.functionName = "global";
        ParseTreeNode.functionVariableTable.put("global", new Hashtable());
    }

    public StatementNode(String functionName) {
        super();
        this.functionName = functionName;
    }

    // List of statements
    public StatementNode(StatementNode node1, StatementNode node2) {
        super();
        type = StatementType.List;
        node1.nodeList.stream().forEachOrdered(curNode -> {
            this.addNode((ParseTreeNode) curNode);
        });
        this.addNode(node2);
    }
    
    // Function Call with params
    public StatementNode(ExpressionNode node, String funcName) {
        super();
        type = StatementType.FunctionCallWithParam;
        this.setVariableName(funcName);
        this.addNode(node);
        this.addNode(new TerminalNode(sym.SEMI));
    }
    
    // Function Call
    public StatementNode(String funcName, String notUse) {
        super();
        type = StatementType.FunctionCall;
        this.setVariableName(funcName);
        this.addNode(new TerminalNode(sym.SEMI));
    }

    // From an expression
    public StatementNode(ExpressionNode node) {
        super();
        type = StatementType.Expression;
        this.addNode(node);
        this.addNode(new TerminalNode(sym.SEMI));
    }

    // function parameter
    public StatementNode(int func, int varType, String name) {
        super();

        type = StatementType.FunctionParam;
        this.addNode(new TerminalNode(varType));
        this.setVariableName(name);

        if (varType == sym.INT) {
            this.setVariableType(sym.INT);
        } else if (varType == sym.DOUBLE) {
            this.setVariableType(sym.DOUBLE);
        } else if (varType == sym.BOOLEAN) {
            this.setVariableType(sym.BOOLEAN);
        } else if (varType == sym.CHARACTER) {
            this.setVariableType(sym.CHARACTER);
        }
    }

    // function parameter ...
    public StatementNode(int func, int varType, String name, StatementNode node) {
        this(func, varType, name);
        this.addNode(node);
    }

    // Declaration variable statement
    public StatementNode(int varType, String name) {
        super();

        type = StatementType.Declaration;
        this.addNode(new TerminalNode(varType));
        this.setVariableName(name);

        if (varType == sym.INT) {
            this.setVariableType(sym.INT);
        } else if (varType == sym.DOUBLE) {
            this.setVariableType(sym.DOUBLE);
        } else if (varType == sym.BOOLEAN) {
            this.setVariableType(sym.BOOLEAN);
        } else if (varType == sym.CHARACTER) {
            this.setVariableType(sym.CHARACTER);
        }

        this.setVariable(null, varType);

    }

    // Declaration and assign value of variable statement
    public StatementNode(int varType, String name, ExpressionNode node) {
        super();
        type = StatementType.DeclareAndAssign;
        this.addNode(new TerminalNode(varType));
        this.setVariableName(name);
        this.addNode(new TerminalNode(sym.ASSIGN));
        this.addNode(node);

        if (varType == sym.INT) {
            this.setVariableType(sym.INT);
        } else if (varType == sym.DOUBLE) {
            this.setVariableType(sym.DOUBLE);
        } else if (varType == sym.BOOLEAN) {
            this.setVariableType(sym.BOOLEAN);
        } else if (varType == sym.CHARACTER) {
            this.setVariableType(sym.CHARACTER);
        }

    }

    // Assignment statement
    public StatementNode(String name, ExpressionNode node) {
        super();
        type = StatementType.Assign;
        this.setVariableName(name);
        this.addNode(new TerminalNode(sym.ASSIGN));
        this.addNode(node);
    }

    // function declaration
    public StatementNode(int func, String funcName, StatementNode param, StatementNode sNode) {
        type = StatementType.Function;

        this.addNode(new TerminalNode(func));
        this.setVariableName(funcName);
        this.addNode(new TerminalNode(sym.LPAREN));
        this.addNode(param);
        this.addNode(new TerminalNode(sym.RPAREN));
        this.addNode(new TerminalNode(sym.LBRACKET));
        this.addNode(sNode);
        this.addNode(new TerminalNode(sym.RBRACKET));
    }
    
    // function declaration without param
    public StatementNode(int func, String funcName, StatementNode sNode) {
        type = StatementType.FunctionWithOutParam;

        this.addNode(new TerminalNode(func));
        this.setVariableName(funcName);
        this.addNode(new TerminalNode(sym.LPAREN));
        this.addNode(new TerminalNode(sym.RPAREN));
        this.addNode(new TerminalNode(sym.LBRACKET));
        this.addNode(sNode);
        this.addNode(new TerminalNode(sym.RBRACKET));
    }

    // If and While
    public StatementNode(int statementType, ExpressionNode eNode, StatementNode sNode) {
        super();
        if (statementType == sym.IF) {
            type = StatementType.If;
            this.addNode(new TerminalNode(sym.IF));
        } else if (statementType == sym.WHILE) {
            type = StatementType.WHILE;
            this.addNode(new TerminalNode(sym.WHILE));
        }

        this.addNode(new TerminalNode(sym.LPAREN));
        this.addNode(eNode);
        this.addNode(new TerminalNode(sym.RPAREN));
        this.addNode(new TerminalNode(sym.LBRACKET));
        this.addNode(sNode);
        this.addNode(new TerminalNode(sym.RBRACKET));
    }

    // Print statement
    public StatementNode(StatementType type, ExpressionNode node) {
        super();
        this.type = type;
        this.addNode(node);
    }

    // If else
    public StatementNode(ExpressionNode eNode, StatementNode sNode1, StatementNode sNode2) {
        super();
        type = StatementType.IfElse;
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

    @Override
    public void run(LinkedList<String> functionNameList) {
        Hashtable curVariableTable = (Hashtable) ParseTreeNode.functionVariableTable.get(functionNameList.get(0));
        // assign the value to variable, that means we need to have that variable name exist in the table and type of value is match with var type
        if (this.type == StatementType.Assign) {
            super.run(functionNameList);
            if (curVariableTable.containsKey(this.getVariableName())) { // if the current table has this variable
                Object curValue = this.getChild(assignExpIndex).getValue(); // get value that we want to assign by getting from expression node
                Variable v = (Variable) curVariableTable.get(this.getVariableName()); // get variable object by using variable name as a key
                int varType = v.getVarType(); // get type of variable
                this.setVariable(this.getChild(assignExpIndex).getValue(), varType); // set the variable by passing value and type
                if (curValue instanceof Integer && varType == sym.INT) { // check type of value which we want to assign that match with type of variable
                    curVariableTable.put(this.getVariableName(), // if match, put variable name and variable object(value, type) into the current table
                            this.getVariable());
                } else if (curValue instanceof Double && varType == sym.DOUBLE) {
                    curVariableTable.put(this.getVariableName(),
                            this.getVariable());
                } else if (curValue instanceof Boolean && varType == sym.BOOLEAN) {
                    curVariableTable.put(this.getVariableName(),
                            this.getVariable());
                } else if (curValue instanceof Character && varType == sym.CHARACTER) {
                    curVariableTable.put(this.getVariableName(),
                            this.getVariable());
                } else { // if not match, show message
                    //System.out.println(curValue);
                    //System.out.println(varType);
                    System.out.println("value of " + this.getVariableName() + " variable is incompatible for this type");
                    System.exit(0);
                }
            } else { // if the current table doesn't have this variable, show message

                System.out.println("variable " + this.getVariableName() + " doesn't exist");
                System.exit(0);
            }
        } else if (this.type == StatementType.Declaration) { // declaration of variable, need type and variable name
            super.run(functionNameList);
            curVariableTable.put(this.getVariableName(), // put var name and var object(value(should be null), type) into the current table
                    this.getVariable());
            //Variable v = (Variable) ParseTreeNode.varTable.get(this.getVariableName());
            //System.out.println(v.getVarValue());
        } else if (this.type == StatementType.DeclareAndAssign) { // declare and assign value to var, need to check that type of value is match with var type
            ExpressionNode expression = (ExpressionNode) this.getChild(expIndex);
            expression.run(functionNameList);
            Object curValue = expression.getValue(); // get value that we want to assign into var by running expression node

            if (curValue instanceof Integer && this.getVariableType() == sym.INT) { // check type of value which we want to assign that match with type of variable
                this.setVariable(curValue, this.getVariableType()); // set the variable object by passing value and type
                curVariableTable.put(this.getVariableName(), // if match, put variable name and variable object(value, type) into the current table
                        this.getVariable());
            } else if (curValue instanceof Double && this.getVariableType() == sym.DOUBLE) {
                this.setVariable(curValue, this.getVariableType());
                curVariableTable.put(this.getVariableName(),
                        this.getVariable());
            } else if (curValue instanceof Boolean && this.getVariableType() == sym.BOOLEAN) {
                this.setVariable(curValue, this.getVariableType());
                curVariableTable.put(this.getVariableName(),
                        this.getVariable());
            } else if (curValue instanceof Character && this.getVariableType() == sym.CHARACTER) {
                this.setVariable(curValue, this.getVariableType());
                curVariableTable.put(this.getVariableName(),
                        this.getVariable());
            } else { // if not match, show message
                //System.out.println(this.getVariableType());
                //System.out.println(curValue);
                //System.out.println(this.getVariableType());
                System.out.print("value of " + this.getVariableName() + " variable is incompatible for this type");
                System.exit(0);
            }
        } else if (this.type == StatementType.If
                || this.type == StatementType.IfElse) {
            ExpressionNode expression = (ExpressionNode) this.getChild(expIndex); // running condition expression
            expression.run(functionNameList);
            Object curValue = expression.getValue();
            boolean isTrue = false;
            if (curValue instanceof Boolean) {
                isTrue = ((Boolean) curValue);
            } else if (curValue instanceof Double) {
                isTrue = ((Double) curValue) != 0;
            } else if (curValue instanceof Integer) {
                isTrue = ((Integer) curValue) != 0;
            }
            if (isTrue) { // condition passed, running statement inside
                this.getChild(state1Index).run(functionNameList);
            } else if (this.type == StatementType.IfElse) {
                this.getChild(state2Index).run(functionNameList);
            }
        } else if (this.type == StatementType.WHILE) { // same way with if else
            ExpressionNode expression = (ExpressionNode) this.getChild(expIndex);
            expression.run(functionNameList);
            Object curValue = expression.getValue();
            boolean isTrue = false;
            if (curValue instanceof Boolean) {
                isTrue = ((Boolean) curValue);
            } else if (curValue instanceof Double) {
                isTrue = ((Double) curValue) != 0;
            } else if (curValue instanceof Integer) {
                isTrue = ((Integer) curValue) != 0;
            }
            if (isTrue) {
                this.getChild(state1Index).run(functionNameList);
                this.run(functionNameList);
            }

        } else if (this.type == StatementType.Print) {
            ExpressionNode expression = (ExpressionNode) this.getChild(0);
            expression.run(functionNameList);
            Object curValue = expression.getValue();
            System.out.println(curValue);
            
        } else if (this.type == StatementType.Function) { // function declaration with parameter require
            ParseTreeNode.functionVariableTable.put(this.getVariableName(), new Hashtable()); // add function name as a key and value is a new has table
            ParseTreeNode.functionTable.put(this.getVariableName(), this.nodeList.get(5)); // add function name as a key and value is list of node of statement inside this function
            ParseTreeNode.functionParamsTable.put(this.getVariableName(), new LinkedList<Variable>()); // add function name as a key and value is list of variable(parameter) for this function
            LinkedList<String> newFunctionNameList = new LinkedList<>(functionNameList);
            newFunctionNameList.push(this.getVariableName());
            this.getChild(2).run(newFunctionNameList); // running param nade by running with function name
            
        } else if (this.type == StatementType.FunctionWithOutParam) { // function declaration without any parameter require
            ParseTreeNode.functionVariableTable.put(this.getVariableName(), new Hashtable()); // add function name as a key and value is a new has table
            ParseTreeNode.functionTable.put(this.getVariableName(), this.nodeList.get(4)); // add function name as a key and value is list of node of statement inside this function
            ParseTreeNode.functionParamsTable.put(this.getVariableName(), new LinkedList<Variable>()); // add function name as a key and value is list of variable(parameter) for this function
            LinkedList<String> newFunctionNameList = new LinkedList<>(functionNameList);
            newFunctionNameList.push(this.getVariableName());
            this.getChild(2).run(newFunctionNameList); // running param nade by running with function name
            
        } else if (this.type == StatementType.FunctionParam) { // declaration of parameter of function
            // get hashtable of function (create when declare function) and put param name and param variable object(value(should be null), type) into this hashtable
            ((Hashtable) ParseTreeNode.functionVariableTable.get(functionNameList.get(0))).put(this.getVariableName(), new Variable(null, this.getVariableType()));
            // get list of param variable of function (create when declare function) and add variable(param) object(var name, type) into the list
            ((LinkedList) ParseTreeNode.functionParamsTable.get(functionNameList.get(0))).add(new Variable(this.getVariableName(), this.getVariableType()));
            
            if (this.nodeList.size() == 2) { // if have more than one param
                this.getChild(1).run(functionNameList); // get next param and run
            }
            
        } else if (this.type == StatementType.FunctionCall) { // call function without any param inside
            if (!ParseTreeNode.functionTable.containsKey(this.getVariableName())) { // if can't find the function name in the function table
                System.out.println("Function " + this.getVariableName() + " not found"); // show message
                
            } else { // if found, check list of param variable of this function is empty or not (because we call fuction without any param)
                if (((LinkedList) ParseTreeNode.functionParamsTable.get(this.getVariableName())).isEmpty()) { // if empty (RIGHT calling)
                    ParseTreeNode functionNode = (ParseTreeNode) ParseTreeNode.functionTable.get(this.getVariableName()); // get list of statement node inside this function
                    LinkedList<String> newFunctionNameList = new LinkedList<>(functionNameList);
                    newFunctionNameList.push(this.getVariableName());
                    functionNode.run(newFunctionNameList); // running statement node
                } else { // if not empty ( it means this fuction require some param )
                    System.out.println("Number of params shouldn't be 0");
                }
            }
            
        } else if (this.type == StatementType.FunctionCallWithParam) { // call function with param
            if (!ParseTreeNode.functionTable.containsKey(this.getVariableName())) { // if can't find the function name in the function table
                System.out.println("Function " + this.getVariableName() + " not found"); // show message
                
            } else { // if found
                this.getChild(0).run(functionNameList); // running expression node (param value)
                
                // calling check param function and passing function name and start index
                if (this.getChild(0).checkParams(this.getVariableName(), 0)) { // if checkParams func return true ( calling with correct parameters )
                    ParseTreeNode functionNode = (ParseTreeNode)  ParseTreeNode.functionTable.get(this.getVariableName()); // get list of statement node inside this function
                    LinkedList<String> newFunctionNameList = new LinkedList<>(functionNameList);
                    newFunctionNameList.push(this.getVariableName());
                    functionNode.run(newFunctionNameList); // running statement node
                } else { // if checkParams func return false ( calling with incorrect parameters )
                    System.out.println("Params is not correct");
                }
            }
        } else {
            super.run(functionNameList);
        }
    }
    
    private Object runFunction(LinkedList<String> functionNameList) {
        for(int i=0; i<this.nodeList.size(); i++) {
            this.getChild(i).run(functionNameList);
        }
        return this.getChild(this.nodeList.size() - 1).value;
    }
}
