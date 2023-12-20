public class Time {
    public static double secondsToMinutes(int seconds) {
        double result = (double) seconds / 60;
        return result;
    }

    public static double secondsToHours(int seconds) {
        double minutes = (double) seconds / 60;
        double result = minutes / 60;
        return result;
    }

    public static double secondsToDays(int seconds) {
        double minutes = (double) seconds / 60;
        double hours = minutes / 60;
        double result = hours / 24;
        return result;
    }

    public static double secondsToYears(int seconds) {
        double minutes = (double) seconds / 60;
        double hours = minutes / 60;
        double days = hours / 24;
        double result = days / 365;
        return result;
    }

    public static double minutesToSeconds(double minutes) {
        double result = minutes * 60;
        return result;
    }

    public static double hoursToSeconds(double hours) {
        double result = hours * 3600;
        return result;
    }

    public static double daysToSeconds(double days) {
        double result = days * 86400;
        return result;
    }

    public static double yearsToSeconds(double years) {
        double result = years * (365 * 24 * 60 * 60);
        return result;
    }
}