import java.util.Scanner;
public class Exercise5_21 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Loan amount: ");
	double lA = sc.nextDouble();
	System.out.print("Number of Years: ");
	int years = sc.nextInt();
	System.out.print("Interest rate  \t   Monthly Payment\tTotal Payment\n\n");
	for (double i = 5; i <= 8; i += 0.125) {	
		double iR = i / 100;
		double mIR = iR / 12;
		double mP = lA * mIR / (1 - 1 / Math.pow(1 + mIR,  years * 12)); 
		double tP = mP * years * 12;
		
		System.out.printf("%5.3f", i);
		System.out.print("%");
		System.out.printf("\t\t   %7.2f",  mP );
		System.out.printf("\t\t%7.2f", tP);
		System.out.print("\n");
	};
	}
}
