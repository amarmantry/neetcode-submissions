class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        HashMap<Character,Character> check=new HashMap<>();
        check.put('}','{');
        check.put(')','(');
        check.put(']','[');
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='[') {stack.push(c);}
            else{
                if(stack.isEmpty() || stack.peek()!=check.get(c)) {
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
