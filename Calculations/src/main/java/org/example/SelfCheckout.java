package org.example;

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        Checkout test = new Checkout();
    }
}

class Checkout {
    private double firstPrice;
    private double secondPrice;
    private double thirdPrice;
    private double firstQuantity;
    private double secondQuantity;
    private double thirdQuantity;

    public Checkout() {
        exec();
    }

    private void exec() {
        getInput();
        getOutput();
    }

    private void getInput() {
        System.out.println("Enter the price of item 1: ");
        Scanner firstPrice = new Scanner(System.in);
        this.firstPrice = firstPrice.nextDouble();
        System.out.println("Enter the quantity of item 1: ");
        Scanner firstQuantity = new Scanner(System.in);
        this.firstQuantity = firstQuantity.nextInt();

        System.out.println("Enter the price of item 2: ");
        Scanner secondPrice = new Scanner(System.in);
        this.secondPrice = secondPrice.nextDouble();
        System.out.println("Enter the quantity of item 2: ");
        Scanner secondQuantity = new Scanner(System.in);
        this.secondQuantity = secondQuantity.nextInt();

        System.out.println("Enter the price of item 3: ");
        Scanner thirdPrice = new Scanner(System.in);
        this.thirdPrice = thirdPrice.nextDouble();
        System.out.println("Enter the quantity of item 2: ");
        Scanner thirdQuantity = new Scanner(System.in);
        this.thirdQuantity = thirdQuantity.nextInt();

    }

    private double priceSum() {
        double total = (this.firstPrice * this.firstQuantity) + (this.secondPrice * secondQuantity) + (this.thirdPrice * thirdQuantity);
        return total;
    }

    private double calculateTax() {
        return priceSum() * 0.055 ;
    }

    private double priceWithTax() {
        return priceSum() + calculateTax();
    }

    private void getOutput() {
        System.out.println("Subtotal: "+ priceSum());
        System.out.println("Tax: " + calculateTax());
        System.out.println("Total: " + priceWithTax());
    }
}
