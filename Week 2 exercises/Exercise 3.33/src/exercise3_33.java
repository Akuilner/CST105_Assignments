import java.util.Scanner;

public class exercise3_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Package 1's weight and price
		System.out.println("Enter weight and price for package 1:");
		double w1 = input.nextDouble();
		double p1 = input.nextDouble();
		
		//package 2's weight and price
		System.out.println("Enter weight and price for package 2:");
		double w2 = input.nextDouble();
		double p2 = input.nextDouble();
		
		//Determining which package has a better price		
		 if (w1 == w2 && p1 == p2) {
				System.out.println("The prices are the same.");
			}
		else if ((w1 / p1) == (w2 / p2)) {
			System.out.println("The prices are the same.");
		}
		else if (w1 == w2 && p1 < p2) {
			System.out.println("Package 1 has a better price.");
		}
		else if (w1 > w2 && p1 == p2) {
			System.out.println("Package 1 has a better price.");
		}
		else if (w1 >= w2 && p1 < p2) {
			System.out.println("Package 1 has a better price.");
		}
		else if (w1 % w2 == 0 && p1 < p2) {
			System.out.println("Package 1 has a better price.");
		}
		else if (w2 % w1 == 0 && p1 < p2) {
			System.out.println("Package 1 has a better price.");
		}
		else if (w2 == w1 && p2 < p1) {
			System.out.println("Package 2 has a better price.");
		}
		else if (w2 > w1 && p2 == p1) {
			System.out.println("Package 2 has a better price.");
		}
		else if (w2 >= w1 && p2 < p1) {
			System.out.println("Package 2 has a better price.");
		}
		else if (w2 % w1 == 0 && p2 < p1) {
			System.out.println("Package 2 has a better price.");
		}
		else if (w1 % w2 == 0 && p2 < p1) {
			System.out.println("Package 2 has a better price.");
		}
		
								
	}

}
