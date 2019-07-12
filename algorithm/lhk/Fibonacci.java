import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
public class Fibonacci {
    private long[] storage;
    public Fibonacci(int N){
        storage = new long[N];
        for (int i = 0; i < N; i++){
            storage[i] = -1;
        }
        storage[0] = 0;
        storage[1] = 1;
    }

    public long F(int N){
        if (N == 0){
            return 0;
        }

        if (N == 1){
            return 1;
        }
        if (storage[N-1] != -1){
            return storage[N-1];
        }
        storage[N-1] = F(N - 1) + F(N - 2);
        return storage[N-1];
    }

    public static void main(String[] args){
        int size = StdIn.readInt();
        Fibonacci fib = new Fibonacci(size);
        for (int N = 0; N < size; N++){
            StdOut.println(N + " " + fib.F(N));
        }
    }
}



