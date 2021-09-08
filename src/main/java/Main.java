/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //using class scanner

public class Main {
    public static void  main(String[] args){
        Scanner Checkout = new Scanner(System.in);  //Scanner to obtain input
        System.out.println("Enter the price of item 1: ");
        String item1 = Checkout.nextLine(); //Reads input from the user
        double Item1 = Double. parseDouble(item1);    //Coverts input from String to double

        System.out.println("Enter the quantity of item 1: ");
        String q1 = Checkout.nextLine();    //Reads input from the user
        int Q1 = Integer.parseInt(q1);      //Converts input from String to integer

        System.out.println("Enter the price of item 2: ");
        String item2 = Checkout.nextLine();     //Reads input from the user
        double Item2 = Double.parseDouble(item2); //Converts input from String to double

        System.out.println("Enter the quantity of item 2: ");
        String q2 = Checkout.nextLine();    //Reads input from the user
        int Q2 = Integer.parseInt(q2);

        System.out.println("Enter the price of item 3: ");
        String item3 = Checkout.nextLine(); //Reads input from the user
        double Item3 = Double.parseDouble(item3); //Converts input from String to double

        System.out.println("Enter the quantity of item 3: ");
        String q3 = Checkout.nextLine();    //Reads input from the user
        int Q3 = Integer.parseInt(q3);      //Converts input from String to integer

        //Formula to get the subtotal
        double subtotal = (Item1 * Q1) + (Item2 * Q2) + (Item3 *Q3);
        double tax = subtotal * .055;   //Formula to get the tax
        double total = subtotal + tax;  //Formula to get the total

        System.out.printf("Subtotal: $%.2f ", subtotal);    //Display the subtotal
        System.out.printf("\nTax: $%.2f ", tax);            //Display the tax
        System.out.printf("\nTotal: $%.2f ", total);        //Display total
    }
}
