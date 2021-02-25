package com.smst.week1.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fileWalk {
  public static void main(String[] args) {
    try (Stream<Path> walk = Files.walk(Paths.get("/Users/JoeBEE/smoothstack"))) {
      // We want to find only regular files
      List<String> result = walk.filter(Files::isRegularFile).map(x -> x.toString()).collect(Collectors.toList());

      result.forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
