package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String str = "Hello World";
//        System.out.println(str);
//
//        someMethod();
//
//        System.out.println();

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int number = sc.nextInt();
//
//        System.out.print("Enter the second integer: ");
//        int numberTwo = sc.nextInt();
//
//        if (number == numberTwo) {
//            System.out.println("The two integers are the same");
//        }

        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        String str3 = new String("Hello, World!");

        if (str2 == str3) {
            System.out.println("The strings are the same");
        } else {
            System.out.println("The strings are not the same");
        }

        long l = (long) 10 + 5;

        String s = null;
        // int x = null; // won't compile, only objects can have "null" as value;



    }

    public static void someMethod() {

    }

}
