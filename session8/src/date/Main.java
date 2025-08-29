package date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

        System.out.println(formatter.format(date));
        System.out.println(date);

        long currentTimeMillis = System.currentTimeMillis();
        Date customDate = new Date(currentTimeMillis - 1000);
        System.out.println(customDate);

        if (customDate.before(date)) {
            System.out.println("customDate.before date");
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);

        // fully qualified name;
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(sqlDate);

        // The following line will throw an exception;
        // Instant instant = sqlDate.toInstant();
        // LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/Bucharest"));
        // System.out.println(localDateTime);

        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println(timestamp);
    }

    @Deprecated(forRemoval = true, since = "v1.0.2")
    public static void myMethod() {
        System.out.println("myMethod");
    }

}
