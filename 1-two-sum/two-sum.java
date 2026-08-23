class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> st = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req = target - nums[i];
            if(st.containsKey(req)){
                return new int []{st.get(req),i};
            }
            else{
                st.put(nums[i],i);
            }
        }
        return new int []{};
    }
}