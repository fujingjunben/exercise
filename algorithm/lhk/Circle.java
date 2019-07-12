import edu.princeton.cs.algs4.StdDraw;

public class Circle {
    public static void main (String args[]) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        double N = x + y + 2 * r;

        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);
        StdDraw.circle(x, y, r);
        StdDraw.square(x, y, r);
    }
}
