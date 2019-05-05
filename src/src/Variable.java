/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author asus
 */
public class Variable {
    
    public Object VarValue;
    public int VarType;
    public String name = null;
    
    public Variable(Object value, int type){
        this.VarValue = value;
        this.VarType = type;
    }
    
    public Variable(String name, int type){
        this.name = name;
        this.VarType = type;
        this.VarValue = null;
    }
    
    Object getVarValue(){
        return this.VarValue;
    }
    
    void setVarValue(Object value){
        this.VarValue = value;
    }
    
    int getVarType(){
        return this.VarType;
    }
    
    void setVarType(int type){
        this.VarType = type;
    }
    
}
