package com.example;
import java.util.*;

public class Tictactoe {
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		char[] board = initializeBoard();
		choosecoin();
	}
	
	
	public static char[] initializeBoard() { 
		char[] board = new char[10];
	    for (int i = 0; i < board.length; i++) { 
	            board[i] = ' ';
	            System.out.println("board: "+ board[i]);  
	    }
		return board;
	}
	
	public static void choosecoin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coin you want (Should be either X or O)");
		String player = sc.next();
		System.out.println("The player has chosen : "+player);
		if(player=="O") {
			System.out.println("The computer has chosen : X ");
		}
		else {
			System.out.println("The computer has chosen : O ");
		}
	}

}
