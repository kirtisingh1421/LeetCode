class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0) return false;
       return (isPowerOfTwo(n) && isSquare(n)) ? true : false; 
    }
    public boolean isPowerOfTwo(long n){
        return ((n & (n-1)) == 0);  
    }
    public boolean isSquare(long n){
        double root = Math.sqrt(n);
        if(root * root == n) return true;
        else return false;
    }
}






// class Solution {
//     public int pow(int a, int b){
//         if(b==0) return 1;
//         int call = pow(a,b/2);
//         if(b%2 == 0) return call*call;
//         else return call*call*a;
//     }
//      public boolean isPowerOfFour(int n) {
//         if(n <= 0) return false;
//         while(n > 1){
//             if(n%4 != 0) return false;
//             n = n/4;
//         }
//         return true;
//     }
// }