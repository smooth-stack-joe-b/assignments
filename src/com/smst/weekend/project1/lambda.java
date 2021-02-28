package com.smst.weekend.project1;

public class lambda {
  public static void main(String[] args) {
    IsEvenOrOdd evenOrOdd = (n) -> n % 2 == 0 ? "Even" : "Odd";

    IsPrime prime = (n) -> {
      boolean notPrime = false;
      for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
          notPrime = true;
          break;
        }
      }

      return !notPrime ? "Prime" : "Composite";
    };

    IsPalindrome palindrome = (n) -> {
      String str = Integer.toString(n);
      int middle = str.length() / 2;
      String beg = str.substring(0, middle);
      String end = str.length() % 2 != 0 ? str.substring(middle + 1) : str.substring(middle);

      return beg.equals(end) ? "Palindrome" : "Not a Palindrome";
    };

    System.out.println("5 outputs:");
    System.out.print("1) ");
    printEvenOrOdd(4, evenOrOdd);
    System.out.print("2) ");
    printPrime(5, prime);
    System.out.print("3) ");
    printPalindrome(898, palindrome);
    System.out.print("1) ");
    printEvenOrOdd(3, evenOrOdd);
    System.out.print("2) ");
    printPrime(12, prime);
  }

  public static void printEvenOrOdd(Integer num, IsEvenOrOdd fx) {
    String result = fx.isEvenOrOdd(num);
    System.out.println(result);
  }

  public static void printPrime(Integer num, IsPrime fx) {
    String result = fx.isPrime(num);
    System.out.println(result);
  }

  public static void printPalindrome(Integer num, IsPalindrome fx) {
    String result = fx.isPalindrome(num);
    System.out.println(result);
  }

  interface IsEvenOrOdd {
    String isEvenOrOdd(Integer num);
  }

  interface IsPrime {
    String isPrime(Integer num);
  }

  interface IsPalindrome {
    String isPalindrome(Integer num);
  }
}
