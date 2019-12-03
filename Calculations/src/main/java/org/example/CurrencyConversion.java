package org.example;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Convertor test = new Convertor();
    }
}

// amountTo = (amountFrom * rateFrom) / rateTo

class Convertor {
    private double euro;
    private double exchangeRate;

    public Convertor() {
        getInput();
        getOutput();
    }

    private void getInput() {
        System.out.println("How many euros are you exhanging?");
        this.euro = new Scanner(System.in).nextDouble();

        System.out.println("What is the exchange rate?");
        this.exchangeRate = new Scanner(System.in).nextDouble();
    }

    private double exchange() {
        double amountTo = euro * (exchangeRate / 100);

        //rounding to the next penny
        int precision = 100; //keep 2 floating digits
        double trimmed = Math.ceil(amountTo * precision +.5)/precision;

        return trimmed;
    }

    private void getOutput() {
        System.out.println(euro + "€ at an exchange rate of " + exchangeRate + "% is $" + exchange());
    }

}
