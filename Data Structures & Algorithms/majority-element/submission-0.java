class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap();
        numCount.putAll(numCount);

        for (int i = 0 ; i < nums.length; i++) {
            numCount.merge(nums[i], 1, Integer::sum);
        }

        int maxKey = -1;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}