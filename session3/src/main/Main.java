package main;

public class Main {

    public static void main(String[] args) {

        // int a = 10, b = 20;
        //
        // // This won't compile, as the required type is int and a String is provided;
        // // int c = 15, d = "salut";
        //
        // // int c, d = 10;
        // // System.out.println(d);
        //
        // System.out.println(a + b); // What will this print? 30
        // System.out.println(b - a); // And this? 10
        // System.out.println(a * b); // This? 200
        // System.out.println(b / a); // How about this? 2

        // float < double
        //
        // by default for decimals double is used;
        // by default for integers int is used;
//        float c = 10.5f;
//        double a = 10.5, b = 4.5;
//
//        System.out.println(a + b); // Predict the result.
//        System.out.println(a * b); // Multiply and print.
//        System.out.println(a / b); // What's the result of this division?
//
//        int myInt = 128;


//        short e = 10;
//        int f = e + 5; // What happens here?
//
//        long g = 100L;  // byte < char < short < int < long; float < double
//        int h = (int) g + 10; // Why is casting required here? Predict the outcome.
//
//        char a = 10;
//        int b = a;  // What happens here? Why doesn't this cause an error?
//
//        double c = 5.5;
//        float d = (float) c;  // Why do we need to cast here?

        char a = 'a';
        char b = 'b';

        System.out.println(a + b); // Asta printeaza valoarea numerica in codul Ascii;
        System.out.println((char) (a + b)); // Asta printeaza caracterul corespunzatorul valorii numerice din codul Ascii;

        int x = 3;
        int y = ++x * 5 / x-- + --x; // 4 * 5 / 4 + 2 => 7 ; x = 2

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        long n = 10;
        long m = 9_223_013_981_938_104_332l;

        float f = 10;
        System.out.println(f);

        float v = f + n;

        char c = 10;
        byte myByte = 15;

        int i = c + myByte;


    }

}
