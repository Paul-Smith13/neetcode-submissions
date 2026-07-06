class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Arrays.sort(nums);
        List<Integer> currentSeq = new ArrayList<>();
        List<Integer> longestSequence = new ArrayList<>();

        currentSeq.add(nums[0]);
        
        for (int i = 1; i < nums.length; i++) {
            int last = currentSeq.get(currentSeq.size() -1);
            if (nums[i] == last){
                continue;
            } else if (nums[i] == last + 1){
                currentSeq.add(nums[i]);
            } else {
                if (currentSeq.size() > longestSequence.size()) {
                    longestSequence = new ArrayList<>(currentSeq);
                }
                currentSeq.clear();
                currentSeq.add(nums[i]);
            }
        }
        if (currentSeq.size() > longestSequence.size()){
            longestSequence = currentSeq;
        }
        longestSequence.forEach(i -> System.out.println(i));
        return longestSequence.size();
    }

}
