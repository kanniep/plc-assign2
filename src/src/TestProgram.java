/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java_cup.runtime.Symbol;

/**
 *
 * @author kannie
 */
public class TestProgram {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("program.txt");
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
        
        String line = buf.readLine();
        StringBuilder sb = new StringBuilder();

        while(line != null){
           sb.append(line).append("\n");
           line = buf.readLine();
        }
        
        String input = sb.toString();

        //String input = "int x=5;function f(int x, int y, bool z) {\nif(z){ int a=x+y;\nprint(a);}\n}\nfunction g() {print(a);}\nf(x, 4, true);\nprint(a);\ng();\n"
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
