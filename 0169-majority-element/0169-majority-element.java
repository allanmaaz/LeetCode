class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Random rand = new Random();
        while(true){
            int c=nums[rand.nextInt(n)];
            int count=0;
            for(int i:nums){
                
                if(i==c){
                    count++;
                }
                if(count>n/2)return c;
            }
        }
    }
}