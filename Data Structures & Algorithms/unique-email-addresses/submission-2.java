class Solution {
    public static Set<Character> acceptableCharacters = new HashSet<>();

    public static int numUniqueEmails(String[] emails) {
        Set<String> seenEmails = new HashSet<>();

        //Get all acceptable characters
        //char[] acceptableCharacters = new char[29];
        for (int i = 0; i < 26; i++) {
            acceptableCharacters.add((char) ('a' + i));
        }
        acceptableCharacters.add('@');
        acceptableCharacters.add('+');
        acceptableCharacters.add('.');

        int count = 0;
        for (String s : emails) {
            boolean invalidChar = false;
            //If email contains unacceptable chars, skip to next email
            for (char c : s.toCharArray()) {
                if (!acceptableCharacters.contains(c)) {
                    invalidChar = true;
                    break;
                }    
            }
            //Skip invalid characters
            if (invalidChar) continue;

            //Names should only contain one at
            if (!oneAt(s)) {
                continue;
            }
            //Check if local & domain names empty
            String[] localAndDomainNames = s.split("@");
            if (localAndDomainNames[0] == null ||
                localAndDomainNames[1] == null ||
                localAndDomainNames[0].isEmpty() || 
                localAndDomainNames[1].isEmpty() ||
                localAndDomainNames[0].startsWith("+")
            ) {
                continue;
            }

            //Names need to contain an @
            if (!s.contains("@")) {
                continue;
            }

            String normalisedEmail = normaliseName(s);
            if (seenEmails.contains(normalisedEmail)) {
                continue;
            }
            //If survive all conditions, increment
            seenEmails.add(normalisedEmail);
            count++;
        }

        return count;
    }

    //Helper - normalise names
    public static String normaliseName(String unnormalisedName) {
        //Avoid getting rid of .com
        String[] normalisedNameArray = unnormalisedName.split("@");
        String firstPart =  normalisedNameArray[0];
        if (firstPart.contains("+")) {
            firstPart = firstPart.substring(0, normalisedNameArray[0].indexOf("+"));
        }
        firstPart = firstPart.replace(".", "");
        
        String secondPart =  normalisedNameArray[1];
                
        return firstPart + "@" + secondPart;
    }
    
    //Helper - count @s
    public static boolean oneAt(String email) {
        int atCount = 0;
        for (char c : email.toCharArray()) {
            if (c == '@') {
                atCount++;
            }
            if (atCount > 1) return false;
        }
        return atCount == 1;
    } 
 
}