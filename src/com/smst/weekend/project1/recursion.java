package com.smst.weekend.project1;

public class recursion {
  private boolean groupSumClump(Integer index, Integer[] array, Integer target) {
    if (array.length <= index) {
      return target == 0;
    }

    int total = array[index++];

    while (index < array.length && array[index - 1] == array[index]) {
      total += array[index++];
    }

    return groupSumClump(index, array, target - total) || groupSumClump(index, array, target);
  }
}
