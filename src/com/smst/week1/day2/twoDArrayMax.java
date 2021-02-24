package com.smst.week1.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class twoDArrayMax {
  public static void main(String[] args) {

    Integer[][] array = make2DArray();
    int max = array[0][0];
    int[] maxCoordinates = new int[2];

    for (int i = 0; i < array.length; i++) {
      Integer[] row = array[i];
      for (int j = 0; j < row.length; j++) {
        max = Math.max(max, row[j]);
      }
    }

    for (int i = 0; i < array.length; i++) {
      Integer[] row = array[i];
      List<Integer> rowList = Arrays.asList(row);
      int colIndex = rowList.indexOf(max);
      if (colIndex != -1) {
        maxCoordinates[0] = i;
        maxCoordinates[1] = colIndex;
        break;
      }
    }

    System.out.println(String.format("Your max is: %d", max));
    System.out.println(String.format("Your coordinates are: array[%d][%d]", maxCoordinates[0], maxCoordinates[1]));
  }

  private static Integer[][] make2DArray() {

    Integer[][] arr = new Integer[5][2];
    Random r = new Random();
    int upperbound = 27;

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 2; j++) {
        int random_num = r.nextInt(upperbound);
        arr[i][j] = random_num;
      }
    }

    return arr;
  }
}
