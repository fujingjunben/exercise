import java.lang.Math;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class LnFactorial {
    private double[] result;
    public LnFactorial(int n){
        result = new double[n];
        result[0] = 0;
    }

    public double fun(int n){
        if (n == 0 || n == 1){
            return 0;
        }
        if (result[n-1] != 0){
            return result[n-1];
        }
        result[n-1] = Math.log(n) + fun(n - 1);
        return result[n-1];
    }

    public static void main(String[] args){
        int n = StdIn.readInt();
        LnFactorial lf = new LnFactorial(n);
        for (int i = 0; i <= n; i++){
            StdOut.println(i + ": " + lf.fun(i));
        }
    }
}

