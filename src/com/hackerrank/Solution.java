package com.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

  private static final Scanner scanner = new Scanner(System.in);

  public static int findConsecutiveOnes(char[] array) {
    int longestConsecutiveOnes = 0;
    int consectutiveOnes = 0;
    for (char character : array) {
      if (character == '1') {
        consectutiveOnes++;
        if (consectutiveOnes > longestConsecutiveOnes) {
          longestConsecutiveOnes = consectutiveOnes;
        }
      } else {
        consectutiveOnes = 0;
      }
    }
    return longestConsecutiveOnes;
  }


  public static void main(String[] args) throws IOException {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    scanner.close();
    // convert a base 10 integer to base 2
    Integer input = n;
    String binaryString = Integer.toBinaryString(input);
    System.out.println(binaryString);
    int consecutiveOnes = findConsecutiveOnes(binaryString.toCharArray());
    System.out.println("Sets of consecutive 1's: " + consecutiveOnes);
  }
}
