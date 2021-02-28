package com.smst.weekend.project1;

import java.util.Arrays;

public class byTwo {
  public static void main(String[] args) {
    IByTwo mapByTwo = (arr) -> Arrays.stream(arr).map(n -> n * 2).toArray(Integer[]::new);

    printByTwo(new Integer[] { 1, 2, 3 }, mapByTwo);
    printByTwo(new Integer[] { 6, 8, 6, 8, -1 }, mapByTwo);
    printByTwo(new Integer[] {}, mapByTwo);

  }

  private static void printByTwo(Integer[] array, IByTwo fx) {
    String result = Arrays.toString(fx.bt(array));
    System.out.println(result);
  }

  interface IByTwo {
    Integer[] bt(Integer[] array);
  }
}
