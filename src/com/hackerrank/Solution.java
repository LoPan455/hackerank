package com.hackerrank;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.*;
import java.io.*;

class InvalidNumberException extends Exception {

  @Override
  public String getMessage() {
        return "n and p should be non-negative";
  }
}

class Calculator {
  int power(int n, int p) throws InvalidNumberException {
      if (n >= 0 && p >= 0) {
        return (int) Math.pow(n, p);
      } else {
        throw new InvalidNumberException();
      }
    }
  }

class Solution{

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t-- > 0) {

      int n = in.nextInt();
      int p = in.nextInt();
      Calculator myCalculator = new Calculator();
      try {
        int ans = myCalculator.power(n, p);
        System.out.println(ans);
      }
      catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    in.close();
  }
}

