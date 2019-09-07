package leetcodeEasy;

public class FixedPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-10,-5,3,4,7,9};
		System.out.println(fixedPoint(A));
	}
    public static int fixedPoint(int[] A) {
    	if(A == null || A.length == 0)
    		return -1;
    	for(int i = 0 ; i < A.length ; i++) {
    		if(A[i] == i) {
    			return i;
    		}
    	}
        return -1;
    }
}
