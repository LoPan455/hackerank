package com.hackerrank;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int varInt;
        double varDouble;
        String varString;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        varInt = scan.nextInt();
        varDouble = scan.nextDouble();
        scan.nextLine();
        varString = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(varInt + i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(varDouble + d);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + varString);

        scan.close();
    }
}
