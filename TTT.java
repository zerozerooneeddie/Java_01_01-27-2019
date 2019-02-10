
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
	static String[] box;// array hold//
	static String turn; // var per play//
		
	
	public static void main(String[] args) {


		String ans = "";

			    do {

		text = new Scanner(System.in);
		box = new String[9];
		turn = "X";
				
		String whoWin = null;

		 
		DisplayEmptyBoard(); // To display Empty Board //
				
				System.out.println("");
				System.out.println(""); 
			//Player 1 is X, Player 2 is O //
				System.out.println("\t \t--0x0x0x0x0x0x0x0x0x0x0x0x0x0x0--");
				System.out.println("");
				System.out.println("\t \t Welcome to Tic Tac Toe ver EB.2");
				System.out.println("");
				System.out.println("\t \t--0x0x0x0x0x0x0x0x0x0x0x0x0x0x0--");
		 		System.out.println("");
			    System.out.println("");


				System.out.println("");
			    System.out.println("Player 1 Enter your name:");
			    String playera = text.next();
			    System.out.println("Player 2 Enter your name");
			    String playerb = text.next();

			    System.out.println("");


				System.out.println("-----------------------------------------------------------------");
		 		System.out.println(" | Let's Play Tic Tac Toe "  + playera + "  and  " + playerb + "! |");
		 		System.out.println("-----------------------------------------------------------------");
		 		System.out.println("");

				System.out.println("");

				printBoard();
				System.out.println("+-----------------------------------------------------------------+");
				System.out.println(" Player 1. Enter a box number to place X in:");
				System.out.println("+-----------------------------------------------------------------+");
		//While loop starts here//
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
					if (box[numA-1].equals(String.valueOf(numA))) {
						box[numA-1] = turn; // code to determine who will play next//
						if (turn.equals("X")) {
							turn = "O";
						} else {
							turn = "X";
						}
						printBoard();
						whoWin = checkWinner(playera, playerb); // call checkWinner //
					} else {
						System.out.println("This slot is taken! Choose another slot number:");
						continue;
					}
				}
				if (whoWin.equalsIgnoreCase("draw")) {
					System.out.println("It's a draw!");
				} else {
					System.out.println("+----------------------------------------------------------------------------------------------------------+");
					System.out.println("\t Congratulations! " + whoWin + " won this game!" + " Thank you for playing " + playera + "  and  " + playerb + "!" );
					System.out.println("+-----------------------------------------------------------------------------------------------------------+");
				}
					System.out.println("****************************************************");
					System.out.println("Do you want to play again ([Y] / n)? ");
					System.out.println("****************************************************");
		        	ans = text.next();
		        }while (ans.equals("Y") || ans.equals("y"));


			
	}// end of main //

//--------------------------------------------------------------------Case statement here ---------------------------//
	static String checkWinner(String playera, String playerb) {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = box[0] + box[1] + box[2];
				break;
			case 1:
				line = box[3] + box[4] + box[5];
				break;
			case 2:
				line = box[6] + box[7] + box[8];
				break;
			case 3:
				line = box[0] + box[3] + box[6];
				break;
			case 4:
				line = box[1] + box[4] + box[7];
				break;
			case 5:
				line = box[2] + box[5] + box[8];
				break;
			case 6:
				line = box[0] + box[4] + box[8];
				break;
			case 7:
				line = box[2] + box[4] + box[6];
				break;
			}
			if (line.equals("XXX")) {
				return playera;
			} else if (line.equals("OOO")) {
				return playerb;
			}
		}

		for (int a = 0; a < 9; a++) {

			if (Arrays.asList(box).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "draw";
		}

		System.out.println("+-----------------------------------------------------------------+");
		System.out.println(turn + "'s turn; enter a box number to place " + turn + " in:");
		System.out.println("+-----------------------------------------------------------------+");
		return null;
	} //end of checkwinner//

//---------------------------------	---------------------------------------------------------------------//

	static void printBoard() {
		System.out.println("\t \t+---|---|---+");
		System.out.println("\t \t| " + box[0] + " | " + box[1] + " | " + box[2] + " |");
		System.out.println("\t \t|-----------|");
		System.out.println("\t \t| " + box[3] + " | " + box[4] + " | " + box[5] + " |");
		System.out.println("\t \t|-----------|");
		System.out.println("\t \t| " + box[6] + " | " + box[7] + " | " + box[8] + " |");
		System.out.println("\t \t+---|---|---+");
	}

			static void DisplayEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			box[a] = String.valueOf(a+1);
		}

   				}//end of DEB//
    	




}//------------close----//
