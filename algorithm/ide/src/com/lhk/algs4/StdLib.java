package com.lhk.algs4;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class StdLib {
    public static int[][] readIntArray (String input) {
        In in = new In(input);
        String[] lines = in.readAllLines();
        int[][] intArray = new int[lines.length][];

        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            int[] intA = new int[line.length];
            for (int j = 0; j < line.length; j++){
                intA[j] = Integer.parseInt(line[j]);
            }
            intArray[i] = intA;
        }

        return intArray;
    }

    public static void main(String[] args){
        int[][] matrix = StdLib.readIntArray(args[0]);

        for (int[] rows: matrix){
            for (int i: rows){
                StdOut.println(i);
            }
        }

    }
}
