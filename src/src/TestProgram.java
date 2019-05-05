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
        //String input = "bool x;\nx=3;\n";
        //String input = "bool x;\n x=true;\nbool y=true;\nif(x){\nprint(x);\n}\n";
        //String input = "int x=1;\nint y=3;\nif(y){\nprint(y);\nif(x){\nprint(x);\n}\n}";
        String input = "int x=3;\nint y=1;\nwhile (x > 1){\nprint(x);\nx=x- 1;\n}\nif(y<=x OR x > 10){\nprint(x+y);\nprint(x-y);\nprint(x*y);\n}";
        //String input = "int x=3;\nwhile (x > 0){\nprint(x);\nx=x- 1;\n}\n";
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
