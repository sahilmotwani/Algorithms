package code;

import java.util.TreeMap;

public class BuySellStock {

	public static void main(String[] args) {
		int[] stockPrices = {100, 80, 120, 130, 70, 60, 100, 125};	
		int[] p = {100, 80, 120, 130, 70, 60, 100, 125};
		//System.out.print(maxProfit1Transaction(stockPrices));
		System.out.println(maxProfitMultiple(p));
	}
	
	//for 1 transaction
	public static int maxProfit1Transaction(int[] stockPrices){
		int profit=0;
		int minPrice = Integer.MAX_VALUE;
		for(int i=0;i<stockPrices.length;i++){
			profit=Math.max(stockPrices[i]-minPrice, profit);
			minPrice=Math.min(stockPrices[i], minPrice);
		}
		return profit;
	}
	
	//for multiple transactions
	public static int maxProfitMultiple(int[] stockPrice){
		int profit=0;
		for(int i=0;i<stockPrice.length-1;i++){
			profit+=Math.max(stockPrice[i+1]-stockPrice[i], 0);
		}
		return profit;
	}
	
	
	
}
