class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int x = lower(nums,target);
        int y = upper(nums,target)-1;
        if((x==n)||(nums[x]!=target)){
            return new int []{-1,-1};
        }
        return new int [] {x,y};
    }
    public int  lower ( int [] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int  upper ( int [] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}