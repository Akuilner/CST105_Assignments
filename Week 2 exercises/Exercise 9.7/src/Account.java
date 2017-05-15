import java.time.LocalDate;
import java.util.Scanner;
public class Account {
	private static int id = 0;
	static public int getID() {
		return id;
	}
	static public void setID (int ID) {
		id = ID;
	}
	
	private static double balance = 0;
	static public double getBalance() {
		return balance;
	}
	static public void setBalance(double currentBalance) {
		balance = currentBalance;
	}
	private static double annualInterestRate = 0;
	static public double getAIR() {
		return annualInterestRate;
	}
	static public void setAIR(double currentIR) {
		annualInterestRate = currentIR;
	}
	private static LocalDate dateCreated = LocalDate.now();
	static public LocalDate getDate() {
		return dateCreated;
	}
	
	public Account () {	
		getID();
		getBalance();
		getAIR();
		getDate();
	}	
	public Account (int setID, double currentBalance, double currentIR) {
		
		setID = 5;
		currentBalance = 5;
		currentIR = 5;
		getDate();
	}
	
	
	public static void main(String[] args) {
		getDate();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your ID number here:");
		int userID = input.nextInt();
		System.out.println("Enter balance here:");
		double userBalance = input.nextDouble();
		System.out.println("Enter annual interest rate here (in percent format NN%):");
		double userAIR = input.nextDouble();
		System.out.println("Withdraw or Deposit first? 0 for withdraw & 1 for deposit:");
		int decision = input.nextInt();
		switch (decision) {
		case 0: System.out.println("How much would you like to withdraw?:");
		double x = input.nextDouble(); 
		System.out.println("Remaining balance is: $" + (userBalance - x));
		System.out.println("How much would you like to deposit?:");
		double y = input.nextDouble();
		System.out.println("Remaining balance is: $" + ((userBalance - x) + y));
		System.out.println("Your monthly interest is: $" + ((((userBalance - x) + y) * (userAIR / 100)) / 12));
		System.out.println("The date you made your account is " + getDate());
		break;
		case 1: System.out.println("How much would you like to deposit?:");
		double a = input.nextDouble();
		System.out.println("Remaining balance is: $" + (userBalance + a));
		System.out.println("How much would you like to withdraw?:");
		double b = input.nextDouble();
		System.out.println("Remaining balance is: $" + ((userBalance + a) - b));
		System.out.println("Your monthly interest is: $" + ((((userBalance + a) - b) *(userAIR / 100)) / 12) );
		System.out.println("The date you made your account is " + getDate());
		break;
		
		}
				
	}

	
	
	
}
