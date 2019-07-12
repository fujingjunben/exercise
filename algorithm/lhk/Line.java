import edu.princeton.cs.algs4.StdDraw;

public class Line {
    public static void main (String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double y0 = Double.parseDouble(args[1]);
        double x1 = Double.parseDouble(args[2]);
        double y1 = Double.parseDouble(args[3]);

        StdDraw.line(x0, y0, x1, y1);
    }
}
