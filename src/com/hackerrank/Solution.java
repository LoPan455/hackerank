package com.hackerrank;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    scanner.close();

    for (int i = 1; i <= 10 ; i++) {
      System.out.println(n + " x " + i + " = " + n*i);
    }
  }
}

