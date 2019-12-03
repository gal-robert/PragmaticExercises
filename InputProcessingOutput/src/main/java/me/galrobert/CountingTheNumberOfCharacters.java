package me.galrobert;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {
    public static void main(String[] args) {
        System.out.println("What is the input string?");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int length = string.length();

        System.out.println(string + " has " + length + " characters!");

    }
}
