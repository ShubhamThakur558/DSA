class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr [] = new int [n];
        int posi = 0;
        int negi = 1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[posi]=nums[i];
                posi+=2;
            }
            else{
                arr[negi]=nums[i];
                negi+=2;
            }
        }
        return arr;
    }
}