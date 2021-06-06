/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = in.nextDouble();
        in.nextLine();

        System.out.print("What is the state? ");
        String state = in.nextLine().toLowerCase();

        if (state.equals("wi")) {
            double tax = 0.055 * amount;
            System.out.printf("The subtotal is $%.2f.\n", amount);
            System.out.printf("The tax is $%.2f.\n", tax);
            amount += tax;
        }

        System.out.printf("The total is $%.2f.\n", amount);
    }
}
