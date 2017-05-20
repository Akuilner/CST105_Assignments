import java.util.Scanner;

public class SortNumbers {	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		displaySortedNumbers(num1, num2, num3);
		
	}



	public static void displaySortedNumbers(double num1, double num2, double num3) {
	if (num1 < num2 && num1 < num3 && num2 < num3) {
		System.out.println(num1 + " " + num2 + " " + num3);
	}
	else if (num1 < num2 && num1 < num3 && num3 < num2){
		System.out.println(num1 + " " + num3 + " " + num2);
	}
	else if (num2 < num1 && num2 < num3 && num1 < num3){
		System.out.println(num2 + " " + num1 + " " + num3);
	}
	else if (num2 < num1 && num2 < num3 && num3 < num1){
		System.out.println(num2 + " " + num3 + " " + num1);
	}
	else if (num3 < num1 && num3 < num2 && num1 < num2){
		System.out.println(num3 + " " + num1 + " " + num2);
	}
	else if (num3 < num1 && num3 < num2 && num2 < num1){
		System.out.println(num3 + " " + num2 + " " + num1);
	}
}

}


