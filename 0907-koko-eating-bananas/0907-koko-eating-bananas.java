class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        int result = r;
        while(l<=r){
            int k=l+(r-l)/2;
            int ho=0;
            for(int pile:piles){
                ho+=Math.ceil((double)pile/k);
            }
            if(ho<=h){
                result=k;
                r=k-1;
            }
            else{
                l=k+1;
            }
        }
        return result ;
        
    }
}