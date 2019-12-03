package me.galrobert;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        String verb;
        String noun;
        String adverb;
        String adjective;

        System.out.println("Enter a verb");
        verb = new Scanner(System.in).nextLine();

        System.out.println("Enter a noun");
        noun = new Scanner(System.in).nextLine();

        System.out.println("Enter a adverb");
        adverb = new Scanner(System.in).nextLine();

        System.out.println("Enter a adjective");
        adjective = new Scanner(System.in).nextLine();

        System.out.println("Why did the " + adjective +" " + noun + " " + verb + " " + adverb + "? I don't get it.");
    }
}
