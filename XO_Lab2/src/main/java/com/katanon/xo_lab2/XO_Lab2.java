/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.katanon.xo_lab2;

/**
 *
 * @author nonku
 */
import java.util.*;

public class XO_Lab2 {

    private final static int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printWelcome();
    }

    private static void printWelcome() {
        System.out.println("Welcome to XO");
    }

    private static void createBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; k < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printTurn() {
        System.out.println("Turn " + currentPlayer);
    }

    private static void move() {
        while (true) {
            System.out.print("Please input rol,col: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            //check error
            if (row <= 0 || row > SIZE || col <= 0 || col > SIZE) {
                System.out.println("This position is outside of the board!");
            } else if (board[row - 1][col - 1] != '-') {
                System.out.println("Player is already in that spot!");
                // add player symbol to board
            } else {
                board[row - 1][col - 1] = currentPlayer;
                break;
            }
        }
    }

    private static void swapTurn() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else if (currentPlayer == 'O') {
            currentPlayer = 'X';
        }
    }

}
