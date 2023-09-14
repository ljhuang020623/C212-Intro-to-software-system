public class Problem4 {
    public static String numberToMonth(int monthNumber) {
        String months = "January   February  March     April     May       June      July      August    September October   November  December  ";
        int startIndex = (monthNumber - 1) * 10;
        int endIndex = startIndex + 9;
        return months.substring(startIndex, endIndex).trim();
    }
    public static String stringifyDate(int y) {
        int a = y % 19;
        int b = y / 100;
        int c = y % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int P = (h - m + r + n + 19) % 32;
        String months = "January   February  March     April     May       June      July      August    September October   November  December  ";
        int startIndex = (n - 1) * 10;
        int endIndex = startIndex + 9;
        String outPutMonths = numberToMonth(n).strip();
        return outPutMonths + " " + P + ", " + y;
    }
}
