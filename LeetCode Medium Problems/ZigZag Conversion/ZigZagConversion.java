package leetcodeMedium;

public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING", 3));
	}
    public static String convert(String s, int numRows) {
    	if(s == null || s.length() == 0 || numRows == 1) {
    		return s;
    	}
    	StringBuilder[] str = new StringBuilder[numRows];
    	for(int i = 0 ; i < numRows ; i++) {
    		str[i] = new StringBuilder();
    	}
    	int index = 0;
    	int inc = 0;
    	int i = 0;
    	while(i < s.length()) {
    		str[index].append(s.charAt(i));
    		if(index == 0) {
    			inc = 1;
    		}
    		else if(index == numRows - 1) {
    			inc = -1;
    		}
    		index += inc;
    		i++;
    	}
    	String result = "";
    	for(int j = 0 ; j < str.length ; j++) {
    		result += str[j];
    	}
        return result;
    }
}
