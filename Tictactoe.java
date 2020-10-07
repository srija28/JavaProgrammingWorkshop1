package com.example;
import java.util.*;


public class Tictactoe {
	char[] board = new char[10];
	static char player = 'X';
	
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		char[] board = initializeBoard();
		choosecoin();
		showBoard(board);
		makeMove(board);
	}
	
	public static char currentTurn = 'X';
	
	
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
	public static void showBoard(char[] board) {
		  
            System.out.println("\n "+board[1]+ " | "+board[2]+ " | "+board[3]);
            System.out.println("-----------");
            System.out.println(" "+board[4]+ " | "+board[5]+ " | "+board[6]);
            System.out.println("-----------");
            System.out.println(" "+board[7]+ " | "+board[8]+ " | "+board[9]);
    	
		
	}
	
	public static void makeMove(char[] board) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Your move :");
		int i;
		int move = sc.nextInt();
		
		System.out.println("You have moved to your location: " + move);
		if(board[move]==' ') {
			board[move]= player;
		}
		else {
			System.out.println("Invalid entry");
		}
		showBoard(board);
		
	}

}
