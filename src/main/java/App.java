/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the Length? ");
        int length = scanner.nextInt();
        System.out.print("What is the Width? ");
        int width = scanner.nextInt();

        double size = length*width;
        System.out.println("You will need to purchase " + Math.ceil(size/350) + " gallons of paint to cover " + size + " square feet.");

        scanner.close();
    }
}