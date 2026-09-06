class Solution {
    public int minDistance(String a, String b) {
        int m = a.length();
        int n = b.length();
        int [][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return edit(m-1,n-1,new StringBuilder(a),new StringBuilder(b),dp);
    }
    public int edit(int i, int j,StringBuilder a, StringBuilder b,int [][] dp) {
        if(i<0) return j+1;    //inserting remaining character of b 
        if(j<0) return i+1;    //removing extra character of b.
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)) return dp[i][j] = edit(i-1,j-1,a,b,dp);
        int replace = 1 + edit(i-1,j-1,a,b,dp);
        int remove = 1 + edit(i-1,j,a,b,dp);
        int insert = 1 + edit(i,j-1,a,b,dp);
        return dp[i][j] = Math.min(replace, Math.min(insert,remove));
    }
}