package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner appScanner = new Scanner(System.in);

        String firstName;
        String lastName;
        double firstSubject;
        double secondSubject;
        double thirdSubject;

        System.out.println("First Name:");
        firstName = appScanner.nextLine();
        System.out.println("Last Name:");
        lastName = appScanner.nextLine();
        System.out.println("First Subject Grade:");
        firstSubject = appScanner.nextDouble();
        System.out.println("Second Subject Grade:");
        secondSubject = appScanner.nextDouble();
        System.out.println("Third Subject Grade:");
        thirdSubject = appScanner.nextDouble();

        double average = (firstSubject + secondSubject + thirdSubject) / 3;

        System.out.println("Good day, " + firstName + " " + lastName + ".");
        System.out.println("Your grade average is: " + (int)average);
    }
}
