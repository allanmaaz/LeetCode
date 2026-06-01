class Solution {
    public int maxSubArray(int[] nums) {
        int cum=0;
        int Max=nums[0];
        for(int num :nums){
            cum+=num;
            Max=Math.max(cum,Max);
            if(cum<0){
                cum=0;
            }
        }
        return Max;
        
    }
}