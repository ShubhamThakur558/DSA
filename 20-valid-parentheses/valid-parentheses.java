class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char top = st.pop();
                    if(top=='('&&c!=')'||top=='['&&c!=']'||top=='{'&&c!='}'){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}