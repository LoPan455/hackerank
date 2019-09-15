package com.hackerrank;

import java.util.Scanner;

public class Person {

  private int age;

  public Person(int intialAge) {
    if (intialAge >= 0) {
      this.age = intialAge;
    } else {
      this.age = 0;
      System.out.println("Age is not valid, setting age to 0.");
    }
  }

  public void yearPasses() {
    this.age += 1;
  }

  public void amIOld() {
    String statement = "";
    if (this.age < 13) {
      statement = "You are young.";
    } else if (this.age >= 13 && this.age < 18) {
      statement = "You are a teenager.";
    } else {
      statement = "You are old.";
    }

    System.out.println(statement);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      int age = sc.nextInt();
      Person p = new Person(age);
      p.amIOld();
      for (int j = 0; j < 3; j++) {
        p.yearPasses();
      }
      p.amIOld();
      System.out.println();
    }
    sc.close();
  }
}
