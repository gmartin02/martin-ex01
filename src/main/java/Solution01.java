/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Gabriel Martin
 */

/*
 * import Scanner library
 * create a new Scanner called input
 * prompt the user to input their name
 * 'name' = user input
 * declare and set String 'output' = "hello" + 'name' + "nice to meet you"
 * print 'output'
 */

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);         //Create Scanner objects

        String name = input.nextLine();                 //Read user input
        String output = "Hello, " + name + ", nice to meet you!";
        System.out.println(output);

    }
}