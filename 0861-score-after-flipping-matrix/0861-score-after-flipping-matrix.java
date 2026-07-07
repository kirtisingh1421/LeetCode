class Solution {
    public int matrixScore(int[][] arr) {
        //0th col of matrix should have all ones.
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){  
            if(arr[i][0] == 0){   //flip that row
                for(int j =0;j<n;j++){
                    arr[i][j] = 1 - arr[i][j];
                }
            }
        }
        // har us col ko flip karo jisme no. of 0 > no. of 1
        for(int j = 0;j<n;j++){
            int zeros= 0; 
            int ones = 0;
            for(int i=0;i<m;i++){
                if(arr[i][j] == 0) zeros++;
                else ones++;
            }
            if(zeros > ones){   //flip that column
                for(int i=0;i<m;i++){
                    arr[i][j] = 1 - arr[i][j];
                }
            }
        }
        int sum = 0;
        int pow = 1;
        for(int j = n-1;j>=0;j--){
            int ones = 0;
            for(int i =0;i<m;i++){
                if(arr[i][j] == 1) ones++;
            }
            sum += pow*ones;
            pow *= 2;
        }
        return sum;
    }
}