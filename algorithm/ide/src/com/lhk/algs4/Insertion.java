package com.lhk.algs4;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;

public class Insertion extends SortTemplate {
    @Override
    public void sort(Comparable[] a){
        int N = a.length;
        for(int i = 1; i < N; i++){
            for(int j = i; j > 0; j--){
                if (less(a[i], a[i-j])) {
                    exch(a, i, i - j);
                }
            }
        }
    }


    public static void main (String[] args){
        String[] a = In.readStrings();
        Insertion insertion = new Insertion();
        insertion.show(a);
        insertion.sort(a);
        assert insertion.isSorted(a);
        insertion.show(a);
    }
}
