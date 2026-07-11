class Solution {
    public static  int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, currMax = 0, iter = 0;
        while (iter < nums.length) { 
            if (nums[iter] == 1) {
                currMax++;
                max = Math.max(max, currMax);
            } else {
                currMax = 0;
            }
            iter++;
        }
        return max;
    }
}