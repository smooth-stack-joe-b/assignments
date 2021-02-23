package com.smst.week1;

import java.util.Scanner;

public class printLnArt {
    public static void main(String[] args) throws Exception {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num = myObj.nextInt();

        System.out.println(String.format("%d)", 1));
        for (int i = 0; i < num; i++) {
            System.out.println("*".repeat(i + 1));
        }

        System.out.println(String.format("%d)", 2));
        for (int i = num; i > 0; i--) {
            System.out.println("*".repeat(i));
        }

        System.out.println(String.format("%d)", 3));
        int frontSpaces = 10;
        int backSpaces = 10;
        for (int i = 1; i < num + 4; i += 2) {
            System.out.println(" ".repeat(frontSpaces) + "*".repeat(i) + " ".repeat(backSpaces));
            frontSpaces--;
        }

        System.out.println(String.format("%d)", 4));
        for (int i = num + 3; i > 0; i -= 2) {
            System.out.println(" ".repeat(frontSpaces) + "*".repeat(i) + " ".repeat(backSpaces));
            frontSpaces++;
        }
    }
}
