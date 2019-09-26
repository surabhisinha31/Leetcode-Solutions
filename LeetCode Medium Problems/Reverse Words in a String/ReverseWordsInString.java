package leetcodeMedium;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("the sky is blue"));
	}
    public static String reverseWords(String s) {
    	if(s == null || s.length() == 0) {
    		return s;
    	}
    	s = s.trim();
    	int i = s.length() - 1;
    	StringBuilder str = new StringBuilder();
    	while(i >= 0) {
    		while(i >= 0 && s.charAt(i) == ' ') {
    			i--;
    		}
    		int j = s.lastIndexOf(' ', i);
    		if(j == - 1) {
    			str.append(s.substring(0, i + 1));
    		}
    		else {
    			str.append(s.substring(j + 1, i  + 1));
    			str.append(" ");
    		}
    		i = j - 1;
    	}
        return str.toString();
    }
}
