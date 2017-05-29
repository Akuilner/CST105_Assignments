import java.util.Scanner;
public class Exercise8_9 {
	
	final int win = 0;
	final int draw = 1;
	final int cont = 2;
	

	String[][] board = {{" ", " ", " "} , 
						{" ", " ", " "} , 
						{" ", " ", " "}};

	
	//Array for testing
	/** String[][] board = {{" ", " ", " "} , 
						    {"X", "X", "X"} , 
						    {" ", " ", " "}};
	*/					
	
	public void printout() {
		int row;
		int col;
		
		System.out.print("——————-—————— \n");
		
		for (row = 0; row < 3; row++)
		{
			System.out.print("| ");
			for (col = 0; col < 3; col++)
				System.out.print(board[row][col] + " | ");
			System.out.print("\n——————-—————— \n");
			
		}
		
		
		
	}
	
	public int checkStatus() {
		boolean keepGoing = false;
		
		String testValue;
		
		for (int row = 0; row < 3; row++)
		{
			testValue = board[row][0];
			if (testValue == " ")
			{
				keepGoing = true;
				continue;
			}
				
			if (board[row][0] == board[row][1] && board[row][0] == board[row][2])
			{
				System.out.print(board[row][0] + " player won!");
				return win;
			}
			
			else if (board[row][1] == " " || board[row][2] == " ")
			{
				keepGoing = true;
				return cont;
			}	
		}
		
		for (int col = 0; col < 3; col++)
		{
			testValue = board[0][col];
			if (testValue == " ")
			{
				keepGoing = true;
				continue;
			}
				
			if (board[0][col] == board[1][col] && board[0][col] == board[2][col])
			{
				System.out.print(board[0][col] + " player won!");
				return win;
			}
			
			else if (board[col][1] == " " || board[col][2] == " ")
			{
				keepGoing = true;
				return cont;
			}	
			
		}
		
		//check first diagonal "\"
		testValue = board[0][0];
		if (testValue != " ") {
			if (testValue == board[1][1] && testValue == board[2][2])
			{
				System.out.print(testValue + " player won!");
				return win;
			}
			
			else if (board[0][0] == " " || board[1][1] == " " || board[2][2] == " ")
			{
				keepGoing = true;
				return cont;
			}	
			
		}
			
		//check second diagonal "/"
		testValue = board[0][2];
		if (testValue != " ")
		{
				
			if (testValue == board[1][1] && testValue == board[2][0])
			{
				System.out.print(testValue + " player won!");
				return win;
			}
			
			else if (board[0][2] == " " || board[1][1] == " " || board[2][0] == " ")
			{
				keepGoing = true;
				return cont;
			}	
			
		}
		
		if (keepGoing == false)
		{
			System.out.print("It is a draw!");
			return draw;
		}
		
		else
			return cont;
			
	}
	
	public boolean setValue(int row, int column, String player) {
		if (row < 0 || row > 2 ||column < 0 || column > 2)
			return false;
		
		if (board[row][column] == " ")
		{		
			board[row][column] = player;
			return true;
		}	
		else 
			return false;
	}
	
	public void startGame(){
	int row;
	int col;
	
	for (row = 0; row < 3; row++)
		for (col = 0; col < 3; col++)
			board[row][col] = " ";
	
	
	}
	
	public void playGame() {
		Scanner sc = new Scanner(System.in);
		startGame();
		printout();
		int status = cont;
		String currentPlayer;
		
		currentPlayer = "X";
		
		while (1 == 1) 
		{
			System.out.print("Enter a row (0, 1, or, 2) for player " + currentPlayer + ": ");
			int playerRow = sc.nextInt();
			
			System.out.print("Enter a column (0, 1, or 2) for player " + currentPlayer + ": ");
			int playerCol = sc.nextInt();
			
			
			if (setValue(playerRow, playerCol, currentPlayer))
			{
				printout();
				if (checkStatus() != cont)
					return;
				
				if (currentPlayer == "X")
					currentPlayer = "O";
				else 
					currentPlayer = "X";	
			}
			
			else 
			{
				System.out.print("Invalid move, please try again\n");
			}
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {	
		Exercise8_9 TTT = new Exercise8_9(); 
		/**TTT.startGame();
		TTT.printout();
		TTT.checkStatus();*/
		TTT.playGame();
	}

	
	
}
