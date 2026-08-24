//space optimzation
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n==2) return Math.min(cost[0],cost[1]);
        int [] dp = new int[3];
        dp[0] = cost[0]; 
        dp[1] = cost[1];
        for(int i=2;i<n;i++){
            dp[2] = cost[i]+Math.min(dp[0],dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return Math.min(dp[0],dp[1]);
    }
}




//memoization.

// class Solution {
//     static int[] dp;
//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;
//         dp = new int[n];
//         Arrays.fill(dp, -1);
//         return Math.min(minCost(0,cost),minCost(1,cost));
//     }
//     public int minCost(int i,int[] cost) {
//         if(i >= cost.length) return 0;
//         if(dp[i] != -1) return dp[i];
//         return dp[i] = cost[i]+ Math.min(minCost(i+1,cost),minCost(i+2,cost));
//     }
// }