package operators;

public class LogicalOperatorsMain {

    public static void main(String[] args) {
//        float a = -0.2f;
        int a = 2;
        int b = 2;

        boolean c = a >= b;
        System.out.println(a + " >= " + b + " is a " + c + " statement.");

        int d = 3;
        // boolean e = a > b || b < d; // true
        // boolean e = a >= b && b < d; // true
        boolean e = a > b && b < d; // false
        System.out.println(e);

        String str = a > b ? "a" : "b"; // if a > b is true, then str will be = "a"; otherwise str will be "b";
        System.out.println(str);

        int a1 = 1;

        a1++;
        a1 += 1;
        a1 = a1 + 1;

        a1 = 9;
        a1 %= 3;

        System.out.println("a1 = " + a1);

        String alina = "Alina";
        int x = 2;
        String y = alina + x;

        System.out.println("2" + 2);
    }

}
