public class Exercise13_16 extends Rational{ 
	/** Main method */ 
	public static void main(String[] args) { 
		
				
		// Check number of strings passed 
		
		if (args.length != 1) { 
			System.out.println( "Usage: java Exercise13_16 String");
			System.exit(0); 
		}
		
		// The result of the operation
		
		String result = args[0];
		
		String[] str = args[0].replaceAll(" ", "/").split("/");		
		
		Rational r1 = new Rational(Integer.parseInt(str[0]), 
				Integer.parseInt(str[1]));
		
		Rational r2 = new Rational(Integer.parseInt(str[3]), 
				Integer.parseInt(str[4]));
				
		
		switch (str[2].charAt(0)) { 
		case'+': result += " = " + r1.add(r2); break;
						  
		case'-': result = " = " + r1.subtract(r2); break;
						  
		case'.': result = " = " + r1.multiply(r2); break;
		                  
		case'/': result = " = " + r1.divide(r2);
		}
		
		// Display result
		System.out.println(result); 
		
	} 
	
}