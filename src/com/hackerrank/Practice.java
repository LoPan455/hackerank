package com.hackerrank;

import java.util.Arrays;

public class Practice {

  public static int highestHourglassSum(int[][] array) {

    int[] hourglassSums = new int[16];
    int hourglassCounter = 0;
    for (int i = 0; i < array.length - 2; i++) {
      for (int j = 0; j < array[i].length - 2; j++) {
        int sumTopRow = array[i][j] + array[i][j + 1] + array[i][j + 2];
        int sumMiddleRow = array[i + 1][j + 1];
        int sumBottomRow = array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
        int sumThisHourGlass = sumTopRow + sumMiddleRow + sumBottomRow;
        hourglassSums[hourglassCounter] = sumThisHourGlass;
        hourglassCounter++;
        }
      }
    Arrays.sort(hourglassSums);
    return hourglassSums[15];
    }


  public static void main(String[] args) {
    int[][] array = {{-1,-1,0,-9,-2,-2}, {-2,-1,-6,-8,-2,-5}, {-1,-1,-1,-2,-3,-4}, {-1,-9,-2,-4,-4,-5},
        {-7,-3,-3,-2,-9,-9}, {-1,-3,-1,-2,-4,-5}};
    System.out.println(highestHourglassSum(array));
  }
}


