package utility;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Object[] myObjects = new Object[10];

        myObjects[0] = new Object();
        myObjects[1] = "Salutare";
        myObjects[2] = 10;
        myObjects[3] = 'c';

        Integer x = Integer.valueOf(10); // auto-boxing
        int y = x; // unboxing

        LocalDate localDate = LocalDate.now();
        LocalDate copyOfLocalDate = localDate;
        System.out.println(localDate);

        localDate = localDate.plusDays(1);
        System.out.println(localDate);
        System.out.println(copyOfLocalDate);


        WeekDay weekDay = WeekDay.SATURDAY;
        System.out.println(weekDay);

        switch (weekDay) {
            case MONDAY -> System.out.println("Monday");
            case TUESDAY -> System.out.println("Tuesday");
            case WEDNESDAY -> System.out.println("Wednesday");
            case THURSDAY -> System.out.println("Thursday");
            case FRIDAY -> System.out.println("Friday");
            case SATURDAY -> System.out.println("Saturday");
            case SUNDAY -> System.out.println("Sunday");
        }

        WeekDay inputWeekDay = WeekDay.valueOf("MONDAY");
        System.out.println(inputWeekDay);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        WeekDay customWeekDay = WeekDay.getWeekDay(input);
        System.out.println(customWeekDay == null ? "UNKNOWN" : customWeekDay);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        LocalDate now = LocalDate.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        LocalDateTime localDateTimeRo = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime july = LocalDateTime.of(1999, Month.JULY, 10, 17, 30);
        System.out.println(july);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy 'ora' HH:mm:ss.SS");
        System.out.println(localDateTime.format(formatter));

        if (localDateTime.isEqual(localDateTimeRo)) {
            System.out.println("True");
        }

        ZonedDateTime romania = ZonedDateTime.now();
        ZonedDateTime asia = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        long hours = Duration.between(romania.toInstant(), asia.toInstant()).toHours();

        if (hours == 0) {
            System.out.println("True");
        }
    }

}
