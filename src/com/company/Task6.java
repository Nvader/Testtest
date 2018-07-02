package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please add below several digits: ");
        int n1 = Integer.parseInt(new Scanner(System.in).next());
        int n2 = Integer.parseInt(new Scanner(System.in).next());

        if (n1 > n2) {
            System.out.println(n1 + " bigger, than " + n2);


        } else {
            System.out.println(n2 + " bigger, than " + n1);
        }


    }
}
