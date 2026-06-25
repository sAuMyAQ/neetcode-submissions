class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i =1; i<n; i++){
            for (int j = 0; j<i; j++){
                if(nums[j] + j >= i){
                    dp[i] = Math.min(dp[i], dp[j]+1);
                }
            }
        }

        return dp[n-1];
    }
}
