class Solution {
    public boolean isPalindrome(int x) {
        int org =x;
        int rev = 0;
        while(x>0){
            int num = x%10;
            rev = rev*10+num;
            x=x/10;
        }
        return org==rev;
    }
}