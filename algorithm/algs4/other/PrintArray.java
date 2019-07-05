import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class PrintArray {
    public static void main (String[] args) {
        In in = new In(args[0]);
        String[] lines = in.readAllLines();
        int[][] intArray = new int[lines.length][];

        for (int i = 0; i < lines.length; i++) {
            StdOut.println(lines[i]);
            String[] line = lines[i].split(" ");
            int[] intA = new int[line.length];
            for (int j = 0; j < line.length; j++){
                intA[j] = Integer.parseInt(line[j]);
            }
            intArray[i] = intA;
        }

        StdOut.printf("%-10s", "");
        for(int i = 1; i <= intArray[0].length; i++){
            StdOut.printf("%-10d", i);
        }

        StdOut.printf("\n");

        for (int i = 0; i < intArray.length; i++){
            StdOut.printf("%-10d", i);
            for (int j = 0; j < intArray[i].length; j++){
                String tag = "*";
                if (intArray[i][j] == 0){
                    tag = "";
                }
                StdOut.printf("%-10s", tag);
            }
            StdOut.printf("\n");
        }
    }
}





