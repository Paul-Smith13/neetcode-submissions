class Solution {
    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()){
            if (isOpenParenthesis(c)) {
                characters.push(c);
            } else {
                if (characters.isEmpty()) return false;
                char stackTop = characters.pop();
                if ((c == ')' && stackTop !='('|| 
                    c == '}' && stackTop !='{' ||
                    c == ']' && stackTop !='[')){
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }

    //Helper method to check if a bracket we're looking for
    public boolean isOpenParenthesis(char character){
        return (character == '(' || character == '[' || character=='{')  ? true : false;
    }
}