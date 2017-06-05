/**Sorry for the incomplete code, my goal was to create a method that finds every occurrence of the first element in the ArrayList
 * and then on to the second and third and so on and so on, once it found every occurrence of every element, another method would
 * take every element that occurred an odd number of times (found using if (number % 1 == 0)) and multiply them together
 * then it would multiply the product by the original number determined by the user's input.*/

import java.util.*;

public class Exercise11_17 {
	
	public static 
	
	ArrayList<Integer> getPrimeFactors(int n) {      
	        ArrayList<Integer> factors = new ArrayList<Integer>();
	        
	        for (int i = 2; i <= n; i++) 
	        {
	            while (n % i == 0) 
	            {	
	                factors.add(i);
	            	//ArrayList<Integer> test = new ArrayList<Integer>(factors.subList(i + 1, factors.size() - 1));
	            	getOddNumbers(factors);
	              n /= i;
	            }  
	        }
	        
	        return factors;
	    }
	
	//By odd numbers it is referring to things occurring an odd number of times and not to odd numbered integers
		public static void getOddNumbers(ArrayList<Integer> test) {
			for (int i = 0; i <= test.size() - 1; i++) 
			{
				int indexed = test.get(i);
				//System.out.print("indexed: " + indexed + " i: " + i + " size: " + test.size() + "\n");	
			System.out.println(indexed + "\n");
				
				if (indexed != -1 && indexed <= test.size() && indexed % 1 == 0) 
				{
					System.out.print(indexed);
					
					
						/**System.out.print(i);
						ArrayList<Integer> newTest = new ArrayList<Integer>(test.subList(indexed + 1, test.size() - 1));
							getOddNumbers(newTest);
						
						ArrayList<Integer> newTest = new ArrayList<Integer>(test.subList(i + 1, test.size() - 1));
							for (int l = 0; l <= newTest.size(); i++) 
							{
								int newIndexed = (int)newTest.get(i);
								
							}*/
					}
			}
			
			
			
		}
	
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);  
	    	
	        System.out.print("enter an integer: ");
	        int num = sc.nextInt();
	        System.out.println(getPrimeFactors(num));
	        
	        
	        
	    }
	
}
