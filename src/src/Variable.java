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
    
    public Variable(Object value, int type){
        this.VarValue = value;
        this.VarType = type;
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
