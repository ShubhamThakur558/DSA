class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int m=accounts[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                count+=accounts[i][j];
            }
            max=Math.max(max,count);
        }
        return max;
    }
}