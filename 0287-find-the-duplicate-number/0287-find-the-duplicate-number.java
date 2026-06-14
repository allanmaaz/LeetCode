class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        // Arrays.sort(nums);
        // for(int i=0;i<n-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;
int []f=new int[n+1];
for(int i=0;i<n;i++){
    if(f[nums[i]]==0){
        f[nums[i]]+=1;

    }else{
        return nums[i];
    }
}return 0;
        
    }
}