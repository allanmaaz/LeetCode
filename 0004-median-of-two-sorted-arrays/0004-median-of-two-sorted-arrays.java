class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length,n=nums2.length;
        if(m>n)return findMedianSortedArrays(nums2,nums1);
        int low = 0, high = m;
        int left=(m+n+1)/2;
        int in=m+n;
        while(low<=high){ 
            int mid1=low+(high-low)/2;
            int mid2=left-mid1;
             int l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int r1 = (mid1 == m) ? Integer.MAX_VALUE : nums1[mid1];
            int r2 = (mid2 == n) ? Integer.MAX_VALUE : nums2[mid2];
            if(l1<=r2 && l2<=r1){
            if(in%2==1){
                return Math.max(l1,l2);
            }else{
            return ((double)(Math.max(l1,l2)+Math.min(r1,r2))/2.0);
            }
            }
            else if(l1>r2){
                high=mid1-1;
            }
            else {
                low=mid1+1;
            }
 
        } 
        return 0.0;
        
    }
    
}