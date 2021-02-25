package com.smst.week1.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wordCount {
  public static void main(String[] args) throws IOException {
    List<String> inputLines = makeInputArray("wordCountInput.txt");
    int finalCount = getSearchCount(inputLines);

    System.out.println("Your word count is: " + finalCount);
  }

  public static List<String> makeInputArray(String fileName) throws IOException {

    List<String> paragraphs = new ArrayList<String>();

    try (BufferedReader buf = new BufferedReader(new FileReader(fileName))) {
      String strCurrentLine;
      while ((strCurrentLine = buf.readLine()) != null) {
        paragraphs.add(strCurrentLine);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return paragraphs;
  }

  public static int getSearchCount(List<String> textLines) {

    System.out.println("What would you like to search for? (any word, case sensitive)");

    Scanner input = new Scanner(System.in);
    String searchTerm = input.nextLine();
    Pattern pattern = Pattern.compile(searchTerm);
    int count = 0;

    System.out.println("Your search term is: " + searchTerm);

    for (String line : textLines) {
      Matcher matcher = pattern.matcher(line);
      while (matcher.find()) {
        count++;
      }
    }
    input.close();

    return count;
  }
}
