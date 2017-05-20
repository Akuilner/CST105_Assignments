import java.util.Scanner;

public class Exercise18_25 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String s = sc.next();
	System.out.println("The list of permutations of string \"" + s + "\" is: ");
	displayPermutation(s);
	
	
	}
	public static void displayPermutation(String s) {
		displayPermutation("", s);
	}
	public static void displayPermutation(String s1, String s2) {
		if (s2.isEmpty()) 
			System.out.println(s1);
			else {
				for (int i = 0; i < s2.length(); i++) {
					displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
				}
			}
	}	
}
