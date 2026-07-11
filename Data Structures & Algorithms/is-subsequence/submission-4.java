class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty() && !t.isEmpty()) {
            return true;
        }
        boolean sSubSeq = false;
        //iterate over both arrays and check if s is a subsequence of t
        int i = 0, j = 0;
        while ( i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            if (i == s.length()) {
                sSubSeq = i == s.length();
            }
            j++;
        }
        return sSubSeq;
    }
}