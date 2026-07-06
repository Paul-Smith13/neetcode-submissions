class Solution {
    public int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Integer> lastSeen = new Hashtable<>();

        int start = 0;
        int longestLength = 0;
        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            if (lastSeen.containsKey(current)
                && lastSeen.get(current) >= start
            ) {
                start = lastSeen.get(current) +1;
            }
            lastSeen.put(current, end);
            int currentLength = end - start + 1;
            longestLength = longestLength >= currentLength ? longestLength : currentLength;
        }
        return longestLength;
    }
}
