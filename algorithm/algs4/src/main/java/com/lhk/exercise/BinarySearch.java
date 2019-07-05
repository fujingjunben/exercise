package com.lhk.exercise;

import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
    public static int rank(int key, int[] a){
        int high = a.length - 1;
        int low = 0;

        while (low <= high){
            int mid = (low + high) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]){
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main (String[] args){
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0){
                StdOut.println(key);
            }
        }
    }
}


