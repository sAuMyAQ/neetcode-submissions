class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length + 1];
        //end value will be cost of reaching top floor

        //cost of reaching step 0/1 is 0
        for(int i =2; i<minCost.length; i++){
            int oneStep = minCost[i-1] + cost[i-1];
            int twoStep = minCost[i-2] + cost[i-2];
            minCost[i] = Math.min(oneStep, twoStep);
        }
        return minCost[minCost.length - 1];
    }
}
