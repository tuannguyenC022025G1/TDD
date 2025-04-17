public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        int[] daysInMonth = {
                31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        day++;

        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;
        }

        if (month > 12) {
            month = 1;
            year++;
        }

        return getString(day, month, year);
    }

    private static String getString(int day, int month, int year) {
        return day + "/" + month + "/" + year;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
