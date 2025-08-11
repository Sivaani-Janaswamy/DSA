public class StockBuyAndSell{
    public int profit(int[] prices){
        int currentMinimum=prices[0];
        int result = 0;
        //Greedy approach
        for(int i = 1;i<prices.length;i++){
           currentMinimum = Math.min(currentMinimum, prices[i]); 
           result = Math.max(result,prices[i]-currentMinimum);
        }
        return result;
    }
}