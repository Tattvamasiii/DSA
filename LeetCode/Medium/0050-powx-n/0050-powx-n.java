class Solution {
    public double myPow(double x, int n) {
          long N=n;
       if(N<0){
           x=1/x; // If power is negative, x will be reciprocal
           N=-N; // To make N positive
       }
       return fastPow(x, N);
    }
    static double fastPow(double x, long N ){
       // Base case
       if(N==0){
           return 1;
       }
       double half= fastPow(x,N/2);
       if(N%2==0){
           return half*half;
       }else{
           return half * half *x;
       }
    }
    }
