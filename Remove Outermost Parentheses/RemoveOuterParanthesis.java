package leetcodeEasy;

public class RemoveOuterParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeOuterParentheses("(()())"));
		System.out.println(removeOuterParenthesesEfficient("(()())"));
	}
	public static String removeOuterParentheses(String S) {
		if(S == null || S.length() == 0) {
			return "";
		}
		int left = 0;
		int right = 0;
		int index = 0;
		int sum = 0;
		StringBuilder str = new StringBuilder();
		for(int i = 0 ; i < S.length(); i++) {
			if(S.charAt(i) == '(')
				left += 1;
			else if(S.charAt(i) == ')')
				right -= 1;
			sum = left + right;
			if(sum == 0) {
				str.append(S.substring(index + 1, i));
				index = i + 1;
			}
		}
        return str.toString();
    }
	
	public static String removeOuterParenthesesEfficient(String S) {
		if(S == null || S.length() == 0) {
			return "";
		}
		StringBuilder str = new StringBuilder();
		int counter = 0;
		for(int i = 0 ; i < S.length(); i++) {
			if(S.charAt(i) == '(') {
				counter++;
				if(counter > 1) {
					str.append('(');
				}
			}
			else if(S.charAt(i) == ')') {
				counter--;
				if(counter > 0) {
					str.append(')');
				}
			}
		}
        return str.toString();
    }
	
}
