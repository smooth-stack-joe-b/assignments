package com.smst.weekend.project1;

import java.util.Arrays;

public class noX {
  public static void main(String[] args) {
    INoX mapNoX = (arr) -> Arrays.stream(arr).map(s -> s.replaceAll("x", "")).toArray(String[]::new);

    printNoX(new String[] { "ax", "bb", "cx" }, mapNoX);
    printNoX(new String[] { "xxax", "xbxbx", "xxcx" }, mapNoX);
    printNoX(new String[] { "x" }, mapNoX);
  }

  private static void printNoX(String[] array, INoX fx) {
    String result = Arrays.toString(fx.nx(array));
    System.out.println(result);
  }

  interface INoX {
    String[] nx(String[] array);
  }
}
