class Solution {
    public int search(int[] nums, int target) {
        int j = 0;
        int k = nums.length-1;
        for (int i = j; i < nums.length; i++) {
            if (nums[j] == target) {
                return j;
            } else if (nums[k] == target) {
                return k;
            }
            j++;
            k--;
        }
        return -1;
    }
}
