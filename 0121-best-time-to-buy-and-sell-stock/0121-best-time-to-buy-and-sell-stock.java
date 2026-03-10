class Solution {
    public int maxProfit(int[] prices) {
        int front = 0;
        int back = 1;
        int profit = 0;
        int max = 0;
        while(back < prices.length){
            if(prices[back] < prices[front]){
                front = back;
            }
            else{
                profit = prices[back] - prices[front];
                if(profit > max){
                    max = profit;
                }
            }
            back++;

        }
        return max;
    }
}
