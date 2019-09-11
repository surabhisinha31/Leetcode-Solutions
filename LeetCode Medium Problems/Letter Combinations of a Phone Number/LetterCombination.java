package leetcodeMedium;
import java.util.*;
public class LetterCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinations("23"));
	}
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0)
            return result;
        Queue<String> queue = new LinkedList<>();
        String[] mapping = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        queue.offer("");
        for(int i = 0 ; i < digits.length() ; i++) {
            int length = queue.size();
            for(int j = 0 ; j < length ; j++) {
                String temp = queue.poll();
                for(char c : mapping[Character.getNumericValue(digits.charAt(i))].toCharArray()) {
                    queue.offer(temp + c);
                }
            }
        }
        return new ArrayList<>(queue);
    }
}
