package operators;

public class Main {

    public static void main(String[] args) {
        /*
        int a = 10;
        int b = 20;

        int c = a + b; // 30
        int d = a - b; // -10
        int e = a * b; // 200
        int f = a / b; // 0
        int g = a % b; // 10

        float h = a / (float) b;

        int i = a / b;
        float v = (float) a / b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        */

        /*
        final int a1 = 10; // this marks the variable as being constant
        int a2 = 15;
        int a3 = a1 + a2; // 25

        System.out.println("old a1 = " + a1);

        // a1 = a3 - a2 - 5; // 5

        System.out.println("new a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        */

        int a; // declaring step
        int b;

        a = 10; // initializing step

        int c = 10; // declare + initialize in-line

        // System.out.println(b); // won't work, as variable 'b' is still uninitialized;

        // The first step: b will take the 'a' value; => b = 10;
        // Then: a will be incremented by 1; => b = 10; a = 11;
        b = a++; // b = 10; a = 11;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

        // The first step: a will be incremented; => a = 12;
        // Then: b will take 'a' value; => b = 12; a = 12;
        b = ++a; // b = 12; a = 12;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

        // a++ or ++a are equivalent to => a = a + 1;

        b = 1 + (++a / ++b);
        int i = ++a / a++;

        // boolean isTrue = !b; // the '!' operator can be applied only on boolean values (i.e. 'true' or 'false')
        boolean isTrue = true;
        isTrue = !isTrue;

        int booleanValue = -4; // 0000 0010 0101 0010 => 2
        booleanValue = booleanValue >> 2;

        System.out.println("booleanValue = " + booleanValue);

    }

}
