public class Problem7 {
    public static String quadraticRoots(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d < 0) {
            return "No roots";
        } else if (d == 0) {
            double root = -b / (2 * a);
            return String.format("x=%f", root);
        } else {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            return String.format("x1=%f x2=%f", root1, root2);
        }
    }
}
