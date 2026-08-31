class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr [] = new int [nums.length];
        int x = nums.length;
        int pos1 = 0;
        int pos2= 1;
        for(int i=0;i<x/2;i++){
            arr[pos1]=nums[i];
            pos1+=2;
        }
        for(int i=x/2;i<x;i++){
            arr[pos2]=nums[i];
            pos2+=2;
        }
        return arr;
    }
}