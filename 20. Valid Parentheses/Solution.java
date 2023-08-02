class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stk.push(c);
            }
            else {
                if (stk.isEmpty()){
                    return(false);
                }
                Character top = stk.peek();
                if ((top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}')){
                    stk.pop();
                }
                else{
                    return(false);
                }
            }
        }
        if (stk.isEmpty()){
            return(true);
        }
        else{
            return(false);
        }
    }
}