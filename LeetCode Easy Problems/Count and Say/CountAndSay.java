package leetcodeEasy;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(4));
	}
    public static String countAndSay(int n) {
    	String result = "1";
        if(n == 1) {
        	return result;
        }
        for(int i = 1 ; i < n ; i++) {
        	result = nextSequence(result);
        }
        return result;
    }
    public static String nextSequence(String result) {
    	char initial = result.charAt(0);
    	int count = 1;
    	StringBuilder str = new StringBuilder();
    	for(int i = 1 ; i  < result.length() ; i++) {
    		if(result.charAt(i) == initial) {
    			count++;
    		}
    		else {
    			str.append(count).append(initial);
    			count = 1;
    			initial = result.charAt(i);		
    		}
     	}
    	str.append(count).append(initial);
    	return str.toString();
    }
}
