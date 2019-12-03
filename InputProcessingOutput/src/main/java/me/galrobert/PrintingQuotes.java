package me.galrobert;

import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args) {
        System.out.println("Enter a quote:");
        Scanner quoteScan = new Scanner(System.in);
        String quote = quoteScan.nextLine();

        System.out.println("Who said that?");
        Scanner nameScan = new Scanner(System.in);
        String name = nameScan.nextLine();

        System.out.println(name + " said \"" + quote + "\"");
    }
}
