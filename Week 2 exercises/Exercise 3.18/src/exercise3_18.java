import java.util.Scanner;

public class exercise3_18 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight (in pounds) of the package here:");
		double packageWeight = input.nextDouble();
		double cost = 0;
		
		if (0 < packageWeight && packageWeight <= 1) {
			cost = 3.5;
			System.out.println("The shipping cost is $" + cost + "0");
		}
		else if (1 < packageWeight && packageWeight <= 3) {
			cost = 5.5;
			System.out.println("The shipping cost is $" + cost + "0");
		}
		else if (3 < packageWeight && packageWeight <= 10) {
			cost = 8.5;
			System.out.println("The shipping cost is $" + cost + "0");
		}
		else if (10 < packageWeight && packageWeight <= 20) {
			cost = 10.5;
			System.out.println("The shipping cost is $" + cost + "0");
		}				
		else {
			System.out.println("The package cannot be shipped");
		}
		
	}

}
