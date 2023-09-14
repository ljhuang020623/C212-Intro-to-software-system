public class Friday {

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    public static double billTotal(int t){
        return ((t * 1.0675) * 1.2);
    }
    public static double pointDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double sumOfSquares(int x, int y ){
        return Math.pow(x, 2) + Math.pow(y, 2);
    }
}

