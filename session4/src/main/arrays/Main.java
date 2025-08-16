package main.arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str = new String("Hello World");

        // [] is the array symbol;
        // the number passed in the initialization phase, is the maximum length of the array;
        String[] myStrings = new String[10];

        // ["John", "Joe", "Marry", etc...]
        // myStrings[0] = "John";
        // myStrings[1] = "Joe";
        // myStrings[2] = "Marry";

        // for (int i = 0; i < myStrings.length; i++) {
        for (int i = 0; i <= myStrings.length - 1; i++) {
            System.out.println(myStrings[i]);
        }

        boolean[] myBooleans = new boolean[10]; // [true, false, false, true...]
        char[] myChars = new char[10]; // [0, ...]
        double[] myDoubles = new double[10]; // [0.0, ...]
        float[] myFloats = new float[10]; // [0.0, ...]

        // the lines below will print the text form of the array, not the elements within them;
//        System.out.println(myBooleans);
//        System.out.println(myChars);
//        System.out.println(myDoubles);
//        System.out.println(myFloats);

        for (int i = 0; i < myFloats.length; i++) {
            System.out.println(myFloats[i]);
        }


        System.out.print("Please enter the length of the array: ");
        Scanner sc = new Scanner(System.in);

        int arrayLength = sc.nextInt();
        int[] myInts = new int[arrayLength];

        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < arrayLength; i++) {
            String suffix = "th";
            if (i == 0) {
                suffix = "st";
            } else if (i == 1) {
                suffix = "nd";
            } else if (i == 2) {
                suffix = "rd";
            }

            System.out.print("Please enter the " + (i + 1) + suffix + " element: ");
            myInts[i] = sc.nextInt();
        }
//
//        for (int i = 0; i < myInts.length; i++) {
//            System.out.println(myInts[i]);
//        }
//
//        for (int myInt : myInts) {
//            System.out.println(myInt);
//        }

        int firstOddIndex = -1;
        for (int i = 0; i < myInts.length; i++) {
            // equivalent solution with break;
//            if (myInts[i] % 2 != 0) {
//                firstOddIndex = i;
//                break;
//            }
//            System.out.println("Still in the loop...");

            if (myInts[i] % 2 == 0) {
                continue;
            }
            System.out.println("finally, I found an odd number: " + myInts[i]);
            firstOddIndex = i;
            break;
        }

        if (firstOddIndex == -1) {
            System.out.println("The array doesn't contain an odd number");
        } else {
            System.out.println("The first odd index is " + (firstOddIndex + 1) + " having the value of: " + myInts[firstOddIndex]);
        }

    }

}
