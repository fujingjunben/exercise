package com.lhk.algs4;


/**
 * 插入排序
 * 2019-07-16
 * lhk
 */
public class Insertion extends SortTemplate {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }


    public static void main (String[] args){
        Insertion insertion = new Insertion();
        insertion.run();
    }
}
