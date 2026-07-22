class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        for(int i=0;i<n;i++){
            low = Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
        int mid = low+(high-low)/2;
        int student = 1;
        int page = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]+page<=mid){
                page+=nums[i];
            }
            else{
                student++;
                page= nums[i];
            }
          }
          if(student<=k){
             high = mid-1;
          }
          else{
            low = mid+1;
          }

        }
        return low;
    }
}