import java.util.Scanner;
public class Time {
	
	private static int second = (int)System.currentTimeMillis() / 1000 % 60;
	public static int getSecond() {
		return second;
	}
	
	private static int minute = (int)System.currentTimeMillis() / 60000 % 60; 
	public static int getMinute() {
		return minute;
	}
	
	private static int hour = (int)System.currentTimeMillis() / 3600000 % 24;
	public static int getHour() {
		return hour;
	}
	
	private static void standardTime() {
		getSecond();
		getMinute();
		getHour();
		System.out.println("The current time is: " + hour + " hours, " + minute + " minutes, and " + second + " seconds, GMT");
	}
	
	public static void setTime(long elapsedTime) {
		double eT = System.currentTimeMillis() - elapsedTime;
		int eS = (int)elapsedTime / 1000 % 60;
		int eM = (int)elapsedTime / 60000 % 60;
		int eH = (int)elapsedTime / 3600000 % 24;
		System.out.print("The elapsed time \"" + elapsedTime + "\" since 00:00:00 Jan 1 1970 is:\n"
		+ eH + " hours, " + eM + " minutes, and " + eS + " seconds");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		standardTime();	
		System.out.print("Enter an amount of milliseconds: ");
		long elapsedTime = sc.nextLong();
		setTime(elapsedTime);
	}
}