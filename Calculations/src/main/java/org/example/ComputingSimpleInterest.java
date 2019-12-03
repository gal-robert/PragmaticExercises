package org.example;

import java.util.Scanner;

public class ComputingSimpleInterest {
    public static void main(String[] args) {
        CalculateInterest test = new CalculateInterest();
    }
}

class CalculateInterest {
    private double principal;
    private double interestRate;
    private int years;

    public CalculateInterest() {
        getInput();
        getOutput();
    }

    private void getInput() {
        System.out.println("Enter the principal: ");
        this.principal = new Scanner(System.in).nextDouble();

        System.out.println("Enter the rate of interest: ");
        this.interestRate = new Scanner(System.in).nextDouble();

        System.out.println("Enter the number of years: ");
        this.years = new Scanner(System.in).nextInt();
    }

    private double calculateInterest() {
        double interestPercent = interestRate / 100;
        double amount = principal * (1 + (interestPercent * years));
        return Math.ceil(amount * 100 +.5)/100;

    }

    private void getOutput() {
        System.out.println("After " + years +" years at " + interestRate +
                "%, the investment will be worth $" + calculateInterest());
    }


}
