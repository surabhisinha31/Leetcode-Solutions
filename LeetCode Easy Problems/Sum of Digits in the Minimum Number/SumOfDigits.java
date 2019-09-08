package leetcodeEasy;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {99,77,33,66,55};
		System.out.println(sumOfDigits(A));
	}
    public static int sumOfDigits(int[] A) {
    	int minimum = A[0];
    	for(int i : A) {
    		minimum = Math.min(minimum, i);
    	}
    	int sum = 0;
    	int rem = 0;
    	while(minimum != 0) {
    		rem = minimum % 10;
    		sum += rem;
    		minimum /= 10;
    	}
    	if(sum % 2 == 0)
    		return 1;
        return 0;
    }
}
