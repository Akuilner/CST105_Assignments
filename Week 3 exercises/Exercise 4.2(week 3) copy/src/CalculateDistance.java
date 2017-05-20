import java.util.Scanner;

public class CalculateDistance {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		//Get locations
	System.out.println("Enter point one (latitude and longitude) in degrees here:");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	System.out.println("Enter point two (latitude and longitude) in degrees here:");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	
	double x1R = Math.toRadians(x1);
	double y1R = Math.toRadians(y1);
	double x2R = Math.toRadians(x2);
	double y2R = Math.toRadians(y2);

	
	//Earth's average radius in kilometers 
	final double earthRadius = 6371.01;
	
	//Calculate distance
	double j = Math.sin(x1R) * Math.sin(x2R) + Math.cos(x1R) * Math.cos(x2R) * Math.cos(y1R - y2R);
	double totalDistance = earthRadius * Math.acos(j);
	
	//Print results
	System.out.println("The total distance is: " + totalDistance + " km");
	
	}

}
