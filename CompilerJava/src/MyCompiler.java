import java.io.IOException;
//import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.Scanner;
//import org.antlr.v4.runtime.tree.gui.*;

public class MyCompiler {
	public static void main(String[] args) throws IOException {
		CalculatorLexer lexer = new CalculatorLexer(new ANTLRInputStream());
		myVisitor visitor = new myVisitor();
		if (args.length>0)
		{
			lexer = new CalculatorLexer(new ANTLRFileStream(args[0]));  
			visitor.calcNumber=0;
			CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));        
	        ParseTree tree = parser.statement();// We need somewhere to start counting...
	        if (parser.getNumberOfSyntaxErrors()<1)
	        {
	        	visitor.visit(tree);
	        }
		}
		else
		{
			System.out.println("Please enter your calculations below:");
			boolean exit = false;
			Scanner sc = new Scanner(System.in);
			while (!exit)
			{
				System.out.print(">");
		        String str = sc.nextLine();
				lexer = new CalculatorLexer(new ANTLRInputStream(str));
				visitor.calcNumber=0;
				CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));  
		        ParseTree tree = parser.statement();// We need somewhere to start counting...
		        if (parser.getNumberOfSyntaxErrors()<1)
		        {
		        	visitor.visit(tree);
		        }
				if (visitor.calcNumber<0)
				{
					exit = true;
				}
			}
			sc.close();
			System.out.println("Exited!");
		}        
	}
}