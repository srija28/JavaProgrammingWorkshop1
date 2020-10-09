package com.example;
import java.util.Random;
import java.util.*;


public class Tictactoe {
	static char[] board = new char[10];
	static char player = 'X';
	static char computer ='0';
	
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		char[] board = initializeBoard();
		toss();
		choosecoin();
		showBoard(board);
		makeMove(board);
		
		if((board[1] == 'X' && board[2] =='X' && board[3]=='X')||(board[1] == '0' && board[2] =='0' && board[3]=='0')) {
			System.out.println("you win");	
		}
		else if((board[1] == 'X' && board[4] =='X' && board[7]=='X')||(board[1] == '0' && board[4] =='0' && board[7]=='0')){
			System.out.println("you win");		
		}
		else if((board[1] == 'X' && board[5] =='X' && board[9]=='X')||(board[1] == '0' && board[5] =='0' && board[9]=='0')) {
			System.out.println("you win");	
		}
		else if((board[3] == 'X' && board[5] =='X' && board[7]=='X')||(board[3] == '0' && board[5] =='0' && board[7]=='0')) {
			System.out.println("you win");	
		}
		else if((board[2] == 'X' && board[5] =='X' && board[8]=='X')||(board[2] == '0' && board[5] =='0' && board[8]=='0')) {
			System.out.println("you win");	
		}
		else if((board[3] == 'X' && board[6] =='X' && board[9]=='X')||(board[3] == '0' && board[6] =='0' && board[9]=='0')) {
			System.out.println("you win");	
		}
		else if((board[4] == 'X' && board[5] =='X' && board[6]=='X')||(board[4] == '0' && board[5] =='0' && board[6]=='0')) {
			System.out.println("you win");	
		}
		else if((board[7] == 'X' && board[8] =='X' && board[9]=='X')||(board[7] == '0' && board[8] =='0' && board[9]=='0')) {
			System.out.println("you win");	
		}
		else {
			System.out.println("You lost");
		}
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
			player='X';
		}
		else {
			System.out.println("The computer has chosen : O ");
			
		}
	}
	
	public static void toss() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose heads or tails 1 for heads and 2 for tails");
		int chosen = sc.nextInt();
		 Random r = new Random();
		 System.out.println(r);
		   int chance = r.nextInt(2);
		   if (chance == 1) {
		      System.out.println("You flipped tails");
		   } else {
			   System.out.println("You flipped heads");
		   }
		   if(chosen==chance) {
			   System.out.println("the Player won the toss");
		   }
		   else {
			   System.out.println("The computer win the toss");
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
		
		for(int j=0;j<3;j++) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Your move :");
		int move = sc.nextInt();
		System.out.println("You have moved to your location: " + move);
		if(board[move]==' ') {
			board[move]= player;
		}
		else {
			System.out.println("Invalid entry");
		}
		
		showBoard(board);
		System.out.println("Computer move :");
		int computermove = sc.nextInt();
		System.out.println("You have moved to your location: " + move);
		if(board[computermove]==' ') {
			board[computermove]= computer;
		}
		else {
			System.out.println("Invalid entry");
		}
		
		showBoard(board);
		
		}
	}
	

}
