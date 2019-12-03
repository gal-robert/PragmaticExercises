package org.example;

import java.util.Scanner;

public class DeterminingCompoundInterest {
    public static void main(String[] args) {
        CompoundInterest test = new CompoundInterest();
    }
}

class CompoundInterest {
    private double principal;
    private double interestRate;
    private int years;
    private int compoundPerYear;

    public CompoundInterest() {
        getInput();
        getOutput();
    }

    private void getInput() {
        System.out.println("What is the principal amount? ");
        this.principal = new Scanner(System.in).nextDouble();

        System.out.println("What is the rate? ");
        this.interestRate = new Scanner(System.in).nextDouble();

        System.out.println("What is the number of years ");
        this.years = new Scanner(System.in).nextInt();

        System.out.println("What is the number of times the interest is compounded each year? ");
        this.compoundPerYear = new Scanner(System.in).nextInt();
    }

    private double calculateInterest() {
        double base = 1 + ((interestRate / 100) / compoundPerYear);
        double pow = Math.pow(base, compoundPerYear * years);
        double result = principal * pow;
        return Math.floor(result * 100 +.5)/100;
    }

    private void getOutput() {
        System.out.println("$" + principal + " invested at " + interestRate + "% for "
        + years + " years compounded " + compoundPerYear + " times per year is $" + calculateInterest());
    }
}