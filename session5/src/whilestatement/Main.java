package whilestatement;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // array[0] -> 1;
        // array[6] -> 7;

        // char[] array2 = {1, 2, 3, 4};
        // int[] array3 = new int[10] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;
        while (i < array.length) {
            System.out.println(array[i++]);
        }
        System.out.println("i = " + i);

        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            int j = 10;
        }
        System.out.println("i = " + i);

        i = 0;
        do {
            System.out.println(array[i++]);
        } while (i < array.length);
        System.out.println("i = " + i);

        // infinite loop
//        i = 0;
//        for (;i == 0;) {
//            System.out.println("salut");
//        }
    }
}
