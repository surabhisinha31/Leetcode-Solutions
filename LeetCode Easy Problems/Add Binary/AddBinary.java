package leetcodeEasy;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("11","1"));
	}
    public static String addBinary(String a, String b) {
        int length1 = a.length() - 1;
        int length2 = b.length() - 1;
        int carry = 0;
        String result = "";
        while(length1 >= 0 || length2 >= 0 || carry != 0) {
            int chara = (length1 < 0) ? 0 : Character.getNumericValue(a.charAt(length1));
            int charb = (length2 < 0) ? 0 : Character.getNumericValue(b.charAt(length2));
            result = (chara ^ charb ^ carry) + result;
            carry = (chara + charb + carry) >= 2 ? 1 : 0;
            length1--;
            length2--;
        }
        return result;
    }
}
