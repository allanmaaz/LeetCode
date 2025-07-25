class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0,high=m*n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int row=mid/n;
            int col = mid%n;
            int malval=matrix[row][col];
            if(malval==target){
                return true;
            
            }else if(malval<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}
