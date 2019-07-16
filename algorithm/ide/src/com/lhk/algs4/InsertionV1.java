package com.lhk.algs4;


/**
 * 插入排序
 * 2019-07-16
 * lhk
 */
public class InsertionV1 extends SortTemplate {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            int pos = i;
            Comparable tmp = a[i];
            for (int j = i; j > 0 && less(tmp, a[j - 1]); j--) {
                a[j] = a[j-1];
                pos = j - 1;
            }
            a[pos] = tmp;
        }
    }


    public static void main (String[] args){
        InsertionV1 insertion = new InsertionV1();
        insertion.run();
    }
}
