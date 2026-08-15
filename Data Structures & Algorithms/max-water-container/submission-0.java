class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int l=0;
        int r=n-1;
        int max=0;
        while(l<r){
            int length=Math.min(heights[l],heights[r]);
            int breadth=r-l;
            int vol=length*breadth;
            max=Math.max(max,vol);
            if(heights[l]>heights[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return max;
    }
}
