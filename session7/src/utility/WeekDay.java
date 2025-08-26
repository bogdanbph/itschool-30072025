package utility;

public enum WeekDay {

    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String normalizedName;
    private int index;

    WeekDay(String normalizedName, int index) {
        this.normalizedName = normalizedName;
        this.index = index;
    }

    public static WeekDay getWeekDay(String day) {
        WeekDay[] values = WeekDay.values();
        for (WeekDay weekDay : values) {
            if (weekDay.name().equalsIgnoreCase(day)) {
                return weekDay;
            }
        }
        return null;
    }

}
