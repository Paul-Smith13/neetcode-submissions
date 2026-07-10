class Solution {
    public int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int[] charVals = new int[chars.length];
        //Get all ASCII character values
        for (int i = 0; i < chars.length; i++) {
            charVals[i] = (int) chars[i];
        }

        List<Integer> diffs = new ArrayList();
        //Get all differences
        for (int i = 0; i < charVals.length -1; i++) {
            int diff = Math.abs(charVals[i] - charVals[i+1]);
            //Get abs diff val & add to diffs
            diffs.add(diff);

        }

        int score = 0;
        //Sum all differences
        for (Integer i : diffs) {
            score+= i;
        }

        return score;
    }
}