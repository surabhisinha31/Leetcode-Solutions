package leetcodeEasy;

import java.util.HashSet;
import java.util.Set;

public class MorseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
	}
	
	public static int uniqueMorseRepresentations(String[] words) {
		String[] morse = {".-","-...","-.-.","-..",".","..-.",
				  "--.","....","..",".---","-.-",".-..",
				  "--","-.","---",".--.","--.-",".-.","...",
				  "-","..-","...-",".--","-..-","-.--","--.."};
		Set<String> set = new HashSet<>();
		for(String word : words) {
			String result = "";
			for(char c : word.toCharArray()) {
				result += morse[c - 'a'];
			}
			set.add(result);
		}
		return set.size();
    }
}


