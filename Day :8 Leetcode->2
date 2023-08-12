

// Best Time to Buy and Sell Stock II //
class Solution {
    public int maxProfit(int[] prices) {
   
        int maxsum=0;
        for(int i=1;i<prices.length;i++)
        {  if(prices[i]>prices[i-1])
                maxsum=prices[i]-prices[i-1]+maxsum;
        }
        return maxsum;
    }
}

// Expected Output //



