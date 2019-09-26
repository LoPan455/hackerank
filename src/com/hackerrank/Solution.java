package com.hackerrank;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
  int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {

  public int divisorSum(int n) {
    int result = 0;
    LinkedList<Integer> divisors = new LinkedList<Integer>();
    for (int i = 0; i <= n ; i++) {
      if (i > 0 && n % i == 0) {
        result = result + i;
      }
    }
    return result;
  }
}

class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();

    AdvancedArithmetic myCalculator = new Calculator();
    int sum = myCalculator.divisorSum(n);
    System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
    System.out.println(sum);
  }
}

