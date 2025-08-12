package main.ifstatement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int myAge = myScanner.nextInt();

        if (myAge < 18) {
            System.out.println("You are a kid");
        } else {
            System.out.println("You are still young.");
        }

        System.out.print("Enter your name: ");
        String myName = myScanner.next(); // or nextLine();

        if (myName.length() < 3) {
            System.out.println("Your name is too short");
        } else {
            System.out.println("Your name is longer than 3 characters");
        }

        System.out.print("Please pick a number: ");
        int myNumber = myScanner.nextInt();

        if (myNumber > 0) {
            System.out.println("Your number is greater than 0");
        } else if (myNumber < 0) {
            System.out.println("Your number is less than 0");
        } else {
            System.out.println("Your number is equal to 0");
        }

        String x = myAge < 18
                ? "You are a kid"
                : "You are still young";
        System.out.println(x);

        int a = 10;
        int b = 20;
        int c = 30;


    }

}
