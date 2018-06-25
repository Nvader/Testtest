package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        int a[] = {1,2,3,4,5,6,7};
        for (int i = 0; i < a.length / 2; i++)

        {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;

        }
        System.out.println(Arrays.toString(a));


    }
}
