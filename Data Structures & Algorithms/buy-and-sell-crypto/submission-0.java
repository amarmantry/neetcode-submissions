class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int max=0;
        for(int p : prices){
            if(p>buy){
                max=Math.max(max,p-buy);
            }
            else if(p<buy){
                buy=p;
            }
        }
        return max;
    }
}
