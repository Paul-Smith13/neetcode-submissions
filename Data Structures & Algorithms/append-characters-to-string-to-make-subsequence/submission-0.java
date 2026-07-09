class Solution {
    public int appendCharacters(String s, String t) {
        System.out.println("s = " + s + "\nt = " + t + "\nAppended string: " + s + t);
        char[] sChars = s.toCharArray(), tChars = t.toCharArray();
        int minChars = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            
            //Check 1: j is a valid pos in t
            if (j >= t.length()) {
                break;
            } 

            //Check 2: only increment j if they match
            if (sChars[i] == tChars[j]) {
                j++;
            }
        }
        //tChars remaining after j
        minChars = tChars.length - j;

        return minChars;
    }

}