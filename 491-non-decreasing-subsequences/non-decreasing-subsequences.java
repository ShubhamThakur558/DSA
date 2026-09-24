class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return ans;
    }
    private void backtrack(int[] nums, int start, List<Integer> curr) {
        if (curr.size() >= 2) {
            ans.add(new ArrayList<>(curr));
        }
        HashSet<Integer> used = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (used.contains(nums[i])) {
                continue;
            }
            if (!curr.isEmpty() && nums[i] < curr.get(curr.size() - 1)) {
                continue;
            }
            used.add(nums[i]);
            curr.add(nums[i]);
            backtrack(nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}