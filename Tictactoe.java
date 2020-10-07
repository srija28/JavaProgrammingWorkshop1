package com.example;
import java.util.*;

public class Tictactoe {
	
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		char[] board = initializeBoard();
		choosecoin();
		showBoard(board);
	}
	
	
	public static char[] initializeBoard() { 
		char[] board = new char[10];
	    for (int i = 0; i < board.length; i++) { 
	            board[i] = ' '; 
	    }
		return board;
	}
	
	public static void choosecoin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coin you want (Should be either X or 0)");
		char player = sc.next().charAt(0);
		System.out.println("The player has chosen : "+player);
		if(player=='0') {
			System.out.println("The computer has chosen : X ");
		}
		else {
			System.out.println("The computer has chosen : O ");
		}
	}
	public static void showBoard(char[] showBoard) {
		for (int i = 0; i < 10; i++) { 
           
            System.out.println("Board position : "+showBoard[i]);
    }
		
	}

}
