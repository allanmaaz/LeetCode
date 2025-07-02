class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int left=0,right=0;
        int total=0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=left){
                    left=height[l];
                }else{
                    total+= left-height[l];
                }
                l++;
            }else{
                if(height[r]>=right){
                    right=height[r];
                }else{
                    total+=right-height[r];
                }
                r--;
            }
        }
        return total;
        
    }
}