class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int maxarea = Integer.MIN_VALUE;
        while(i < j){
            int breadth = j - i;
            int length = Math.min(height[i],height[j]);
            int area = length*breadth;
            maxarea = Math.max(area,maxarea);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return maxarea;
    }
}