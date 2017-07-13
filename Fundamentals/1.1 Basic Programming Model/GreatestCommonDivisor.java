/**
 * Created by txin15 on 2017/7/12.
 */
public class GreatestCommonDivisor {
    private static int gcd(int p, int q){
        if(q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }
}