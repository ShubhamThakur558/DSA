class Solution {
    public int reverse(int x) {
       long left = 0; 
       while(x!=0){
        int num = x%10;
        left = left*10+num;
        x=x/10;
       }
       if(left<Integer.MIN_VALUE||left>Integer.MAX_VALUE){
        return 0;
       }
       return (int)left;
    }
}