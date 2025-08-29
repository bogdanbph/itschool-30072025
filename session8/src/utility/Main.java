package utility;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        byte[] myBytes = new byte[100];
        random.nextBytes(myBytes);

//        for (int i = 0; i < myBytes.length; i++) {
//            System.out.println(myBytes[i]);
//        }

        Random random1 = new Random();
        int myInt = random1.nextInt();
        System.out.println(myInt);

        myInt = random1.nextInt(-100, 100);
        System.out.println(myInt);

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        int i = scanner.nextInt();

        System.out.println(i);
    }

}
