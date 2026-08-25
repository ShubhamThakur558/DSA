class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> st1 = new HashSet<>();
        HashSet <Integer> st2 = new HashSet<>();
        int n = nums1.length;
        int m = nums2.length;
        for(int i=0;i<n;i++){
            if(!st1.contains(nums1[i])){
                st1.add(nums1[i]);
            }
        }
        for(int j=0;j<m;j++){
            if(st1.contains(nums2[j])){
                st2.add(nums2[j]);
            }
        }
        int arr[]= new int[st2.size()];
        int i=0;
        for(int num:st2){
            arr[i++]=num;
        }
        return arr;
    }
}