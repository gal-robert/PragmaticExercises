package me.galrobert;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {
        int currentAge;
        int retirementAge;
        int yearsToRetire;
        int currentYear = LocalDate.now().getYear();
        int retirementYear;

        System.out.println("What is your current age?");
        currentAge = new Scanner(System.in).nextInt();

        System.out.println("At what age do you want to retire?");
        retirementAge = new Scanner(System.in).nextInt();

        yearsToRetire = retirementAge - currentAge;
        retirementYear = LocalDate.now().plusYears(yearsToRetire).getYear();

        System.out.println("You have " + yearsToRetire + " years left until you retire.");
        System.out.println("It's " + currentYear + ", so you can retire in " + retirementYear);
    }
}
