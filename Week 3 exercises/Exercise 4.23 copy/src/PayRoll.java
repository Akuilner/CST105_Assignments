import java.util.Scanner;

public class PayRoll {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employee's name:");
	String eN = sc.next();
	System.out.println("Enter number of hours worked in a week:");
	double wT = sc.nextDouble();
	System.out.println("Enter hourly pay rate:");
	double pR = sc.nextDouble();
	System.out.println("Enter federal tax witholding rate:");
	double fT = sc.nextDouble();
	System.out.println("Enter state tax witholding rate:");
	double sT = sc.nextDouble();
	double gP = pR * wT;
	double d1 = fT *  gP;
	double d2 = sT * gP;
	double d3 = d1 + d2;
	double nP = gP - d3;
	System.out.println("");
	System.out.println("Employee Name: " + eN);
	System.out.println("Hours Worked: " + wT);
	System.out.println("Pay Rate: $" + pR);
	System.out.println("Gross Pay: $" + gP);
	System.out.println("Deductions:");
	System.out.printf("  Federal Witholding (" + (fT * 100) + "%) : $%4.2f", d1);
	System.out.println("");
	System.out.printf("  State Witholding (" + (sT * 100) + "%) : $%4.2f", d2);
	System.out.println("");
	System.out.printf("  Total Deduction: $%4.2f", d3);
	System.out.println("");
	System.out.printf("Net Pay: $%4.2f", nP);
	
	}

}
