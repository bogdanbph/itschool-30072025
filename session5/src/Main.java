import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weekDay = scanner.nextLine().toLowerCase();

        // OLD SWITCH STATEMENT
        switch (weekDay) {
            case "monday":
                System.out.println("I hate mondays!");
                break; // if this 'break' keyword misses, then the code will be interpreted until a 'break' is found;
            case "tuesday":
            case "wednesday":
            case "thursday":
                System.out.println("It is ok");
                break;
            case "friday":
                System.out.println("It is friday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("It is weekend");
                break;
            default:
                System.out.println("I don't know what to do");
        }

        // NEW SWITCH STATEMENT
        switch (weekDay) {
            case "monday" -> System.out.println("I hate mondays!");
            case "tuesday", "wednesday", "thursday" -> System.out.println("It is ok");
            case "friday" -> System.out.println("It is friday");
            case "saturday", "sunday" -> System.out.println("It is weekend");
            default -> System.out.println("I don't know what to do");
        }

        long l = 10;

        // switch works only with int, byte, short, char, String, enum;
//        switch (l) {
//            case 10 -> System.out.println("It is ok");
//        }
    }
}
