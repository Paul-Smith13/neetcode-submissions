class Solution {
        public static int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
            for (Integer i : nums){
                if (i != null) {
                    //Check if number map already has number
                    if (numberMap.containsKey(i) ){
                        numberMap.put(i, numberMap.get(i) + 1);
                    } else {
                        numberMap.put(i, 1);
                    }
                }
            }
            int[] kNums = new int[k];
            for (int i = 0; i < kNums.length; i++ ){
                Map.Entry<Integer, Integer> mostFrequentEntry = numberMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
                
                if (mostFrequentEntry != null) {
                    kNums[i] = mostFrequentEntry.getKey();
                    numberMap.put(mostFrequentEntry.getKey(), -1);
                } else {
                    break;
                }

            }

            return kNums;    
    }
}
