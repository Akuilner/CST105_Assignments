import java.util.Scanner;
public class Exercise18_15 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.print("Enter a string: ");
	String str = sc.next();
	System.out.print("Enter a character: ");
	String letter = sc.next();
	char a = letter.charAt(0);
	System.out.println("The count of " + "\"" + a + "\"" + " is: " + count(str, a));
	
	}
	public static int count(String str, char a) {
	return count(str, a, str.length());		
	}
	public static int count(String str, char a, int high) {
		int count = str.indexOf(a);
		if (str.indexOf(a) == -1)
			return 0;
		else {
			String rest = str.substring(count + 1, str.length());
			return count(rest, a, high) + 1;
		
	}
	
}
}
