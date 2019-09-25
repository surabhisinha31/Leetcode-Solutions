package leetcodeEasy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"dog","racecar","car"};
		System.out.println(longestCommonPrefix(strs));
	}
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
        	return "";
        }
        for(int i = 0 ; i < strs[0].length() ; i++) {
        	for(int j = 1 ; j < strs.length ; j++) {
        		if(i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
        			return strs[j].substring(0 , i);
        		}
        	}
        }
        return strs[0];
    }
}
