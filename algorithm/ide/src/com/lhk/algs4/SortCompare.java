package com.lhk.algs4;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {
    public static double time(String alg, Double[] a){
        Stopwatch timer = new Stopwatch();
        switch (alg) {
            case "Insertion":
                new Insertion().sort(a);
                break;
            case "Selection":
                new Selection().sort(a);
                break;
            case "InsertionV1":
                new InsertionV1().sort(a);
                break;
            case "Shell":
                break;
            case "Merge":
                break;
            case "Quick":
                break;
            case "Heap":
                break;
        }

        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++){
            for (int i = 0; i < N; i++){
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args){
//        String alg1 = args[0];
//        String alg2 = args[1];
//        int N = Integer.parseInt(args[2]);
//        int T = Integer.parseInt(args[3]);
        String alg1 = "InsertionV1";
        String alg2 = "Selection";
        int N = 1000;
        int T = 100;
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        StdOut.printf("For %d random Doubles\n%s is", N, alg1);
        StdOut.printf(" %.1f times faster than %s\n", t2/t1, alg2);
    }
}
