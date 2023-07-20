package HundreadQChallenge.Arrays;

import java.util.Arrays;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int ans = maxProfit(arr);
        System.out.println(ans);
    }


    public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<buy){
                buy=prices[i]; //considering min 
            }
            else{
                int currProfit=prices[i]-buy;
                profit=Integer.max(currProfit, profit);
            }
        }
        return profit;
    }


    //APPROCH 1 BRUTE FORCE

    // public static int maxProfit(int[] prices) {
    //     int ans = 0;
    //     int finalans = 0;
    //     for (int i = 0; i < prices.length - 1; i++) {
    //         for (int j = i + 1; j < prices.length; j++) {
    //             if (prices[j] > prices[i]) {
    //                 System.out.println("price i=" + prices[i] + " price j=" + prices[j] + " ans=" + (prices[j] - prices[i]));
    //                 ans = prices[j] - prices[i];
    //             if (ans > finalans) {
    //                 finalans = ans;
                    
    //             }
    //             }
    //         }
    //     }
    //     return finalans;
    // }
}
