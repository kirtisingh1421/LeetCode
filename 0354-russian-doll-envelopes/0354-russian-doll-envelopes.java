class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a,b) -> (a[0] != b[0]) ? Integer.compare(a[0],b[0]) : Integer.compare(b[1],a[1]));
        ArrayList<Integer> ans  = new ArrayList<>();
        for(int []a : envelopes){
            int  ele = a[1];
            if(ans.size() == 0 || ele > ans.get(ans.size()-1)) ans.add(ele);
            else replace(ele,ans);
        }
        return ans.size(); 
    }
    public void replace(int ele, ArrayList<Integer> ans){
        int l = 0;
        int h = ans.size()-1;
        int lo = -1;
        while(l <= h){
            int mid = l +(h-l)/2;
            if(ans.get(mid) >= ele){
                lo = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        ans.set(lo,ele);
    }
}