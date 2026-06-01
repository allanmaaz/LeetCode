class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while (nums[j]<=nums[i]){
                j--;
            }
            swap(nums,j,i);
            
        }
rev(nums,i+1,n-1);
        
    }
    private void swap(int[]nums,int l,int r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
        }
        private void rev(int[]nums,int l,int r){
            while(l<r){
                swap(nums,l,r);
                l++;
                r--;
            }
        }
}