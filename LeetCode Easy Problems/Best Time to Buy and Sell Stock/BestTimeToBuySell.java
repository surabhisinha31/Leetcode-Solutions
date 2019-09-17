package leetcodeEasy;

public class BestTimeToBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
        	return 0;
        }
        int minStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i : prices) {
        	minStock = Math.min(minStock, i);
        	maxProfit = Math.max(maxProfit, i - minStock);
        }
        return maxProfit;
    }
}
