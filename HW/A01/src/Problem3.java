public class Problem3 {
    public static String numberToMonth(int monthNumber) {
        String months = "January   February  March     April     May       June      July      August    September October   November  December  ";
        int startIndex = (monthNumber - 1) * 10;
        int endIndex = startIndex + 9;
        return months.substring(startIndex, endIndex).trim();
    }
}
