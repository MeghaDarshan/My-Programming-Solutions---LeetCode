/* Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.*/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0 || prices==null){return 0;}
        int maxProfit=0, min = prices[0];
        
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            if((prices[i]-min)>maxProfit){
                maxProfit = prices[i]-min;
            }
        }
        return maxProfit;
    }
}