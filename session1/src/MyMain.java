/**
 *
 *
 */
public class MyMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        String str = "Bogdan";
        System.out.printf("Hello, World!%nThis is my variable x = %d and y = %d%n", x, y);
        System.out.printf("Hello, World!%nMy name is %s!%n", str);

        System.out.println("Hello, World! My name is " + str + "!");

        System.out.println("This is the uppercase version of my name: " + str);

        String str2 = "BogdaN";
        System.out.println("Are the strings equal? ===> " + str.equalsIgnoreCase(str2));


        char ch = 'a';
        System.out.println("My name is " + ch);

        int a = 100;
        int b = 200;

        // byte c = a + b;
        // salut, eu sunt Bogdan, sper ca ti place codul meu

        System.out.println("My by value is " + b);

        short s = 10;
//        int a = 10;
        long l = 10l;
        float f = 10.0f;
        double d = 10.0d;

    }

}
