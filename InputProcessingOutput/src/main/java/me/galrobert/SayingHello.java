package me.galrobert;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SayingHello
{
    public static void main( String[] args )
    {
        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);
        String concat = "Hello " +name.nextLine() + ", nice to meet you!";
        System.out.println(concat);
    }
}
