/*
 *  UCF COP3330 Fall 2021 Exercise 8 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people? ");
        String peopleStr = scanner.nextLine();
        System.out.println("How many pizzas do you have? ");
        String pizzaStr = scanner.nextLine();
        System.out.println("How many slices per pizza? ");
        String sliceStr = scanner.nextLine();

        int people = Integer.parseInt(peopleStr);
        int pizza = Integer.parseInt(pizzaStr);
        int slice = Integer.parseInt(sliceStr);

        int totalSlices = pizza * slice;
        int slicesPerPerson = totalSlices / people;
        int slicesLeftover = totalSlices % people;

        System.out.println(people + " people with " + pizza + " pizzas (" + totalSlices + " slices)");
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + slicesLeftover + " leftover pieces.");
    }
}