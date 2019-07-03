import java.util.Scanner;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

public class FigureMain {
  public static void main(String[] args) throws Exception {
    String sourceFile = args[0];
    try
    {
      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromStream(new FileInputStream(sourceFile));
      // create a lexer that feeds off of input CharStream:
      FigureLexer lexer = new FigureLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      FigureParser parser = new FigureParser(tokens);
      ParseTree tree = parser.main();
      if (parser.getNumberOfSyntaxErrors() == 0) {
        // print LISP-style tree:
        // System.out.println(tree.toStringTree(parser));
        FigureSemanticCheck semanticCheck = new FigureSemanticCheck();
        FigureCompiler compiler = new FigureCompiler();
        semanticCheck.visit(tree);
        if(!ErrorHandling.error())
        {
          ST code = compiler.visit(tree);
          String filename = "Output.tex";
          try
          {
            PrintWriter pw = new PrintWriter(new File(filename));
            pw.print(code.render());
            pw.close();
          } catch(IOException e)
          {
            System.err.println("ERROR: Unable to write in file "+filename+"!");
            System.exit(3);
          }
        }

      }
    }
    catch(IOException e)
    {
      System.err.println("ERROR: Unable to read from file "+sourceFile+"!");
      System.exit(4);
    }
  }
}
