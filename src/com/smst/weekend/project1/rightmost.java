package com.smst.weekend.project1;

import java.util.Arrays;

public class rightmost {
  public static void main(String[] args) {
    Rightmost rmLambda = (arr) -> Arrays.stream(arr).map(n -> Integer.toString(n)).map(s -> s.substring(s.length() - 1))
        .mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

    printRightmost(new Integer[] { 1, 22, 93 }, rmLambda);
    printRightmost(new Integer[] { 16, 8, 886, 8, 1 }, rmLambda);
    printRightmost(new Integer[] { 10, 0 }, rmLambda);
  }

  public static void printRightmost(Integer[] array, Rightmost fx) {
    String result = Arrays.toString(fx.rm(array));
    System.out.println(result);
  }

  interface Rightmost {
    Integer[] rm(Integer[] array);
  }
}
