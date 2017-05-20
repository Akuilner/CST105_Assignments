import java.util.Scanner;

public class TimeConversion2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time in decimal format (4.5 = 4:30):");
		double time = sc.nextDouble();
		double minute = time % 1;
		double hour = (int)time / 1;
		double minute2 = 60d * minute;
		int finalMinute = (int)minute2;
		int finalHour = (int)hour;
		System.out.print("The time in standard format is " + finalHour + " hours, and " + finalMinute + " minute(s)");
	}

}
