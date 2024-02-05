import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

public class myVisitor extends CalculatorBaseVisitor<Object> {

	public String accumulator;				// I needed a way to pass the inside result of the function that is performed to the upper one.
	public double n1;						// I needed a way to pass the actual values if they are meaningful so that they can be processed.
	public double n2;						// Java has a weird way to "pass by reference" so these where my solution to that.
	public boolean b1;
	public boolean b2;
	public String s1;
	public String s2;
	
	@Override
	public Object visitADDITION_OP(CalculatorParser.ADDITION_OPContext poc) {
		boolean failcondition=false;
		String result="";
		
		failcondition=returnFor2NumberOperations(poc.children,0,2);		// Instead of writing a piece of code and copy pasting it 
																		// to parse and get children's results, we have a few functions
        if(failcondition==false)										// that will help us deal with that easier.
        {
        	result=String.valueOf(n1+n2);
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	
	public Object visitSUBTRACTION_OP(CalculatorParser.SUBTRACTION_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor2NumberOperations(poc.children,0,2);
        if(failcondition==false)
        {
        	result=String.valueOf(n1-n2);
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	
	public Object visitMULTIPLICATION_OP(CalculatorParser.MULTIPLICATION_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor2NumberOperations(poc.children,0,2);
        if(failcondition==false)
        {
        	result=String.valueOf(n1*n2);
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	
	public Object visitDIVISION_OP(CalculatorParser.DIVISION_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor2NumberOperations(poc.children,0,2);
        if(failcondition==false)
        {
        	result="0";
        	try {
        		result=String.valueOf(n1/n2);
        	}catch(ArithmeticException e)		// Try-Catch block for division by zero (mainly)
        	{
        		System.out.println(e.toString());
        	}
        	this.accumulator=result;			// This will transfer our result to the father.
        }
        return null;
    }
	
	public Object visitMODULUS_OP(CalculatorParser.MODULUS_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor2NumberOperations(poc.children,0,2);
        if(failcondition==false)
        {
        	result="0";
        	try {
        		result=String.valueOf(n1%n2);	// I will just use java's behaviour on this one
        	}catch(ArithmeticException e)		// Try-Catch block for mod 0 which is undefined.
        	{
        		System.out.println(e.toString());
        	}
        	this.accumulator=result;			// This will transfer our result to the father.
        }
        return null;
    }
	public Object visitEXPONENT_OP(CalculatorParser.EXPONENT_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor2NumberOperations(poc.children,0,2);
        if(failcondition==false)
        {
        	result=String.valueOf(Math.pow(n1, n2));
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitROOT_OP(CalculatorParser.ROOT_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor2NumberOperations(poc.children,2,4);
        if(failcondition==false)
        {
        	result="0";
        	try {
        		result=String.valueOf(Math.pow(n1, 1.0/n2));
        	}catch(ArithmeticException e)
        	{
        		System.out.println(e.toString());
        	}
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitMATH_IN_PARENTH(CalculatorParser.MATH_IN_PARENTHContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor1NumberOperations(poc.children,1);
        if(failcondition==false)
        {
        	result=String.valueOf(n1);
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitBASE_MATH_EXP(CalculatorParser.BASE_MATH_EXPContext poc) {		// This is only useful if we have a single number. EG: 1;
		boolean failcondition=false;
		String result=poc.children.get(0).getText();
		try {
			n1=Double.parseDouble(result);						// This is for in case we have something that won't make sense to put. EG: bowl;
		}catch (Exception e)									// That way we can use the exception for any errors like that.
		{
			System.out.println("Failed to parse \"" + result + "\" as a number.");
			failcondition=true;
		}
        if(failcondition==false)
        {
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitEULER_OP(CalculatorParser.EULER_OPContext poc) {
		String result=String.valueOf(Math.E);
        this.accumulator=result;				// This will transfer our result to the father
        return null;
    }
	public Object visitPI_OP(CalculatorParser.PI_OPContext poc) {
		String result=String.valueOf(Math.PI);
        this.accumulator=result;				// This will transfer our result to the father
        return null;
    }
	public Object visitCOTANGENT_OP(CalculatorParser.COTANGENT_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor1NumberOperations(poc.children,2);
        if(failcondition==false)
        {
        	result="0";
        	try {
        		result=String.valueOf(Math.cos(n1)/Math.sin(n1));	// There is no cotangent in the Math library. So we use the definition.
        	}catch(ArithmeticException e)							// Mainly for when sin(n1)=0;
        	{
        		System.out.println(e.toString());
        	}
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitTANGENT_OP(CalculatorParser.TANGENT_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor1NumberOperations(poc.children,2);
        if(failcondition==false)
        {
        	result="0";
        	try {
        		result=String.valueOf(Math.tan(n1));
        	}catch(ArithmeticException e)				// Mainly for when n1 is a multiple of pi*k where the tangent is undefined.
        	{
        		System.out.println(e.toString());
        	}
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitCOSINE_OP(CalculatorParser.COSINE_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor1NumberOperations(poc.children,2);
        if(failcondition==false)
        {
        	result=String.valueOf(Math.cos(n1));
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitSINE_OP(CalculatorParser.SINE_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor1NumberOperations(poc.children,2);
        if(failcondition==false)
        {
        	result=String.valueOf(Math.sin(n1));
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitFACTORIAL_OP(CalculatorParser.FACTORIAL_OPContext poc) {
		boolean failcondition=false;
		String result="";
		int factorial=1;
		failcondition=returnFor1NumberOperations(poc.children,2);
        if(failcondition==false)
        {
        	factorial=Factorial(Integer.parseInt(String.valueOf(Math.floor(n1)))); // Same behaviour with mod
        	result=String.valueOf(factorial);
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitLOG_OP(CalculatorParser.LOG_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor1NumberOperations(poc.children,2);
        if(failcondition==false)
        {
        	result=String.valueOf(Math.log(n1));
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Object visitNOT_OP(CalculatorParser.NOT_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor1BoolOperations(poc.children,1);
        if(failcondition==false)
        {
        	result=BoolToString(!b1);
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitAND_OP(CalculatorParser.AND_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor2BoolOperations(poc.children,0,2);
        if(failcondition==false)
        {
        	result=BoolToString(b1&&b2);
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitOR_OP(CalculatorParser.OR_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor2BoolOperations(poc.children,0,2);
        if(failcondition==false)
        {
        	result=BoolToString(b1||b2);
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitNAND_OP(CalculatorParser.NAND_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor2BoolOperations(poc.children,0,2);
        if(failcondition==false)
        {
        	result=BoolToString(!(b1&&b2));
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitXOR_OP(CalculatorParser.XOR_OPContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor2BoolOperations(poc.children,0,2);
        if(failcondition==false)
        {
        	result=BoolToString((b1||b2)&&(!(b1&&b2)));
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitBASE_LOGIC_EXP(CalculatorParser.BASE_LOGIC_EXPContext poc) {	// This is only useful if we have a single boolean value. EG: true;
		boolean failcondition=false;
		String result=poc.children.get(0).getText();
		try {
			b1=StringToBool(result);			// This is for in case we have something that won't make sense to put. EG: cat;
		}catch (Exception e)					// That way we can use the exception for any errors like that.
		{
			System.out.println("Failed to parse \"" + result + "\" as a boolean.");
			failcondition=true;
		}
        if(failcondition==false)
        {
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
	public Object visitLOGIC_IN_PARENTH(CalculatorParser.LOGIC_IN_PARENTHContext poc) {
		boolean failcondition=false;
		String result="";
		failcondition=returnFor1BoolOperations(poc.children,1);
        if(failcondition==false)
        {
        	result=BoolToString(b1);
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Object visitCONCAT_OP(@NotNull CalculatorParser.CONCAT_OPContext poc)
	{
		boolean failcondition=false;
		String result="";
		
		s1=poc.children.get(0).getText(); 		// Takes the text of anything that is left of the calculation
		s2=poc.children.get(2).getText();       // Takes the text of anything that is right of the calculation
												// Since we are not performing any type of recursion, we get
												// the exact 
		if(failcondition==false)
        {
			System.out.println(s1);
			System.out.println(s2);
        	result=s1+s2;
        	this.accumulator=result;			// This will transfer our result to the father
        }
		return null;
	}
	public Object visitBASE_ID_EXP(@NotNull CalculatorParser.BASE_ID_EXPContext poc)
	{
		boolean failcondition=false;
		String result=poc.children.get(0).getText();
		try {
			b1=StringToBool(result);			// This is for in case we have something that won't make sense to put. EG: cat;
		}catch (Exception e)					// That way we can use the exception for any errors like that.
		{
			System.out.println("Failed to parse \"" + result + "\" as a boolean.");
			failcondition=true;
		}
        if(failcondition==false)
        {
        	this.accumulator=result;			// This will transfer our result to the father
        }
        return null;	
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean returnFor1NumberOperations(List<ParseTree> pocChildren, int pos)
	{
		boolean failcondition=false;
		String v1="";
		if(pocChildren.get(pos).getClass().getTypeName() == CalculatorParser.BASE_MATH_EXPContext.class.getName())
		{
			v1 = pocChildren.get(pos).getText();		// We basically check if the children are of plain numbers and then make them text
		}
		else
		{
			myVisitor visitor = new myVisitor();        // If not, we create a visitor. It is a bit wasteful to use a full visitor 
	        visitor.visit(pocChildren.get(pos));		// but that is the way I am comfortable going with. That way we have a
	        v1=visitor.accumulator;						// recursive call with new visitors until we get a "pure" operation with 
		}												// only numbers as operands where the recursion ends.
		try {
			n1=Double.parseDouble(v1);
		}catch (Exception e)							// This Try-Catch block is for cases where v1 contains garbage (EG: foobar).
		{
			System.out.println("Failed to parse \"" + v1 + "\" as a number.");
			failcondition=true;
		}
		return failcondition;							// Return true if anything fails...
	}
	public boolean returnFor2NumberOperations(List<ParseTree> pocChildren,int pos1, int pos2)
	{
		boolean failcondition=false;		// This is the same function as returnFor1NumberOperations but essentially twice.
		String v1="";						// That way we can assign values to n2 as well. It works the same way but the Try-Catch blocks
		String v2="";						// and if statement blocks are grouped together.
		if(pocChildren.get(pos1).getClass().getTypeName() == CalculatorParser.BASE_MATH_EXPContext.class.getName())
		{
			v1 = pocChildren.get(pos1).getText();
		}
		else
		{
			myVisitor visitor = new myVisitor();        
	        visitor.visit(pocChildren.get(pos1));
	        v1=visitor.accumulator;
		}
		if(pocChildren.get(pos2).getClass().getTypeName() == CalculatorParser.BASE_MATH_EXPContext.class.getName())
		{
			v2 = pocChildren.get(pos2).getText();
		}
		else
		{
			myVisitor visitor = new myVisitor();        
	        visitor.visit(pocChildren.get(pos2));
	        v2=visitor.accumulator;
		}
		try {
			n1=Double.parseDouble(v1);
		}catch (Exception e)
		{
			System.out.println("Failed to parse \"" + v1 + "\" as a number.");
			failcondition=true;
		}
		try {
			n2=Double.parseDouble(v2);
		}catch (Exception e)
		{
			System.out.println("Failed to parse \"" + v2 + "\" as a number.");
			failcondition=true;
		}
		return failcondition;
	}
	public boolean returnFor1BoolOperations(List<ParseTree> pocChildren,int pos)
	{
		boolean failcondition=false;			// Same as returnFor1NumberOperations but for booleans. It sets b1.
		String v1="";
		if(pocChildren.get(pos).getClass().getTypeName() == CalculatorParser.BASE_LOGIC_EXPContext.class.getName())
		{
			v1 = pocChildren.get(pos).getText();
		}
		else
		{
			myVisitor visitor = new myVisitor();        
	        visitor.visit(pocChildren.get(pos));
	        v1=visitor.accumulator;
		}
		try {
			b1=StringToBool(v1);
		}catch (Exception e)
		{
			System.out.println("Failed to parse \"" + v1 + "\" as a boolean.");
			failcondition=true;
		}
		return failcondition;
	}
	public boolean returnFor2BoolOperations(List<ParseTree> pocChildren,int pos1, int pos2)
	{
		boolean failcondition=false;			// Same as returnFor2NumberOperations but for booleans. It sets b1 and b2.
		String v1="";
		String v2="";
		if(pocChildren.get(pos1).getClass().getTypeName() == CalculatorParser.BASE_LOGIC_EXPContext.class.getName())
		{
			v1 = pocChildren.get(pos1).getText();
		}
		else
		{
			myVisitor visitor = new myVisitor();        
	        visitor.visit(pocChildren.get(pos1));
	        v1=visitor.accumulator;
		}
		if(pocChildren.get(pos2).getClass().getTypeName() == CalculatorParser.BASE_LOGIC_EXPContext.class.getName())
		{
			v2 = pocChildren.get(pos2).getText();
		}
		else
		{
			myVisitor visitor = new myVisitor();        
	        visitor.visit(pocChildren.get(pos2));
	        v2=visitor.accumulator;
		}
		try {
			b1=StringToBool(v1);
		}catch (Exception e)
		{
			System.out.println("Failed to parse \"" + v1 + "\" as a boolean.");
			failcondition=true;
		}
		try {
			b2=StringToBool(v2);
		}catch (Exception e)
		{
			System.out.println("Failed to parse \"" + v2 + "\" as a boolean.");
			failcondition=true;
		}
		return failcondition;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean StringToBool(String input)	// I didn't like how Java turns strings into booleans so I made this function.
	{											// Specifically, I don't like the fact that it accepts "True" instead of "true"
		boolean result=true;					// and that if it is anything else, returns false. I want to exclusively turn
		boolean valueSet=false;					// "true" to true and "false" to false and anything else is not allowed.
		if(input.equals("true"))
		{
			result=true;
			valueSet=true;
		}
		if(input.equals("false"))
		{
			result=false;
			valueSet=true;
		}
		if(!valueSet)
		{
			try {								// A bit stupid way to write a Try-Catch statement but it works fine and isn't
				throw new Exception("Non correct way to say true or false. \"" +input+"\" was said instead." );	// confusing so
			}catch(Exception e)					// I am fine with it : )
			{
				e.printStackTrace();
			}
		}
		return result;
	}
	public String BoolToString(boolean input)
	{											// Java will return "True" and "False" instead so I have to write this too.
		String result="true";
		if(!input)
		{
			result="false";
		}
		return result;
	}
	public int Factorial(int input)
	{											// Math library doesn't have any factorial function so I made mine with recursion...
		if(input==1)
		{
			return 1;
		}
		return input*Factorial(input-1);
	}
//	public void visit(ParseTree tree) {
//		// TODO Auto-generated method stub
//		
//	}
}