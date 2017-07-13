/**
 * Created by txin15 on 2017/7/13.
 * 插入排序的基本思想是：每步将一个待排序的纪录，按其关键码值的大小插入前面已经排序的文件中适当位置上，直到全部插入完为止。
 */
public class Insertion {
    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i = 0; i < N; i++)
            for(int j = i; j > 0 && less(a[j],a[j-1]); j--)
                exch(a, j , j-1);
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
