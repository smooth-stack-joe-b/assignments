package com.smst.week1.day2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class addNumbers {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<Integer>();
    Integer sum = 0;

    while (true) {
      System.out.println("Type a number! Or type quit to exit.");
      Integer currentNum;
      try {
        currentNum = input.nextInt();
        numbers.add(currentNum);
      } catch (InputMismatchException ex) {
        String exit = input.next();
        if (exit.equalsIgnoreCase("quit")) {
          break;
        }
      }
    }
    input.close();

    for (Integer num : numbers) {
      sum += num;
    }

    System.out.println(sum);
  }
}
