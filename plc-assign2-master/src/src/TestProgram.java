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
    public static void main(String[] args) throws Exception {
        //String input = "double x=3;\ndouble y=0;\nwhile(x){\nprint(x);\nx=x - 1;\n}\nif(y>=x){\nprint(x+y);\nprint(x-y);\nprint(x*y);\n}";
//        String input = "(true&&true);";
        Lexer lexer = new Lexer(new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8"))));
        parser p = new parser(lexer);
        String outputText = "";
        Symbol parse_tree = p.parse();
        ParseTreeNode startNode = (ParseTreeNode) parse_tree.value;
        System.out.println("");
        startNode.run();
        System.out.println(outputText);
    }
    
}
