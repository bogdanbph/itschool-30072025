package methods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] otherArray = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int sumOfEvenNumbersInMyArray = sumOfEvenNumbers(myArray);
        System.out.println("The sum of even numbers in myArray is " + sumOfEvenNumbersInMyArray);

        int sumOfEvenNumbersInOtherArray = sumOfEvenNumbers(otherArray);
        System.out.println("The sum of even numbers in otherArray is " + sumOfEvenNumbersInOtherArray);

        if (sumOfEvenNumbersInMyArray < sumOfEvenNumbersInOtherArray) {
            System.out.println("The sum of even numbers in myArray is smaller than the sum of even numbers in otherArray");
        }

        Scanner scanner = new Scanner(System.in);
        String myString = readAStringFromScanner(scanner);

        System.out.println(myString.toLowerCase());
        System.out.println(readAStringFromScanner(scanner).toLowerCase());
        
        scanner.close();
    }

    public static int sumOfEvenNumbers(int[] array) {
        int sum = 0;

        for (int elem : array) {
            if (elem % 2 == 0) {
                sum += elem;
            }
        }

        return sum;
    }

    public static String readAStringFromScanner(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

}
