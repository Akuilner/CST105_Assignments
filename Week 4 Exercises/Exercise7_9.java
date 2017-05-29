import java.util.Scanner;
public class Exercise7_9 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double[]numbers = new double[10];
		numbers[0] = sc.nextDouble();
		numbers[1] = sc.nextDouble();
		numbers[2] = sc.nextDouble();
		numbers[3] = sc.nextDouble();
		numbers[4] = sc.nextDouble();
		numbers[5] = sc.nextDouble();
		numbers[6] = sc.nextDouble();
		numbers[7] = sc.nextDouble();
		numbers[8] = sc.nextDouble();
		numbers[9] = sc.nextDouble();
		min(numbers);	
	}
	public static void min(double[] numbers) {
		if (numbers[0] <= numbers[1] && numbers[0] <= numbers[2] && numbers[0] <= numbers[3]
				 && numbers[0] <= numbers[4] && numbers[0] <= numbers[5] && numbers[0] <= numbers[6]
						 && numbers[0] <= numbers[7] && numbers[0] <= numbers[8] && numbers[0] <= numbers[9]){
			System.out.println("The lowest number is: " + numbers[0]);
		}
		else if (numbers[1] <= numbers[0] && numbers[1] <= numbers[2] && numbers[1] <= numbers[3]
				 && numbers[1] <= numbers[4] && numbers[1] <= numbers[5] && numbers[1] <= numbers[6]
						 && numbers[1] <= numbers[7] && numbers[1] <= numbers[8] && numbers[1] <= numbers[9]){
			System.out.println("The lowest number is: " + numbers[1]);
		}
		else if (numbers[2] <= numbers[0] && numbers[2] <= numbers[1] && numbers[2] <= numbers[3]
				 && numbers[2] <= numbers[4] && numbers[2] <= numbers[5] && numbers[2] <= numbers[6]
						 && numbers[2] <= numbers[7] && numbers[2] <= numbers[8] && numbers[2] <= numbers[9]){
			System.out.println("The lowest number is: " + numbers[2]);
		}
		else if (numbers[3] <= numbers[0] && numbers[3] <= numbers[2] && numbers[3] <= numbers[1]
				 && numbers[3] <= numbers[4] && numbers[3] <= numbers[5] && numbers[3] <= numbers[6]
						 && numbers[3] <= numbers[7] && numbers[3] <= numbers[8] && numbers[3] <= numbers[9]){
			System.out.println("The lowest number is: " + numbers[3]);
		}
		else if (numbers[4] <= numbers[0] && numbers[4] <= numbers[2] && numbers[4] <= numbers[3]
				 && numbers[4] <= numbers[1] && numbers[4] <= numbers[5] && numbers[4] <= numbers[6]
						 && numbers[4] <= numbers[7] && numbers[4] <= numbers[8] && numbers[4] <= numbers[9]){
			System.out.println("The lowest number is: " + numbers[4]);
		}
		else if (numbers[5] <= numbers[0] && numbers[5] <= numbers[2] && numbers[5] <= numbers[3]
				 && numbers[5] <= numbers[4] && numbers[5] <= numbers[1] && numbers[5] <= numbers[6]
						 && numbers[5] <= numbers[7] && numbers[5] <= numbers[8] && numbers[5] <= numbers[9]){
			System.out.println("The lowest number is: " + numbers[5]);
		}
		else if (numbers[6] <= numbers[0] && numbers[6] <= numbers[2] && numbers[6] <= numbers[3]
				 && numbers[6] <= numbers[4] && numbers[6] <= numbers[5] && numbers[6] <= numbers[1]
						 && numbers[6] <= numbers[7] && numbers[6] <= numbers[8] && numbers[6] <= numbers[9]){
			System.out.println("The lowest number is: " + numbers[6]);
		}
		else if (numbers[7] <= numbers[0] && numbers[7] <= numbers[2] && numbers[7] <= numbers[3]
				 && numbers[7] <= numbers[4] && numbers[7] <= numbers[5] && numbers[7] <= numbers[6]
						 && numbers[7] <= numbers[1] && numbers[7] <= numbers[8] && numbers[7] <= numbers[9]){
			System.out.println("The lowest number is: " + numbers[7]);
		}
		else if (numbers[8] <= numbers[0] && numbers[8] <= numbers[2] && numbers[8] <= numbers[3]
				 && numbers[8] <= numbers[4] && numbers[8] <= numbers[5] && numbers[8] <= numbers[6]
						 && numbers[8] <= numbers[7] && numbers[8] <= numbers[1] && numbers[8] <= numbers[9]){
			System.out.println("The lowest number is: " + numbers[8]);
		}
		else if (numbers[9] <= numbers[0] && numbers[9] <= numbers[2] && numbers[9] <= numbers[3]
				 && numbers[9] <= numbers[4] && numbers[9] <= numbers[5] && numbers[9] <= numbers[6]
						 && numbers[9] <= numbers[7] && numbers[9] <= numbers[8] && numbers[9] <= numbers[1]){
			System.out.println("The lowest number is: " + numbers[9]);
		}
	}
}
