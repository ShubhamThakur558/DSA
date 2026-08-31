class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int zero = 0;
        int max = Integer.MIN_VALUE;
        while(high<nums.length){
            if(nums[high]==0){
                zero++;
            }
            while(zero>k){
                if(nums[low]==0)zero--;
                low++;
            }
            max = Math.max(max,high-low+1);
            high++;
        }
        return max;
    }
}