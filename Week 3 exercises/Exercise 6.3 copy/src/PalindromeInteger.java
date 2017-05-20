import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number = sc.nextInt();
		int number2 = reverse(number);
		
		
	}
	
	public static int reverse(int number) {
		int palindrome = number;
		System.out.println("Integer is a palindrome: " + isPalindrome(palindrome));
		return palindrome;
		
	}
	public static boolean isPalindrome(int number) {
		boolean	isPalindrome;
		if (number / 100 != number % 10) {
		isPalindrome = false;
	}
	else {
		isPalindrome = true;
	}
	return isPalindrome;
	
}
}