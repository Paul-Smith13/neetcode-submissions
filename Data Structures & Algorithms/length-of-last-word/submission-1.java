class Solution {
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        int len = split[split.length -1].length();
        return len;
    }
}