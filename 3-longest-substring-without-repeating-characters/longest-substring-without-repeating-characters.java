class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq [] = new int [256];
        int low = 0;
        int high = 0;
        int max =0;
        while(high<s.length()){
            while(freq[s.charAt(high)]>0){
                freq[s.charAt(low)]--;
                low++;
            }
            freq[s.charAt(high)]++;
            max = Math.max(max,high-low+1);
            high++;

        }
        return max;
    }
}