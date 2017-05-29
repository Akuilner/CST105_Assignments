import java.util.*;

public class Exercise10_7 {
	public static void main(String[] args) {
	createID();	
	}

	public static void createID() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter an id: ");
		int id = sc.nextInt();		
		setID(id);
		System.out.print("Your ID is: " + getID() + "\n"		
				+ "Is this correct? (Enter \"y\" for yes, any other letter for no) : ");
		String answer = sc.next();
		if (answer.equals("y")){
			mainMenu();}
		else
			createID();
	}
	public static void mainMenu() {
		Scanner sc = new Scanner(System.in);
			System.out.print("\n\nMain Menu\n"
					+ "1: check balance:\n"
					+ "2: withdraw\n"
					+ "3: deposit\n"
					+ "4: exit\n"
					+ "Enter a choice: ");
		int selection = sc.nextInt();
			switch (selection) {
			case 1: System.out.printf("The balance is $%4.2f", getBalance());
				mainMenu();
				break;
				
			case 2: System.out.print("Enter an amount to withdraw: ");
				double withdrawal = sc.nextDouble();
				if (withdrawal > balance){
					System.out.print("You cannot withdraw that much!");
					mainMenu();}
				else {
					withdraw(withdrawal);
					mainMenu();}
				break;
				
			case 3: System.out.print("Enter an amount to deposit: ");
				double deposit = sc.nextDouble();
				deposit(deposit);
				mainMenu();
				break;
				
			case 4: createID();
			break;
			}
	}
	private static int id = 0;
	static public int getID() {
		return id;}
		static public void setID (int ID) {
		id = ID;
	}
	
	private static double balance = 100;
	static public double getBalance() {
		return balance;}
		static public void setBalance(double currentBalance) {
		balance = currentBalance;
	}	
	public static void withdraw(double withdrawal) {
		setBalance(balance - withdrawal);
	}
	public static void deposit(double deposit) {
		setBalance(balance + deposit);
	}
}
