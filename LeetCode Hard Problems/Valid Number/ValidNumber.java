package leetcodeHard;

public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNumber("2e3"));
	}
    public static boolean isNumber(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }
        s = s.trim();
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        boolean numAfterE = true;
        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9') {
                numSeen = true;
                numAfterE = true;
            }
            else if(c == 'e') {
                if(eSeen || !numSeen) {
                    return false;
                }
                numAfterE  = false;
                eSeen = true;
            }
            else if(c == '.') {
                if(dotSeen || eSeen) {
                    return false;
                }
                dotSeen = true;
            }
            else if(c == '+' || c == '-') {
                if(i != 0 && s.charAt(i - 1) != 'e') {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return numSeen && numAfterE;
    }
}
