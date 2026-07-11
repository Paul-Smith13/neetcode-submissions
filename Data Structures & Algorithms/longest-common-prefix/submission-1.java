class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int shortestWord = 200;
        String shortest = "";
        for (String s : strs) {
            if (s.length() < shortestWord) {
                shortestWord = s.length();
                shortest = s;
            }
        }

        String prefix = "";
        for (int i = 0; i < shortestWord; i++) {
            char currChar = shortest.charAt(i);
            boolean match = true;

            for (String s : strs) {
                if (s.charAt(i) != currChar) {
                    match = false;
                    break;
                }
            }

            if (match) {
                prefix = prefix + currChar;
            } else break;
        }

        return prefix;
    }
}