package com.smst.week1;

import java.util.Scanner;
import java.util.Random;

public class numberGuesser {
  public static void main(String[] args) throws Exception {

    System.out.println("Welcome to the number guesser! (between 1 - 100)");
    System.out.println("If your guess is within 10 of the number, you win!");
    System.out.println("You have 5 guesses to guess the number!");

    Scanner myScanner = new Scanner(System.in);

    Random rand = new Random();
    int upperbound = 99;
    int random_num = rand.nextInt(upperbound) + 1;
    int low_threshold = random_num - 10;
    int high_threshold = random_num + 10;

    int guessesLeft = 5;

    while (guessesLeft > -1) {
      System.out.println(String.format("You have %d guesses left.", guessesLeft));
      System.out.println("What's your guess?");

      int currentGuess = myScanner.nextInt();

      if (currentGuess >= low_threshold && currentGuess <= high_threshold) {
        break;
      }
      guessesLeft--;
    }

    if (guessesLeft < 0) {
      System.out.println("You lost! The number was: " + random_num);
      myScanner.close();
      return;
    }

    myScanner.close();
    System.out.println("You won! You were close enough to the number, " + random_num);
  }
}
