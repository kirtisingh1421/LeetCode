//by using bit manipulation.
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n ==0) return false;
        if(n < 0) return false;
        return ((n & (n-1))==0);
    }
}


//by using recursion.
// class Solution {
//     public static int pow(int a, int b){
//         if(b==0) return 1;
//         int call = pow(a,b/2);
//         if(b%2 == 0) return call*call;
//         else return a*call*call;
//     }
//     public boolean isPowerOfTwo(int n) {
//         if(n <= 0) return false;
//         while(n > 1){
//             if(n % 2 !=0) return false;
//             n = n/2;
//         }
//         return true;
//     }
// }
