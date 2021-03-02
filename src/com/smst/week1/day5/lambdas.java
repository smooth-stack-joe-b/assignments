package com.smst.week1.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lambdas {
  public static void main(String[] args) {
    IString lengthFx = (arr) -> {
      Arrays.sort(arr, Comparator.comparingInt(String::length));
      return arr;
    };

    IString reverseLength = (arr) -> {
      Arrays.sort(arr, (a, b) -> Integer.compare(b.length(), a.length()));
      return arr;
    };

    IString firstCharOrder = (arr) -> {
      Arrays.sort(arr, (a, b) -> {
        if (a.charAt(0) == b.charAt(0)) {
          return Integer.compare(a.length(), b.length());
        } else {
          return a.charAt(0) - b.charAt(0);
        }
      });
      return arr;
    };

    IString eFirst = (arr) -> {
      Arrays.sort(arr, (a, b) -> a.contains("e") ? b.compareTo(a) : a.compareTo(b));
      return arr;
    };

    IString eFirstCompare = (arr) -> {
      Arrays.sort(arr, (a, b) -> eCompare(a, b));
      return arr;
    };

    IList eBeforeInt = (arr) -> {
      List<String> combinedList = new ArrayList<>();
      arr.stream().forEach((n) -> {
        if (n % 2 == 0) {
          combinedList.add("e" + Integer.toString(n));
        } else {
          combinedList.add("o" + Integer.toString(n));
        }
      });
      return String.join(",", combinedList);
    };

    printLambda(new String[] { "correctly", "could", "disentangle", "no", "one" }, lengthFx);
    printLambda(new String[] { "correctly", "could", "disentangle", "no", "one" }, reverseLength);
    printLambda(new String[] { "correctly", "could", "disentangle", "no", "one" }, firstCharOrder);
    printLambda(new String[] { "correctly", "could", "disentangle", "no", "one" }, eFirst);
    printLambda(new String[] { "correctly", "could", "disentangle", "no", "one" }, eFirstCompare);

    printList(Arrays.asList(3, 44), eBeforeInt);

  }

  private static void printLambda(String[] array, IString fx) {
    String result = Arrays.toString(fx.stringLambda(array));
    System.out.println(result);
  }

  private static void printList(List<Integer> array, IList fx) {
    String result = fx.listLambda(array);
    System.out.println(result);
  }

  private static void printStringList(List<String> array, IStringList fx) {
    String result = Arrays.toString(fx.stringListLambda(array).toArray());
    System.out.println(result);
  }

  static private int eCompare(String a, String b) {
    return a.contains("e") ? b.compareTo(a) : a.compareTo(b);
  }

  interface IString {
    String[] stringLambda(String[] array);
  }

  interface IList {
    String listLambda(List<Integer> list);
  }

  interface IStringList {
    List<String> stringListLambda(List<String> list);
  }
}
