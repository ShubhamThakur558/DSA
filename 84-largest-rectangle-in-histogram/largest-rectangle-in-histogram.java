class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int max =0;
        for(int i=0;i<=n;i++){
            int curr;
            if(i==n)curr=0;
            else curr=heights[i];
            while(!st.isEmpty()&&curr<heights[st.peek()]){
                int idx = st.pop();
                int height=heights[idx];
                int width;
                if(st.isEmpty()){
                    width=i;
                }
                else{
                    width=i-st.peek()-1;
                }
                int area = height*width;
                max=Math.max(max,area);
            }
            st.push(i);
        }
        return max;

    }
}