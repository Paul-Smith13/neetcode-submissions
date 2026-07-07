class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCounts = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            int indexRightChar = s.charAt(right) - 'A';
            charCounts[indexRightChar]++;
            maxFreq = Math.max(maxFreq, charCounts[indexRightChar]);

            int windowLen = right - left + 1;
            if (windowLen - maxFreq > k) {
                int indexLeftChar = s.charAt(left) - 'A';
                charCounts[indexLeftChar]--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
