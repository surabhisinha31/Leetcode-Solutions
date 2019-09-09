package leetcodeMedium;

public class DecodeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numDecodings("223"));
	}
    public static int numDecodings(String s) {
    	if(s == null || s.length() == 0) {
    		return 1;
    	}
    	int[] dp = new int[s.length() + 1];
    	dp[0] = 1;
    	dp[1] = s.charAt(0) - '0' == 0 ? 0 : 1;
    	for(int i = 2 ; i <= s.length() ; i++) {
    		int first = Integer.parseInt(s.substring(i-1, i));
    		if(first > 0 && first < 10) {
    			dp[i] = dp[i - 1];
    		}
    		int second = Integer.parseInt(s.substring(i-2, i));
    		if(second > 9 && second <= 26) {
    			dp[i] += dp[i-2];
    		}
    	}
        return dp[dp.length-1];
    }
}
