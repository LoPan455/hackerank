package com.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    int numberOfStrings = scanner.nextInt();
    ArrayList<String> listOfStrings = new ArrayList<String>();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    while (numberOfStrings > 0) {
      String string = scanner.nextLine();
      listOfStrings.add(string);
      numberOfStrings--;
    }

    for (String string : listOfStrings) {
      char[] characterArray = string.toCharArray();
      for (int i = 0; i < string.length(); i++) {
        if (i % 2 == 0) {
          System.out.print(characterArray[i]);
        }
      }
      System.out.print(" ");
      for (int i = 0; i < string.length(); i++) {
        if (i % 2 != 0) {
          System.out.print(characterArray[i]);
        }
      }
      System.out.println();
    }
  }
}

