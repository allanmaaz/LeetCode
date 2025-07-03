class Solution {
    public int search(int[] nums, int target) {
int aa=Arrays.binarySearch(nums,target);
return aa>=0?aa:-1;
    }
}
