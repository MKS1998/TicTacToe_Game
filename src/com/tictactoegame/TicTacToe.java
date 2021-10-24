package com.tictactoegame;
import java.util.*;

public class TicTacToe {

	static char[] board = new char[10];

	public static void ticTakToeInitialization() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
	}

	static void playerChoose() {
		Scanner sc = new Scanner(System.in);
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

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		ticTakToeInitialization();
		playerChoose();
	}

}
