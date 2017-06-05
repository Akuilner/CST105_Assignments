import java.util.Scanner;

public class Student 
	extends Person {
	
	final String status1 = "Freshman";
	final String status2 = "Sophomore";
	final String status3 = "Junior";
	final String status4 = "Senior";
	
	public String status(int status) {
		if (status == 1)
			return status1;
		
		if (status == 2)
			return status2;
		
		if (status == 3)
			return status3;
		
		if (status == 4)
			return status4;
		return null;

	}
		
	public void printStudent(String name, int year) {
		setName(name);
		System.out.print(getName() + " is a " + status(year));
	}
	
	public int checkYear(int year) {
		if (year > 4 || year < 1)	
		{
			System.out.print("\nInvalid year\n\n");
			int newYear = printYear();
			year = newYear;
			checkYear(year);
		} 
		return year;			
	}	
	
	public int printYear() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("(1) Freshman,\n"
				   + "(2) Sophomore,\n"
				   + "(3) Junior,\n"
				   + "(4) Senior,\n"
				   + "Enter an integer corresponding to the student's year: ");
		int year = sc.nextInt();
			return checkYear(year);
		
	}
	
	
	public static void main(String[] args) {
		Student test = new Student();
		
		Scanner nameScan = new Scanner(System.in);
		System.out.print("Enter the student's name: ");
		String name = nameScan.nextLine();
		test.setName(name);
		String studentName = test.getName();
		
		Scanner addressScan = new Scanner(System.in);
		System.out.print("Enter the student's address: ");
		String address = addressScan.nextLine();
		test.setAddress(address);
		
		Scanner phoneScan = new Scanner(System.in);
		System.out.print("Enter the student's phone number: ");
		String phoneNumber = phoneScan.nextLine();
		test.setPN(phoneNumber);
		
		Scanner emailScan = new Scanner(System.in);
		System.out.print("Enter the student's E-mail address: ");
		String emailAddress = emailScan.nextLine();
		test.setEA(emailAddress);
		
		test.printInfo();
		
		int studentYear = test.printYear();
		
		test.printStudent(studentName, studentYear);
		
		
	}
		
}
