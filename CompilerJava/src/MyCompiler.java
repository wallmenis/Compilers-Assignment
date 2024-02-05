import java.io.IOException;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRFileStream;
//import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.*;

public class MyCompiler {
	public static void main(String[] args) throws IOException {
        CalculatorLexer lexer = new CalculatorLexer(new ANTLRFileStream("input.txt"));        
        CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));        
        ParseTree tree = parser.statement();       
        myVisitor visitor = new myVisitor();        
        visitor.visit(tree);
        if(visitor.accumulator!=null) {					// Since we use the visitor recursively inside itself, we will print the output 
        	System.out.println("Result = " + visitor.accumulator);	// of the accumulator here.
        }
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree); // I don't know if you need it
        viewer.open();
	}
}