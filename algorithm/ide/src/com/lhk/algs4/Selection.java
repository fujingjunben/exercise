package com.lhk.algs4;

/**
 * 选择排序
 * 2019-07-16
 * lhk
 */
public class Selection extends SortTemplate {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, min, i);
        }
    }

    public static void main(String[] args) {
        Selection selection = new Selection();
        selection.run();
    }
}
