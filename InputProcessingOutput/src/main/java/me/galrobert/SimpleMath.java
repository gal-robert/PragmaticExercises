package me.galrobert;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        int x;
        int y;

        System.out.println("What is the first number?");
        x = new Scanner(System.in).nextInt();
        System.out.println("What is the second number?");
        y = new Scanner(System.in).nextInt();

        int sum = x + y;
        System.out.println(x + " + "+y+ " = " + sum);
        sum = x - y;
        System.out.println(x + " - "+y+ " = " + sum);
        sum = x * y;
        System.out.println(x + " * "+y+ " = " + sum);
        sum = x / y;
        System.out.println(x + " / "+y+ " = " + sum);
    }
}
