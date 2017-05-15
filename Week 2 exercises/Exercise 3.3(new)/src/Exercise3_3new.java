import java.util.Scanner;

public class Exercise3_3new {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a, b, c, d, e, f: ");
		double A = input.nextDouble(); 
		double B = input.nextDouble();
		double C = input.nextDouble();
		double D = input.nextDouble();
		double E = input.nextDouble();
		double F = input.nextDouble();

		if (A * D - B * C == 0){
			System.out.println("The equation has no solution.");
		}
		else System.out.println("x is " + (E * D - B * F) / (A * D - B * C) + " and y is " + (A * F - E * C) / (A * D - B * C));
	}	
}
