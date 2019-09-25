package leetcodeMedium;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(3999));
	}
    public static String intToRoman(int num) {
        if(num <= 0) {
            return "";
        }
        String[][] roman = {{"", "I", "II", "III","IV","V","VI","VII","VIII","IX"},
                            {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                            {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                            {"","M", "MM", "MMM"} };
        int row = 0;
        String result = "";
        while(num != 0) {
            result = roman[row][num % 10] + result;
            row++;
            num /= 10;
        }
        return result;
    }
}
