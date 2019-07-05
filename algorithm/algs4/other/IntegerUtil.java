import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class IntegerUtil {
    public static String toBinStr(int origin){
        int n = 0;
        while ( origin > (1 << n)){
            n++;
        }

        StringBuilder builder = new StringBuilder();
        int decimalNum = origin;
        while(n > 0){
            n--;
            int bit = decimalNum >> n;
            builder.append(String.valueOf(bit));
            decimalNum = decimalNum & ((1 << n)- 1);
        }
        return builder.toString();
    }

    public static void main (String[] args){
        while(!StdIn.isEmpty()){
            int num = StdIn.readInt();
            StdOut.println(IntegerUtil.toBinStr(num));
        }
    }
}

            

