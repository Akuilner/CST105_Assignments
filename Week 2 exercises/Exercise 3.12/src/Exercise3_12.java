import java.util.Scanner;

public class Exercise3_12 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter a three-digit integer: ");
	int userInteger = input.nextInt();
	int userIntegerDigit1 = userInteger / 100;
	int userIntegerDigit3 = userInteger % 10;
	if(userInteger > 999) {
		System.out.println("Integer is too large please try again");		
	}
	else {
		if (userIntegerDigit1 == userIntegerDigit3) {
		System.out.println("The integer is a palindrome");	
			
		}
		else {
			System.out.println("The integer is not a palindrome");
		}
	}
		

	}

}
