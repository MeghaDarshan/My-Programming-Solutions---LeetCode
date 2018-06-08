/*Say you have an array for which the ith element is the price of a given stock on day i.
Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).*/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0 || prices==null)return 0;
        int maxProfit=0, min=prices[0];
        
        for(int i=1;i<prices.length;i++){
         if(prices[i]<min){
             min = prices[i];
              
             
         } 
            if(prices[i]>min){maxProfit += prices[i]-min; 
                             min = prices[i];}
          
        }
        return maxProfit;
    }
}