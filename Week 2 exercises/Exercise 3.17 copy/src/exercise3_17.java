import java.util.Scanner;

public class exercise3_17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
				
		int computerChoice = (int) (Math.random() * 10 % 3);
		
		System.out.println("scissor (0), rock (1), paper (2): ");
		int userChoice = input.nextInt();

		if (userChoice > 2) {
			System.out.println("Invalid choice please try again.");
		}
		
		else if (userChoice == 0 && computerChoice == 2) {
			System.out.println("The computer is paper. You are scissor. You win");
		}
		else if (userChoice == 0 && computerChoice == 1) {
			System.out.println("The computer is rock. You are scissor. You lose");
		}
		else if (userChoice == 0 && computerChoice == 0) {
			System.out.println("The computer is scissor. You are scissor too. It is a draw");
		}
		else if (userChoice == 1 && computerChoice == 2) {
			System.out.println("The computer is paper. You are rock. You lose");
		}
		else if (userChoice == 1 && computerChoice == 1) {
			System.out.println("The computer is rock. You are rock too. It is a draw");
		}
		else if (userChoice == 1 && computerChoice == 0) {
			System.out.println("The computer is scissor. You are rock. You win");
		}
		else if (userChoice == 2 && computerChoice == 2) {
			System.out.println("The computer is paper. You are paper too. It is a draw");
		}
		else if (userChoice == 2 && computerChoice == 1) {
			System.out.println("The computer is rock. You are paper. You win");
		}
		else if (userChoice == 2 && computerChoice == 0) {
			System.out.println("The computer is scissor. You are paper. You lose");			
		}
			
			
			
			
	}

}
