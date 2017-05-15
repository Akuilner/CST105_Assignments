import java.util.Scanner;

public class Exercise3_5 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println(
	"Enter Today's day (Sunday = 0) : " );
	int numberOfDay = input.nextInt();
	if (numberOfDay > 6)  {
	System.out.println("Six is the highest integer allowed, please reset and try again.");
	
	}
	else {	
	switch (numberOfDay) {
	case 0: System.out.println("The day is Sunday"); break;
	case 1: System.out.println("The day is Monday"); break;
	case 2: System.out.println("The day is Tuesday"); break;
	case 3: System.out.println("The day is Wednesday"); break;
	case 4: System.out.println("The day is Thursday"); break;
	case 5: System.out.println("The day is Friday"); break;
	case 6: System.out.println("The day is Saturday"); break;	
			}				
		
	System.out.println("Enter a number of days from selected day: ");
	int futureDays = input.nextInt();
	
	
	if(futureDays % 7 > 6)   {
	System.out.println("Invalid Integer please reset and try again.");	
	}
	
	switch ((futureDays + numberOfDay) % 7) {
	case 0: System.out.println("The future day is Sunday"); break;
	case 1: System.out.println("The future day is Monday"); break;
	case 2: System.out.println("The future day is Tuesday"); break;
	case 3: System.out.println("The future day is Wednesday"); break;
	case 4: System.out.println("The future day is Thursday"); break;
	case 5: System.out.println("The future day is Friday"); break;
	case 6: System.out.println("The future day is Saturday"); break;
	
	}	
	
	
}						
	}

}
