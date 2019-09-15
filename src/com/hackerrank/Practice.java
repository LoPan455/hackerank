package com.hackerrank;

public class Practice {

  // Multiply 'n' by 'k' using addition:
  private static int nTimesK(int n, int k) {
    System.out.println("n: " + n);
    // Recursive Case
    if(n > 1) {
      return k + nTimesK(n - 1, k);
    }
    // Base Case n = 1
    else {
      return k;
    }
  }

  public static int Summation(int n) {
    if (n <= 0) {
      return 0;
    } else {
      return n + Summation(n - 1);
    }
  }

  public static void main(String[] args) {
    int result = nTimesK(4,4);
    System.out.println("Result: " + result);
  }


}
