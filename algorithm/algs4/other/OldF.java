import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
public class OldF {
    public static long F(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args){
        int size = StdIn.readInt();
        for (int N = 0; N < size; N++){
            StdOut.println(N + " " + F(N));
        }
    }
}



