package strings;

public class Main {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Salutare");
        // StringBuffer stringBuffer = new StringBuffer();

        System.out.println(stringBuilder);

        stringBuilder.append("Salutare")
                .append(", ")
                .append("Bogdan")
                .append("!");

        System.out.println(stringBuilder);

        stringBuilder.insert(2, "Bogdan");

        System.out.println(stringBuilder);

        String s = "myString";

        String meSomeStrings = getMeSomeStrings();
        System.out.println(meSomeStrings);
    }

    public static String getMeSomeStrings() {
        return new StringBuilder("myString")
                .append(",")
                .append(" myOtherString")
                .append(" and ")
                .append("myLastString")
                .toString();
    }

}
