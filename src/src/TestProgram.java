/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java_cup.runtime.Symbol;

/**
 *
 * @author kannie
 */
public class TestProgram {
    public static void main(String[] args) {
        String input = "x=3;y=6;x+y;";
        Lexer lexer = new Lexer(new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8"))));
        parser p = new parser(lexer);
        String outputText = "";
        try {
            Symbol parse_tree = p.parse();
            ParseTreeNode startNode = (ParseTreeNode) parse_tree.value;
            startNode.run();
        } catch (Throwable ex) {
            outputText = ex.getMessage();
        }
        System.out.println(outputText);
    }
    
}
