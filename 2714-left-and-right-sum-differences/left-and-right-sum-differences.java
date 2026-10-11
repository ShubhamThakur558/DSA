class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int sum=0;
        int left=0;
        for(int i=0;i<n;i++) sum+=nums[i];
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int right=sum-nums[i]-left;
            ans[i]=Math.abs(left-right);
            left+=nums[i];
        }
        return ans;
    }
}