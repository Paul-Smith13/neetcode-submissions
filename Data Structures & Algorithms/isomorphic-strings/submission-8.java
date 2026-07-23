class Solution {
    public static boolean isIsomorphic(String s, String t) {
        //Isomorphic requirement: characters in one string can be mapped to characters in another
        //Isomorphic definition: having a similar or identical structure, shape, or form.
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Map<Character, Character> charMap = new HashMap<>(); 
        Map<Character, Character> reverseCharMap = new HashMap<>(); 
        
        //Need to check if chars are unique, if not terminate
        for (int i = 0; i < sChars.length; i++) {
            if (charMap.containsKey(sChars[i])) { //Check if it already contains key
                if (charMap.get(sChars[i]) != tChars[i]) { //Check if it already has another mapping, if so return false.
                    return false;
                }
            }
            if (reverseCharMap.containsKey(tChars[i])) {
                if (reverseCharMap.get(tChars[i]) != sChars[i]) { //Check if it already has another mapping, if so return false.
                    return false;
                }
            }
            //If it doesn't contain the kv pair, enter them
            if (!charMap.containsKey(sChars[i]) && !charMap.containsValue(tChars[i])
                && !reverseCharMap.containsKey(tChars[i]) && !reverseCharMap.containsValue(sChars[i])
            ) {
                charMap.put(sChars[i], tChars[i]);
                reverseCharMap.put(tChars[i], sChars[i]);
            } 

        }
        //charMap.forEach((key, val) -> {System.out.printf("%nKey= %c -> Value=%c", key, val);});
        return true;
    }
    
}