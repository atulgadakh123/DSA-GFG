class Solution {
    static boolean isBalanced(String s) {
        if(s.length() < 1){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            } 
            else if(stack.empty()){
                return false;
            } 
            else {
                if(ch == ')'){
                    if(stack.pop() != '(') return false;
                }
                else if(ch == '}'){
                    if(stack.pop() != '{') return false;
                }
                else if(ch == ']'){
                    if(stack.pop() != '[') return false;
                }
            }
        }

        // Final check
        return stack.empty();
    }
}
