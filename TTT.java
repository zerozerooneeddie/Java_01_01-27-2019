
/*Java 1 Tic Tac Toe Game 
: Eddielyn Bautista
*credits to MeneXia (Xavi Ablaza) as my reference
*/

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TTT {
	static Scanner text;
	//static Scanner sc;
	static String[] board;
	static String turn;
		
	
	public static void main(String[] args) {


		

		text = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String whoWin = null;
		DisplayEmptyBoard(); // To display Empty Board //
 			 
			//Player 1 is X, Player 2 is O //
		System.out.println("--0x0x0x0x0x0x0x0x0x0x0x0x0x0x0--");
		System.out.println("");
		System.out.println(" Welcome to Tic Tac Toe ver EB.2");
		System.out.println("");
		System.out.println("--0x0x0x0x0x0x0x0x0x0x0x0x0x0x0--");
 		System.out.println("");
	System.out.println("");

	  
    System.out.println("Player 1 Enter your name:");
    String playera = text.next();
    System.out.println("Player 2 Enter your name");
    String playerb = text.next();

		 System.out.println("-----------------------------------------------------------------");
 		System.out.println(" | Let's Play Tic Tac Toe "  + playera + "  and  " + playerb + "! |");
 		 System.out.println("-----------------------------------------------------------------");
 			System.out.println("");

System.out.println("");




		printBoard();
		System.out.println("Player 1. Enter a slot number to place X in:");

		while (whoWin == null) {
			int numA;
			try {
				numA = text.nextInt();
				if (!(numA > 0 && numA <= 9)) {
					System.out.println("Invalid number! Enter slot number:");
				
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid number! Enter slot number:");
				continue;
			}
			if (board[numA-1].equals(String.valueOf(numA))) {
				board[numA-1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				printBoard();
				whoWin = checkWinner(); // call checkWinner //
			} else {
				System.out.println("This slot is taken! Choose another slot number:");
				continue;
			}
		}
		if (whoWin.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw!");
		} else {
			System.out.println("Congratulations! " + whoWin + "'s won this game!" + " Thank you for playing " + playera + "  and  " + playerb + "!" );
		}
	}


	static String checkWinner() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "Player 1";
			} else if (line.equals("OOO")) {
				return "Player 2";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "draw";
		}

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}

			

	static void printBoard() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}

			static void DisplayEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}


	}
}