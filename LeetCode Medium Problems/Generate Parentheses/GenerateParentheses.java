package leetcodeMedium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(3));
	}
    public static List<String> generateParenthesis(int n) {
    	List<String> result = new ArrayList<>();
    	if(n < 1) {
    		return result;
    	}
    	helper(result , 0 , 0 , n , "");
    	return result;
    }
    public static void helper(List<String> result , int left , int right , int n , String path) {
    	if(left == n && right == n) {
    		result.add(path);
    		return;
    	}
    	if(left < n) {
    		helper(result , left + 1 , right , n , path + "(");
    	}
    	if(right < left) {
    		helper(result, left , right + 1 , n , path + ")");
    	}
    }
}
