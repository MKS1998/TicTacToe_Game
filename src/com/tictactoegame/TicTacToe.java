package com.tictactoegame;

import java.util.*;

public class TicTacToe {

	static char[] board = new char[10];
	static Scanner sc = new Scanner(System.in);
	public static void ticTakToeInitialization() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
	}

	private static void playerChoose() {	
		System.out.println("Player choose X or O");
		char playerChoose = sc.next().charAt(0);
		if (playerChoose == 'X' || playerChoose == 'x') {
			System.out.println("Player Chosen X");
			System.out.println("Computer Choice O");
		} else {
			System.out.println("Player Chose O");
			System.out.println("Computer Choice X ");
		}
	}

	private static void showBoard() {
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("-----------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("-----------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);

	}
	public static void playerMove() {
        System.out.println("Select Position in Index to Move in Board (1 to 9) : ");
        int indexNumber = sc.nextInt();
        if (indexNumber < 1 || indexNumber > 9) {
            System.out.println("You Entered Invalid Position ");
            playerMove();
        } else {
            char playerChoice = 0;
			board[indexNumber] = playerChoice;
            showBoard();
        }

    }

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		ticTakToeInitialization();
		playerChoose();
		showBoard();
	}

}
