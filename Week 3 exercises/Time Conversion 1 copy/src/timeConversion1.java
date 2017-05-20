import java.util.Scanner;

public class timeConversion1 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a time in 24-hour format (5:00 PM = 17) here:");
	int chosenTime = input.nextInt();
	
	
	if (chosenTime > 0 && chosenTime <= 12) {
		System.out.println("Chosen time is: " + chosenTime + ":00 AM");
	}
	else if (chosenTime > 12 && chosenTime <= 24) {
		System.out.println("Chosen time is: " + (chosenTime % 12) + ":00 PM");
	}
	else {
		System.out.println("Error: Invalid input");
	}
	
	}

}
