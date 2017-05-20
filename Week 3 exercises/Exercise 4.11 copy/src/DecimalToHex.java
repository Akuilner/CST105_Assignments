import java.util.Scanner;

public class DecimalToHex {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a decimal value (0 to 15):");
	int decimalChoice = sc.nextInt();
	
	String str = Integer.toHexString(decimalChoice);
	System.out.println("The hex value for decimal " + decimalChoice + " is: " + str);
		
	
		
	}

}
