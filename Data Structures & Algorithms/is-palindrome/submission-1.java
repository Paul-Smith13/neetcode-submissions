class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> letters = new Stack<>();
        Queue<Character> fifoLetters = new LinkedList<>();
        for (char c : s.toCharArray()){    
            if (Character.isLetter(c) || Character.isDigit(c)){
                letters.push(Character.toLowerCase(c));
                fifoLetters.add(Character.toLowerCase(c));
                
            }
        }
        System.out.println(letters);
        System.out.println(fifoLetters);

        while (!letters.isEmpty()){
            char stackChar = letters.pop();
            char queueChar = fifoLetters.poll();
            if (stackChar != queueChar){
                return false;
            }
        }
        return true;
    }
}
