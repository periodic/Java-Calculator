import java.io.*;
import java_cup.runtime.*;
import tree.*;

class Calculator {
    public static void main (String [] args)
    {
        Prompt prompt = new Prompt(System.in, System.out);

        try {

            while (true) {
                String st = prompt.promptLine();
                Environment env = new Environment();

                parser p = new parser(new Lexer(new StringReader(st)));

                Symbol s = p.parse();

                Tree tree = (Tree) s.value;

                env.print();
                tree.print();
                System.out.println("");
                System.out.println("Result = " + tree.eval(env));
            }
        }
        catch (Exception e) {
            System.out.println("Parsing error.");
            System.out.println(e);
        };
    }
}
