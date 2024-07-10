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
    private static void printWelcome(){
        System.out.println("Welcome to XO");
    }
}
