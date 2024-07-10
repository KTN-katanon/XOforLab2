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

}
