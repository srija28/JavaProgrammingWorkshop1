package com.example;
import java.util.*;

public class Tictactoe {
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		char[] board = initializeBoard();
	}
	
	//private static char[] board = new char[10];
	
	public static char[] initializeBoard() { 
		char[] board = new char[10];
	    for (int i = 0; i < board.length; i++) { 
	            board[i] = ' ';
	            System.out.println("board: "+ board[i]);  
	    }
		return board;
	}

}
