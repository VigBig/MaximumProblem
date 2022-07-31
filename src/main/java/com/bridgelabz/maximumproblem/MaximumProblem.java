package com.bridgelabz.maximumproblem;

import java.util.Scanner;

public class MaximumProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Maximum Problem");

        System.out.println("Enter 1st integer:");
        int val1 = sc.nextInt();
        System.out.println("Enter 2nd integer:");
        int val2 = sc.nextInt();
        System.out.println("Enter 3rd integer:");
        int val3 = sc.nextInt();

        GenericClass genericClass = new GenericClass();
        Integer max = genericClass.findMax(val1,val2,val3);

        System.out.println("The largest integer is :"+max);

    }

}
