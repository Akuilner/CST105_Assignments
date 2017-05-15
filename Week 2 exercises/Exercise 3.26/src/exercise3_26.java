import java.util.Scanner;

public class exercise3_26 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.println("Enter an integer:");
	int chosenNumber = input.nextInt();
		System.out.println("Is " + chosenNumber + " divisible by 5 and 6? " + (chosenNumber % 5 == 0 && chosenNumber % 6 == 0));
		System.out.println("Is " + chosenNumber + " divisible by 5 or 6? " + (chosenNumber % 5 == 0 || chosenNumber % 6 == 0));
		System.out.println("Is " + chosenNumber + " divisible by 5 or 6, but not both? " + (chosenNumber % 5 == 0 ^ chosenNumber % 6 == 0));
	}	

}	