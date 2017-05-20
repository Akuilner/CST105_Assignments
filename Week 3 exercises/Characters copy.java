import java.util.Scanner;

public class Characters {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String ch1, ch2;
		System.out.print("Enter two characters separated by a space (a b): ");
		ch1 = sc.next();
		ch2 = sc.next();
		System.out.println("Enter a number of characters per line:");
		int nPL = sc.nextInt();
		
		printChars(ch1.charAt(0), ch2.charAt(0), nPL);
		
	}
	public static void printChars(char ch1, char ch2, int numberPerLine) {					
	int difference = (int) (ch2 - ch1);
	for (int i = 1; i < difference; i++) {
		System.out.print(++ch1 + " ");
		if (i % numberPerLine == 0) 
			System.out.print("\n");
		
	}
		
		
		
		
		
	}
	
	
}
