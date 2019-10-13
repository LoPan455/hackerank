package com.hackerrank;

import java.util.Scanner;

public class day20 {

  private static int totalSwaps = 0;

  private static void swap(int[] array, int j, int k) {
    int temp = array[j];
    array[j] = array[k];
    array[k] = temp;
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }
    // Write Your Code Here
    for (int i = 0; i < n; i++) {
      // Track number of elements swapped during a single array traversal
      int numberOfSwaps = 0;

      for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
          swap(a, j, j + 1);
          numberOfSwaps++;
        }
      }
      totalSwaps+=numberOfSwaps;

      // If no elements were swapped during a traversal, array is sorted
      if (numberOfSwaps == 0) {
        break;
      }
    }
    System.out.println("Array is sorted in " + totalSwaps + " swaps.");
    System.out.println("First Element: " + a[0]);
    System.out.println("Last Element: " + a[a.length - 1]);

  }
}
