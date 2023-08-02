class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int buy = prices[0];
        int profit = 0;

        for (int i = 0; i < size; i++){
            if (prices[i] < buy){
                buy = prices[i];
            }
            profit = (prices[i] - buy > profit) ? prices[i]-buy : profit;
        }
        return(profit);
    }
}