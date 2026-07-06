class Solution {
    public static boolean isValid(String s) {
    	Stack<Character> stack = new Stack<>();
    	for (char ch: s.toCharArray()) {
    		if (ch == '(' || ch == '{' || ch == '[') {
    			stack.push(ch);
    		} else {
    			if (stack.isEmpty()) return false;
    			
    			char stackTop = stack.pop();
    			if ((ch == ')'  && stackTop != '(') ||
    			(ch == '}' && stackTop != '{') ||
				(ch == ']' && stackTop != '[')) {
					return false;
				}
    		}
    	}
    	return stack.isEmpty();
    }
}