class Solution {
    public double myPow(double x, int n) {
        if(n ==0) return 1;
        if(x == 0) return 0;
        long N = n;
        if(N < 0){
            N = -N;
        }
        double result = solve(x,N);
        if(n > 0) return result;
        else return 1/result;
    }
    public double solve(double x, long N){
        if(N == 0) return 1;
        double ans = solve(x,N/2);
        double result;
        if(N % 2 == 0){
            result = ans*ans;
        }
        else{
            result = x*ans*ans;
        }
        return result;
    }
}