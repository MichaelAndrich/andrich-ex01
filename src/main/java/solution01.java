/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Andrich
 */
/* prompt user for their name
    read in their name and store
    insert their name into created string
    print string
 */

import java.util.Scanner;

public class solution01 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("What is your name? ");
        String fname = input.next();
        System.out.println("Hello, "+fname+", nice to meet you!");
    }
}