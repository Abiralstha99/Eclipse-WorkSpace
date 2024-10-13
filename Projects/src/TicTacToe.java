import java.util.*;
public class TicTacToe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Board
		char board [][] = new char [3][3];
		for (int row = 0;row<3;row++) {
			for (int col = 0 ; col<3 ; col++) {
				 board[row][col] = ' ';
			}
		}
		char player = 'X';
		boolean gameOver = false;
		Scanner sc = new Scanner (System.in);
		while(!gameOver) {
			
			//Creating a print function to print the board 
			printBoard(board);
			System.out.println("Player " + player + " enter: ");
			int row = sc.nextInt();
			int col = sc.nextInt();
			if (board[row][col] == ' ') {
				//place the element
				board[row][col] = player;
				gameOver = haveWon(board, player);
				if (gameOver) {
					System.out.println("Player " + player + " has won ");
				}
				else {
					if (player == 'X') {
						player = 'O' ;
					}
					else {
						player = 'X';
					}
				}
			}
			else {
				System.out.println("Invalid input ! Try again ");
			}
		}
	}
	
	public static void printBoard(char [][] board) {
		for (int row = 0;row<3;row++) {
			for (int col = 0 ; col<3 ; col++) {
				System.out.print(board[row][col]);
				if (col<2) {
					System.out.print("|");
				}
			}
				System.out.println();
				if (row<2) {
					System.out.println("-----");
				}
		}
	}
	
	public static boolean haveWon (char [][] board, char player) {
		//check the rows 
		for (int row = 0;row<3;row++) {		
				 if (board[row][0] == player && board[row][1] ==player && board[row][2] == player ) {
					 return true;
			}
		}
		
		//check the column
			for (int col = 0 ; col<3 ; col++) {
				 if (board[0][col] == player && board[1][col] ==player && board[2][col] == player ) {
					 return true;
				 }
			}
		
		//check diagonally
				 if (board[0][0] == player && board[1][1] ==player && board[2][2] == player ) {
					 return true;
				 }
				 
				 if (board[0][2] == player && board[1][1] ==player && board[2][0] == player ) {
					 return true;
				 }
		return false;
	}

}
