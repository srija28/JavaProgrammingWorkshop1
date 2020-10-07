package com.example;

public class Tictactoe {
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		initializeBoard();
	}
	
	private static String[] board = new String[10];
	
	public static void initializeBoard() { 
	    for (int i = 0; i < board.length; i++) {
	       
	            board[i] = "-";
	            System.out.println(board[i]);
	        
	    }
	    System.out.println("Board is empty ");
	}

}
