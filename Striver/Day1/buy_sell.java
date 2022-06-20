package Striver.Day1;

public class buy_sell {
    public int maxProfit(int prices[]) {
        
        //***************** METHOD 1 *************
        // int diff = 0;
        // for(int i = 0 ; i<prices.length-1 ; i++){
        //     for(int j = i+1 ; j<prices.length ; j++){
        //         int d = prices[j]-prices[i];
        //         diff = Math.max(diff,d);
        //     }
        // }
        // return diff;
        
        //***************** METHOD 2 *************
        int max = Integer.MIN_VALUE;
        int a = 0;
        int min = Integer.MAX_VALUE;
        int b = 0;
        int sum = 0 ;
        for(int i = 0 ; i < prices.length ; i++){
            if(min>prices[i] && i!=prices.length-1){
                min = prices[i];
                max = prices[i];
                a=i;
                b=i;
            }
            else if(max<prices[i] && i>b ){
                max = prices[i];
                b = i;
                if(sum<(max-min)){
                    sum = max-min;
                }
            }
        }
        return sum;
    }
}
