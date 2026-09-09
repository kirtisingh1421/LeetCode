//BINARY SEARCH.
class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : nums){
            if(ans.size() == 0 || ele > ans.get(ans.size()-1)) ans.add(ele);
            else replace(ele,ans);
        }
        return ans.size();
    }
    public int replace(int ele, ArrayList<Integer> ans){
        int l = 0;
        int h = ans.size()-1;
        int lb = -1;
        while(l <= h){
            int mid = l + (h-l)/2;
            if(ans.get(mid) >= ele){
                lb = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans.set(lb,ele);
    }
}




//TABULATION.

// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int[] dp = new int [n];
//         int maxlen = 1;
//         Arrays.fill(dp,1);
//         for(int i=0;i<n;i++){
//             int max = 0;
//             for(int j=0;j<i;j++){
//                 if(nums[j] < nums[i]){
//                     max = Math.max(max,dp[j]);
//                 }
//             }
//             dp[i] += max;
//             maxlen = Math.max(maxlen, dp[i]);
//         }
//         return maxlen;
//     }
// }

//MEMOIZATION.

// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int[][] dp = new int[n][n+1];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=n;j++){
//                 dp[i][j] = -1;
//             }
//         }
//         return helper(0,-1,nums,dp);
//     }
//     public int helper(int idx, int prev, int[] nums, int [][] dp) {
//         if(idx == nums.length) return 0;
//         if(dp[idx][prev+1] != -1) return dp[idx][prev+1];
//         int skip = helper(idx+1,prev,nums,dp);
//         if(prev != -1 && nums[idx] <= nums[prev]) return dp[idx][prev+1] = skip;
//         int pick = 1 + helper(idx+1,idx,nums,dp);
//         return dp[idx][prev+1] = Math.max(pick,skip);
//     }
// }