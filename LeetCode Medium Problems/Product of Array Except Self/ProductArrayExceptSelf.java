package leetcodeMedium;

public class ProductArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int[] result = productExceptSelf(nums);
		for(int i : result) {
			System.out.print(i +" ");
		}
	}
    public static int[] productExceptSelf(int[] nums) {
    	if(nums == null || nums.length == 0) {
    		return new int[] {};
    	}
    	int[] result = new int[nums.length];
    	int left = 1;
    	for(int i = 0 ; i < nums.length ; i++) {
    		if(i != 0) {
    			left *= nums[i - 1];
    		}
    		result[i] = left;
    	}
    	int right = 1;
    	for(int i = nums.length - 1 ; i >= 0 ; i--) {
    		if(i != nums.length - 1) {
    			right *= nums[i + 1];
    		}
    		result[i] *= right;
    	}
    	return result;
    }
}
