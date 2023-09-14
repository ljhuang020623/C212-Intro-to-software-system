public class Problem8 {
    public static Boolean isInsideCircle(double Cx,double Cy, double r, double Px, double Py){
        return Math.sqrt(Math.pow((Px - Cx), 2) + Math.pow((Py - Cy), 2)) < r;
    }

    public static Boolean isInsideRectangle(double Rx, double Ry, double w, double h, double Px, double Py){
        return (Px > Rx) && (Px < Rx + w) && (Py > Ry) && (Py < Ry + h);
    }
}
