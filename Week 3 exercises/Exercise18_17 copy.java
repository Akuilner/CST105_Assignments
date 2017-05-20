import java.util.Scanner;

public class Exercise18_17 {
public static void main(String[] args){
    System.out.print("Enter an array: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char[] chars = new char[s.length()];
    for(int i = 0; i < s.length(); i++){
        chars[i] = s.charAt(i);
    }
    System.out.print("Enter a character: ");
    String letter = sc.next();
    char ch = letter.charAt(0);

    System.out.println("The count of \"" + ch + "\" is: "+ count(chars, ch));
}
public static int count(char[] chars, char ch)
{
    return count(chars, ch, chars.length - 1);
}
public static int count(char[] chars, char ch, int high)
{
    if (high == -1)
        return 0;
    if (chars[high] == ch)
        return 1 + count(chars, ch, high - 1);
    return count(chars, ch, high - 1);
}
}