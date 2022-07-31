package com.bridgelabz.maximumproblem;

import java.util.Scanner;

public class MaximumProblem {

    public static void main(String[] args) {
        GenericClass genericClass = new GenericClass();

        System.out.println("Welcome to Maximum Problem");

        genericClass.testMaximum(1,2,3,4,5,6,7,8,9,0);
        genericClass.testMaximum(1.1,2.2,3.3,4.4,5.5);
        genericClass.testMaximum("Hello","This","Is","String","Array");

    }

}
