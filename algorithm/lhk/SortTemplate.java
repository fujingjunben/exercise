import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class SortTemplate {
    public void sort(Comparable[] a){
    }

    public boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public void exch(Comparable[] a, int i, int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] a = StdIn.readAllStrings();
        SortTemplate template = new SortTemplate();
        template.sort(a);
        assert template.isSorted(a);
        template.show(a);
    }
}

            


