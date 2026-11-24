class Solution {
    // Optimise later using Greedy 
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j] - prices[i];
                result = Math.max(result, sell);
            }
        }
        return result;
    }
}
