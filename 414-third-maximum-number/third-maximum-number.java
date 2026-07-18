class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long largest = Long.MIN_VALUE;
        long slargest = Long.MIN_VALUE;
        long tlargest = Long.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=largest&&nums[i]>slargest){
                slargest=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=largest&&nums[i]!=slargest&&nums[i]>tlargest){
                tlargest = nums[i];
            }
        }
        if(tlargest==Long.MIN_VALUE){
            return (int)largest;
        }
        else{
            return (int)tlargest;
        }
    }
}