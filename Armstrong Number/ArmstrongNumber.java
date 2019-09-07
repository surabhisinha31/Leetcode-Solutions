package leetcodeEasy;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isArmstrong(123));
	}
	public static boolean isArmstrong(int N) {
		int number = N;
		int count = 0;
		while(number != 0) {
			count++;						//to track number of digits in given number
			number = number/10;
		}
		int rem = 0 ;
		int sum = 0 ;
		number = N;
		while(number != 0 ) {
			rem = number % 10;
			sum += Math.pow(rem, count);	//calculate the value as per the armstrong value rule
			number /= 10;
		}
		if(sum == N)
			return true;					//return true if calculated value is same as given number
        return false;
    }
}
