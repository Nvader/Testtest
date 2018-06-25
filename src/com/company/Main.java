package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Junior = "Junior";
        String Middle = "Middle";
        String Senior = "Senior";

        System.out.println("Enter your name below");

        String s = new Scanner(System.in).next();

        System.out.println("Your name is: " + s + "; " + "\n" + "welcome to the System" + ", " + s);

        System.out.println("Please add below your age");

        int a = Integer.parseInt(new Scanner(System.in).next());


        if (a < 21) {
            System.out.println("You can't work for our company due to your young age.");

        } else {

            System.out.println("You entered value: " + a + " " + "\n" + "please add below your IT experience in years");
        }

        int b = Integer.parseInt(new Scanner(System.in).next());

        if (b < 1.5) {
            System.out.println("Your experience level is " + " " + Junior);
        }
        if (b >= 1.5 && b <= 5) {
            System.out.println("Your experience level is " + " " + Middle);
        }
        if (b > 5) {
            System.out.println("Your experience level is " + " " + Senior);
        }

        System.out.println("Please enter your current average salary below (digit)");

        int c = Integer.parseInt(new Scanner(System.in).next());

        if (c <= 1000) {
            System.out.println("You're sooo looser! Muahahahahaha)))");
        }
        if (c > 1001 && c <= 1999) {
            System.out.println("Your current average salary now is lower than it should be");
        } else if (c > 1999 && c <= 1000000) {
            System.out.println("Your current average salary now is just about right");
        }
    }
}
