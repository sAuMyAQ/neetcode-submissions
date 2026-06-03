class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; //buy
        int right = 1; //sell
        int maxProfit = 0;

        while(right < prices.length){
            //currProfit = prices[right] - prices[left];
            if(prices[right] > prices[left]){
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            }
            else{
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
