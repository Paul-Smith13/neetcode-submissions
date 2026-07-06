class Solution {
    public int search(int[] nums, int target) {
        int k = nums.length-1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == target) {
                return j;
            } else if (nums[k] == target) {
                return k;
            }
            k--;
        }
        return -1;
    }
}
