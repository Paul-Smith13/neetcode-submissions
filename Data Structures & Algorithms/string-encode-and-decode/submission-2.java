class Solution {

    public static String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs){
            encodedString.append(str).append("|");
        }
        return encodedString.toString();
    }

    public static List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        if (str.isEmpty()){
            return decodedStrings;
        }

        if (str.endsWith("|")){
            str = str.substring(0, str.length() - 1);
        }
        String[] strs = str.split("\\|");
        Collections.addAll(decodedStrings, strs);
        return decodedStrings;
    }
}
