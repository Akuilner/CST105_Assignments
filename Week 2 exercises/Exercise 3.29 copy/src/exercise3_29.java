import java.util.Scanner;

public class exercise3_29 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	// Circle 1's info
	System.out.println("Enter circle1's center x-, y-coordinates, and radius");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	double r1 = input.nextDouble();
				
	// Circle 2's info
	System.out.println("Enter circle2's center x-, y-coordinates, and radius");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double r2 = input.nextDouble();
	
	//Distance
	double c = Math.sqrt(Math.pow(Math.abs((x1 - x2)), 2) + Math.pow(Math.abs(y1 - y2), 2));	
	//Calculation of location of circles
	//Circle inside of another
	if (c <= Math.abs(r1 - r2)) {
		System.out.println("circle2 is inside circle1");}
	//Circles overlap 
	else if (c <= (r1 + r2)) {
		System.out.println("circle2 overlaps cirle1");
	}
	//No overlap
	else { 
		System.out.println("circle2 does not overlap circle1");
	}
	
	}

}