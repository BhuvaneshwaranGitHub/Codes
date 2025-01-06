class Solution {
    public int maxProfit(int[] prices) {
        int maximum=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            int cost=prices[i]-maximum;
            profit=Math.max(profit,cost);
            maximum=Math.min(maximum,prices[i]);
        }
        return profit;
        
    }
}