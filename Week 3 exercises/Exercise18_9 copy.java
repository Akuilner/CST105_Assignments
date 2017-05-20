import java.util.Scanner;

public class Exercise18_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String word = sc.nextLine();
	String drow = reverseString(word);
	System.out.println("The string: " + word + " backwards is: " + drow);		
	}
	public static String reverseString(String word){
	    int length = word.length();
	    if (length == length*3){
	     return "";
	    }
	    return word.substring(length-1, length) +  reverseString(word.substring(0, length-1));
	}
}