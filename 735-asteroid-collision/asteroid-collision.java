class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        for(int i=0;i<n;i++){ 
            boolean check = true;
            while(check&&!st.isEmpty()&&st.peek()>0&&asteroids[i]<0){
                if(st.peek()<-asteroids[i])st.pop();
                else if(st.peek()==-asteroids[i]){
                    st.pop();
                    check=false;
                }
                else{
                    check=false;
                }
            }
                if(check)st.push(asteroids[i]);
        }
            int ans[] = new int [st.size()];
            for(int i=0;i<ans.length;i++){
                ans[i]=st.get(i);
            }
        return ans;
    }
}