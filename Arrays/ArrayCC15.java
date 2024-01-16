//best time to buy and sell stock
public class ArrayCC15 {
    public static int buyAndSellStocks(int price[]){
        int buyprice=Integer.MAX_VALUE;
        //int sellprice=Integer.MIN_VALUE;

        int maxprofit=0;

        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit=price[i]-buyprice;//todays profit
                maxprofit=Math.max(profit,maxprofit);

                
            }
            else{
                buyprice=price[i];

            }
          

        }
        return maxprofit;   
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int profit=buyAndSellStocks(prices);
        System.out.println("the max profit is :"+profit);
    }
    
}
