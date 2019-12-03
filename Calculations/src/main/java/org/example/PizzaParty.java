package org.example;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        PizzaDivider pizza = new PizzaDivider();
    }
}

class PizzaDivider {
    private int people;
    private int pizzaSliceNumber;
    private int SLICES_IN_PIZZA = 8;

    public PizzaDivider() {
        this.start();
    }

    public void start() {
        this.getPeopleInput();
        this.getPizzaCountInput();

        print();

    }

    private void getPeopleInput() {
        System.out.println("How many people?");
        Scanner peopleInput = new Scanner(System.in);
        this.people = peopleInput.nextInt();
    }

    private void getPizzaCountInput() {
        System.out.println("How many pizzas do you have?");
        Scanner pizzaInput = new Scanner(System.in);
        this.pizzaSliceNumber = pizzaInput.nextInt() * SLICES_IN_PIZZA;
    }

    private int calculateSlices() {
        return pizzaSliceNumber / people;
    }

    private int calculateLeftover() {
        return pizzaSliceNumber % people;
    }

    private void print() {
        int pieces = calculateSlices();
        int leftovers = calculateLeftover();

        System.out.println(this.people + " people with " + this.pizzaSliceNumber / 8 + " pizza");

        if(pieces == 1){
            System.out.println("\nEach person gets " + pieces + " piece of pizza");}
        else{
            System.out.println("Each person gets " + pieces + " pieces of pizza");}

        if(leftovers == 1){
            System.out.println("There is " +  leftovers + " leftover piece");}
        else if(leftovers == 0){
            System.out.println("There are no leftovers");
        } else {
            System.out.println("There are " +  leftovers + " leftover pieces");
        }

    }
}