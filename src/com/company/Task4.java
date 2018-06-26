package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Please enter your password below: ");

        String parol = new Scanner(System.in).next();

        if (parol == "Oleg") {
            System.out.println("You entered this password: " + parol + " this is correct password!");
        } else {

            System.out.println("You entered this password: " + parol + " this is  incorrect password, try again.");


        }
    }
}