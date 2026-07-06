class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String s : strs){
            if (s != null){
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            }
        }
        return new ArrayList<>(anagramMap.values());

    }
}
