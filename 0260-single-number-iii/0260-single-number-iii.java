class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int ele : nums){
            xor = xor ^ ele;
        }
        int mask = (xor & (xor -1)) ^ xor;
        int b1 =0;
        int b2 = 0;
        for(int ele: nums){
            if((mask & ele) != 0) b1 ^= ele;
            else b2 ^= ele;
        }
        int [] arr= {b1,b2};
        Arrays.sort(arr);
        return arr;
    }
}