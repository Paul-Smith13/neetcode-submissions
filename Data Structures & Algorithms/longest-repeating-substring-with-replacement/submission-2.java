class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> uniqueCharsCounts = new HashMap<>();
        int maxFrequency = 0;
        int left = 0;
        int windowLen = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            uniqueCharsCounts.merge(s.charAt(right), 1, Integer::sum);
            maxFrequency = Math.max(maxFrequency, uniqueCharsCounts.get(s.charAt(right)));
            
            windowLen = right - left + 1;
            if (k < windowLen - maxFrequency) {
                uniqueCharsCounts.merge(s.charAt(left), -1, Integer::sum);
                left++;
            }
            windowLen = right - left + 1;
            maxLength = Math.max(maxLength, windowLen);
        }
        
        return maxLength;
    }
}
