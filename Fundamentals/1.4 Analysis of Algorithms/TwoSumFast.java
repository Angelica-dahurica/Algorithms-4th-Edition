import java.util.Arrays;

/**
 * Created by txin15 on 2017/7/13.
 */
public class TwoSumFast {
    public static int count(int[] a){
        Arrays.sort(a);
        int cnt = 0;
        for(int i = 0; i < a.length; i++)
            if(BinarySearch.rank(-a[i], a)>1)
                cnt++;
        return cnt;
    }

    public static void main(String[] args){
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
