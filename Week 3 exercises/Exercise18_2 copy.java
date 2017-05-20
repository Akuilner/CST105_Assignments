import java.util.Scanner;
public class Exercise18_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an index for a Fibonacci number: ");
		int n = sc.nextInt();
		int f0 = 0; 
		int f1 = 1;
		int currentFib = 0;
		for (int i = 1; i<= n; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}
		System.out.println("The Fibonacci number for index: " + n + " is " + f0);
	}
}