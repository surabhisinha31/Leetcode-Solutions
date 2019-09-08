package unsolvedpackage;

public class SquareOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-4,-1,0,3,10};
		int[] result = sortedSquares(A);
		for(int i : result)
			System.out.print(i +" ");
	}
    public static int[] sortedSquares(int[] A) {
        if(A == null || A.length == 0)
            return null;
        int[] result = new int[A.length];
        int low = 0;
        int high = A.length - 1;
        int index = A.length - 1;
        while(index >= 0) {
            if(Math.abs(A[low]) >= Math.abs(A[high])) {
                result[index] = A[low] * A[low];
                low++;
            }
            else {
                result[index] = A[high] * A[high];
                high--;
            }
            index--;
        }
        return result;
    }
}
