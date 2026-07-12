class Solution {
    public void sort(int nums[],int l, int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        sort(nums,l,mid);
        sort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    public static void merge(int nums[],int l, int mid, int r){
        int temp[]=new int[r-l+1];
        int i=l, j=mid+1,k=0;
        while(i<=mid && j<=r){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
            while(i<=mid)
            {
                 temp[k++]=nums[i++];
            }
            while(j<=r){
                 temp[k++]=nums[j++];
            }
            for(int p=0;p<temp.length;p++){
                nums[l+p]=temp[p];
            }
        }
    
    public void sortColors(int[] nums) {
        sort(nums, 0, nums.length-1);
    }
}