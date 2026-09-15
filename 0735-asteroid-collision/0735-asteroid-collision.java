class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int asteroid : asteroids){
            boolean destroyed  = false;
            while(!st.isEmpty() && st.peek() > 0 && asteroid < 0){
                if(st.peek() < -asteroid){  //if peek ele is smaller than current then pop peek
                    st.pop();
                }
                else if(st.peek() == -asteroid){   //if both are equal
                    st.pop();
                    destroyed = true;
                    break;
                }
                else{     //if current ele is smaller than peek then pop current
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                st.push(asteroid);
            }
        }
        int [] result = new int[st.size()];
        for(int i=0;i<st.size();i++){
            result[i] = st.get(i);
        }
        return result;
    }
}