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
    
    // Function Cal with params
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
        if (this.type == StatementType.Assign) {
            super.run(functionNameList);
            if (curVariableTable.containsKey(this.getVariableName())) {
                Object curValue = this.getChild(assignExpIndex).getValue();
                Variable v = (Variable) curVariableTable.get(this.getVariableName());
                int varType = v.getVarType();
                this.setVariable(this.getChild(assignExpIndex).getValue(), varType);
                if (curValue instanceof Integer && varType == sym.INT) {
                    curVariableTable.put(this.getVariableName(),
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
                } else {
                    //System.out.println(varType);
                    System.out.println("value of " + this.getVariableName() + " variable is incompatible for this type");
                    System.exit(0);
                }
            } else {

                System.out.println("variable " + this.getVariableName() + " doesn't exist");
                System.exit(0);
            }
        } else if (this.type == StatementType.Declaration) {
            super.run(functionNameList);
            curVariableTable.put(this.getVariableName(),
                    this.getVariable());
            //Variable v = (Variable) ParseTreeNode.varTable.get(this.getVariableName());
            //System.out.println(v.getVarValue());
        } else if (this.type == StatementType.DeclareAndAssign) {
            ExpressionNode expression = (ExpressionNode) this.getChild(expIndex);
            expression.run(functionNameList);
            Object curValue = expression.getValue();

            if (curValue instanceof Integer && this.getVariableType() == sym.INT) {
                this.setVariable(curValue, this.getVariableType());
                curVariableTable.put(this.getVariableName(),
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
            } else {
                //System.out.println(this.getVariableType());
                System.out.print("value of " + this.getVariableName() + " variable is incompatible for this type");
                System.exit(0);
            }
        } else if (this.type == StatementType.If
                || this.type == StatementType.IfElse) {
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
            } else if (this.type == StatementType.IfElse) {
                this.getChild(state2Index).run(functionNameList);
            }
        } else if (this.type == StatementType.WHILE) {
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
                this.getChild(state1Index).run();
                this.run(functionNameList);
            }

        } else if (this.type == StatementType.Print) {
            ExpressionNode expression = (ExpressionNode) this.getChild(0);
            expression.run(functionNameList);
            Object curValue = expression.getValue();
            System.out.println(curValue);
        } else if (this.type == StatementType.Function) {
            ParseTreeNode.functionVariableTable.put(this.getVariableName(), new Hashtable());
            ParseTreeNode.functionTable.put(this.getVariableName(), this.nodeList.get(5));
            ParseTreeNode.functionParamsTable.put(this.getVariableName(), new LinkedList<Variable>());
            LinkedList<String> newFunctionNameList = new LinkedList<>(functionNameList);
            newFunctionNameList.push(this.getVariableName());
            this.getChild(2).run(newFunctionNameList);
        } else if (this.type == StatementType.FunctionWithOutParam) {
            ParseTreeNode.functionVariableTable.put(this.getVariableName(), new Hashtable());
            ParseTreeNode.functionTable.put(this.getVariableName(), this.nodeList.get(4));
            ParseTreeNode.functionParamsTable.put(this.getVariableName(), new LinkedList<Variable>());
            LinkedList<String> newFunctionNameList = new LinkedList<>(functionNameList);
            newFunctionNameList.push(this.getVariableName());
            this.getChild(2).run(newFunctionNameList);
        } else if (this.type == StatementType.FunctionParam) {
            ((Hashtable) ParseTreeNode.functionVariableTable.get(functionNameList.get(0))).put(this.getVariableName(), new Variable(null, this.getVariableType()));
            ((LinkedList) ParseTreeNode.functionParamsTable.get(functionNameList.get(0))).add(new Variable(this.getVariableName(), this.getVariableType()));
            if (this.nodeList.size() == 2) {
                this.getChild(1).run(functionNameList);
            }
        } else if (this.type == StatementType.FunctionCall) {
            if (!ParseTreeNode.functionTable.containsKey(this.getVariableName())) {
                System.out.println("Function " + this.getVariableName() + " not found");
            } else {
                if (((LinkedList) ParseTreeNode.functionParamsTable.get(this.getVariableName())).isEmpty()) {
                    ParseTreeNode functionNode = (ParseTreeNode) ParseTreeNode.functionTable.get(this.getVariableName());
                    LinkedList<String> newFunctionNameList = new LinkedList<>(functionNameList);
                    newFunctionNameList.push(this.getVariableName());
                    functionNode.run(newFunctionNameList);
                } else {
                    System.out.println("Number of params should be 0");
                }
            }
        } else if (this.type == StatementType.FunctionCallWithParam) {
            if (!ParseTreeNode.functionTable.containsKey(this.getVariableName())) {
                System.out.println("Function " + this.getVariableName() + " not found");
            } else {
                this.getChild(0).run(functionNameList);
                if (this.getChild(0).checkParams(this.getVariableName(), 0)) {
                    ParseTreeNode functionNode = (ParseTreeNode)  ParseTreeNode.functionTable.get(this.getVariableName());
                    LinkedList<String> newFunctionNameList = new LinkedList<>(functionNameList);
                    newFunctionNameList.push(this.getVariableName());
                    functionNode.run(newFunctionNameList);
                } else {
                    System.out.println("Params is not correct");
                }
            }
        } else {
            super.run(functionNameList);
        }
    }
    
//    private Object runFunction(LinkedList<String> functionNameList) {
//        this.getChild(0)
//    }
}
