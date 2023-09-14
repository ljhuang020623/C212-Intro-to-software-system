public class Problem5 {
    public static Boolean isEvenlySpaced(int a, int b, int c) {
        int Max = Math.max(a, Math.max(b, c));
        int Min = Math.min(a, Math.min(b, c));
        int Mid = a + b + c - Max - Min;
        return (Max - Mid) == (Mid - Min);
    }
}
