package com.hackerrank;

public class Practice {

  public static int highestHourglassSum(int[][] array) {

    int[] highestSum = new int[1];
    for (int i = 0; i < array.length - 2; i++) {
      for (int j = 0; j < array[i].length - 2; j++) {
        int sumTopRow = array[i][j] + array[i][j + 1] + array[i][j + 2];
        int sumMiddleRow = array[i + 1][j + 1];
        int sumBottomRow = array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
        int sumThisHourGlass = sumTopRow + sumMiddleRow + sumBottomRow;
        if (sumThisHourGlass > highestSum[0]) {
          highestSum[0] = sumThisHourGlass;
        }
      }
    }

    // determine how to identify an hour glass

    // for each hourglass:
    // add the top row together
    int sumTopRow = array[0][0] + array[0][1] + array[0][2];
    int sumMiddleRow = array[1][1];
    int sumBottomRow = array[2][0] + array[2][1] + array[2][2];
    int sumFirstHourGlass = sumTopRow + sumMiddleRow + sumBottomRow;
    // add the middle int
    // add the bottom row
    // store the value

    // find the largeset value

    return highestSum[0];
  }


  public static void main(String[] args) {
    int[][] array = {{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0},
        {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};
    System.out.println(highestHourglassSum(array));


  }
}


