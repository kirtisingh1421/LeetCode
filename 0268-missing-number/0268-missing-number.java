class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor =0;
        int count = 1;
        for(int i=0;i<n;i++){
            xor ^= nums[i];
            xor ^= count;
            count++;
        }
        return xor;
    }
}










// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;     //max element(0 to n)
//         int i=0;
//         while(i < nums.length){
//             if(nums[i] == i || nums[i] == n) i++;
//             else{
//                 int idx = nums[i];
//                 swap(nums,i,idx);
//             }
//         }
//         for(i=0;i<nums.length;i++){
//             if(nums[i] != i) return i;
//         }
//         return n;
//     }
//     public void swap(int[] nums,int i, int idx){
//         int temp = nums[i];
//         nums[i] = nums[idx];
//         nums[idx] = temp;
//     }
// }