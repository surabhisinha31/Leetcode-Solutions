package leetcodeEasy;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("MCMXCIV"));
	}
    public static int romanToInt(String s) {
    	if(s == null || s.length() == 0) {
    		return 0;
    	}
    	int[] roman = new int[s.length()];
    	int i = 0 ;
    	for(char c : s.toCharArray()) {
    		switch(c) {
    			case 'I':
    				roman[i++] = 1;
    				break;
    			case 'V':
    				roman[i++] = 5;
    				break;
    			case 'X':
    				roman[i++] = 10;
    				break;
    			case 'L':
    				roman[i++] = 50;
    				break;
    			case 'C':
    				roman[i++] = 100;
    				break;
    			case 'D':
    				roman[i++] = 500;
    				break;
    			case 'M':
    				roman[i++] = 1000;
    				break;
    			default:
    				roman[i++] = 0;
    				break;	
    		}
    	}
    	int result = 0;
		for(int j = 0 ; j < roman.length - 1 ; j++) {
			if(roman[j] < roman[j + 1]) {
				result -= roman[j];
			}
			else {
				result += roman[j];
			}
		}
        return result + roman[roman.length - 1];
    }
}
