package org.mudit.dsa.leetcode;

public class Stocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        maxProfit(prices);
    }


    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int sell = prices[i];
            if (sell > buy) {
                profit = Math.max(profit, sell - buy);
            } else {
                buy = sell;
            }
        }
        return profit;
    }
}
