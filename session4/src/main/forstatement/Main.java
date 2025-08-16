package main.forstatement;

public class Main {

    public static void main(String[] args) {
        int i;
        for (i = 1; i < 11; i++) {
            int x = 10;
            System.out.println("Count is: " + i);
        }
        System.out.println("Count is: " + i);

        // will never print "Salut"
        for (;i < 10;) {
            System.out.println("Salut");
        }

        // infinite loop
        for (int j = 1; j < 2;) {
            System.out.println("Salut");
        }

        // infinite loop
        for (;;) {}


    }

}
