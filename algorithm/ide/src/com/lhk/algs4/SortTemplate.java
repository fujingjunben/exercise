package com.lhk.algs4;

import edu.princeton.cs.algs4.*;


public class SortTemplate {
    public void sort(Comparable[] a) {
    }

    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 检查数组排序后是否被修改过
     */
    public boolean check(Comparable[] a) {
        Comparable[] b = a.clone();
        sort(a);
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public double norm(Comparable a) {
        if (a instanceof String) {
            try {
                return Double.parseDouble((String) a);
            } catch (Exception e) {
                return str2char((String) a);
            }
        } else {
            return 1;
        }
    }

    public double str2char(String a) {
        char[] charArray = a.toCharArray();
        int N = charArray.length;
        double sum = 0;
        for (char c : charArray) {
            sum = sum + (c - 'a') * Math.pow(25, N - 1);
        }
        return sum / 25;
    }

    /**
     * 绘制柱状图
     *
     * @param a 数组
     */
    public void draw(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = norm(a[i]) / 2.0;
            double rw = 0.5 / N;
            double rh = norm(a[i]) / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    public void run() {
        String[] a = StdIn.readAllStrings();
        StdOut.println("排序前");
        this.show(a);
        boolean changed = this.check(a);
        assert this.isSorted(a);
        StdOut.println("排序后");
        this.show(a);
        if (!changed) {
            StdOut.println("数组被修改过");
        }
    }

    public static void main(String[] args) {
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++){
            a[i] = i;
        }
//        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);
        for (int i = 0; i < N; i++){
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.line(x, 0.0, x, y);
        }
    }
}

            


