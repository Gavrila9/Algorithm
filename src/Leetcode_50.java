public class Leetcode_50 {
    /*
    // double -100.0 <= x <=100.0
    // int -2^31 <= n <= 2^31 -1
    / x=0 n!=0

     */

    public double pow(double x, long m){
        //long  是为了相反数做准备
        double r = 1.;
        //r 为结果
        for(; m>0; m>>=1){
            //m >0 , m 右移一位
            if((m&1) == 1){
             //m对2取余
                r *= x;
            }
            x *= x;
        }
        return r;
    }
    public double myPow(double x, int n) {
        long m = n;
        return m>=0? pow(x,m) : 1. / pow(x, -m);
    }
}
