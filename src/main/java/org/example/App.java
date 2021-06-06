/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */
package org.example;

import java.util.Scanner;

public class App 
{

    public static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        App app = new App();

        app.getUserinput(scanner);

    }

    private void getUserinput(Scanner scanner) {
        int numPeople, numPizzas,pizzaSlices;
                ;
        System.out.printf("How many people?\n");
        numPeople= Integer.parseInt(scanner.nextLine());

        System.out.println("How many pizzas do you have?");
        numPizzas= Integer.parseInt(scanner.nextLine());

        System.out.println("How many slices per pizza?");
        pizzaSlices = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d people with %d pizzas (%d slices)\n",numPeople,numPizzas,numPizzas*pizzaSlices);

        System.out.printf("Each person gets %d pieces of pizza\n",(numPizzas*pizzaSlices)/numPeople);
        System.out.printf("There are %d leftover pieces.\n",(numPizzas*pizzaSlices)%numPeople);

    }
}
