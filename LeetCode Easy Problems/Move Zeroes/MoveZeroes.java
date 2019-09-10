package leetcodeEasy;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for(int i : nums)
			System.out.print(i + " ");
	}
    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int j = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for(int i = j ; i < nums.length ; i++) {
            nums[i] = 0;
        }
    }
}
