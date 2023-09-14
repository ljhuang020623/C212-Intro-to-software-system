public class Problem2 {
    public static double dewPoint(double RH, double T) {
        double a = 17.27;
        double b = 237.7;
        double function = (a * T) / (b + T) + Math.log(RH);
        return (b * function) / (a - function);
    }
}
