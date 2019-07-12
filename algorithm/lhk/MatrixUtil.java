import edu.princeton.cs.algs4.StdOut;
import com.lhk.algs.StdLib;

public class MatrixUtil {
    public static int[][] transform(int[][] origin){
        int rows = origin.length;
        int cols = origin[0].length;
        int[][] newMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                newMatrix[j][i] = origin[i][j];
            }
        }
        return newMatrix;
    }

    public static void print(int[][] intArray){
        StdOut.printf("%-10s", "");
        for(int i = 1; i <= intArray[0].length; i++){
            StdOut.printf("%-10d", i);
        }

        StdOut.printf("\n");

        for(int i = 1; i <= intArray[0].length; i++){
            StdOut.printf("%-12s", "************");
        }
        StdOut.printf("\n");

        for (int i = 0; i < intArray.length; i++){
            StdOut.printf("%-10s", i + " |");
            for (int j = 0; j < intArray[i].length; j++){
                StdOut.printf("%-10d", intArray[i][j]);
            }
            StdOut.printf("\n");
        }
    }
 

    public static void main(String[] args){
        int[][] old = StdLib.readIntArray(args[0]);
        int[][] newMatrix = MatrixUtil.transform(old);
        MatrixUtil.print(newMatrix);
    }
}


