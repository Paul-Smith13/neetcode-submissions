class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if (prices is None or len(prices) < 2 ): 
            return 0
        min_price = prices[0]
        max_profit = 0
        for i in range (len(prices)):
            if (prices[i] < min_price):
                min_price = prices[i]
            else:
                profit = prices[i] - min_price
                max_profit = max(max_profit, profit)
        return max_profit