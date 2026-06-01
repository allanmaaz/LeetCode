class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=1;
        int mazp=0;
        int t;
        while(j<prices.length){
            if(prices[i]<prices[j]){
                t=prices[j]-prices[i];
                mazp=Math.max(t,mazp);

            }else{
                i=j;
            }
            j++;
        }
        return mazp;
    }
}