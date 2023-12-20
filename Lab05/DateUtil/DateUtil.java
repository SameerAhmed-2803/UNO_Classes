public class DateUtil {
    public static String format(int month, int day, int year) {
        // call format method from String class to get a specific format of date.
        return String.format("%02d/%02d/%d", month, day, year);
    }

    public static String format(String date, int year) {
        return String.format("%s, %d", date, year);
    }

    public static String format(String month, int day, int year) {
        return String.format("%s %02d, %d", month, day, year);
    }

    public static String format(String month, String day, String year) {
        return String.format("%s %s, %s", month, day, year);
    }
}
