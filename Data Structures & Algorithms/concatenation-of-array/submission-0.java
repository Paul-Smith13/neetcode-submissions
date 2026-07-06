class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int[] ans = new int[2*numsLength];
        for (int i=0; i < ans.length ; i++) {
            if (i < numsLength) {
                ans[i] = nums[i]; 
            } else {
                ans[i] = nums[i-numsLength];
            }
        }

        return ans;
    }
}