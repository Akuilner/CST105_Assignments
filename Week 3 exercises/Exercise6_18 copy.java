import java.util.Scanner;
public class Exercise6_18 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Password rules:\n"
			+ "1. Password must have at least eight characters\n"
			+ "2. Password must consist of only letters and digits\n"
			+ "3. Password must contain at least two digits\n"
			+ "Enter a password:");
	String pWT = sc.next();
	passWordIsValid(pWT);
	
	}
	public static void passWordIsValid (String password) {
        boolean passWordIsValid = true;
        int noOfDigits =0;


        if (password.length() > 8) { 
            for(char c : password.toCharArray()){
                if(Character.isDigit(c)){ 
                    noOfDigits++;
                }
                else if(!Character.isAlphabetic(c)){
                    passWordIsValid = false;
                    break;
                }
            }
        }

         if (passWordIsValid && noOfDigits>=2){
             System.out.print("Password is valid");
         }
         else{
             System.out.println("Password is invalid"); 
         }
	}
}