import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdInt;

public class Binomial {
    private double[][] result;
    private Binomial(int n, int k){
        result = new double[n][k];
        result[0][0] = 1.0;
    }

    public double f(int n, int k, double p){
        if (n == 0 && k == 0){
            return 1.0;
        }
        if (n < 0 || k < 0){
            return 0.0;
        }

        result[n][k] = (1.0 - p) * f(n - 1, k, p) + p * f(n - 1, k - 1);
        if 

