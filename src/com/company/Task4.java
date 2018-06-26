package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Please enter your password below: ");

        int password = Integer.parseInt(new Scanner(System.in).next());

        if (password == 1234) {
            System.out.println("You entered this password: " + password + " this is correct password!");
        } else {

            System.out.println("You entered this password: " + password + " this is incorrect password, try again.");


        }


    }
}