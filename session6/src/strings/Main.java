package strings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello World";
        s1 = "Bogdan";
//        String aux = s1;

        System.out.println(Integer.toHexString(System.identityHashCode(s1)));
//        System.out.println(Integer.toHexString(System.identityHashCode(aux)));


        System.out.println(Integer.toHexString(System.identityHashCode(s1)));

        s1 = s1 + 2;
        System.out.println(Integer.toHexString(System.identityHashCode(s1)));

        s1 = "Vlad";
        System.out.println(Integer.toHexString(System.identityHashCode(s1)));

        String s3 = new String("Salutare");
        s3 = new String("La Revedere");

//        int a = 10;
//        int b = a;
//
//        a += 5;
//
//        System.out.println(a);
//        System.out.println(b);

        String s2 = "Hellno World";
        System.out.println(Integer.toHexString(System.identityHashCode(s2)));

        String newS2 = s2.replace('o', 'a');
        System.out.println(Integer.toHexString(System.identityHashCode(newS2)));
        System.out.println(s2);
        System.out.println(newS2);

        String s5 = null;
        String s6 = null;

        //

//        if (s6.equals(s5)) {
//            System.out.println("Bogdan");
//        }

        if (isStringTheSame("Bogdan", "Bogdan")) {
            System.out.println("Bogdan");
        }

        String x = "Hello".concat(String.valueOf(5)); // "Hello" + "5"

        System.out.println("   He llo   ".strip() + "other string");

        Integer wrapperInt = 120;
        String upperCase = wrapperInt.toString()
                .split("2")[0]  // ["1", "0"]
                .strip()
                .toUpperCase();

        System.out.println(upperCase);
    }

    public static boolean isStringTheSame(String s1, String s2) {
        if (s1 == s2) return true;
        if (s1 == null || s2 == null) return false;

        return s1.equals(s2);
    }

}
