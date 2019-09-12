package leetcodeEasy;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int[] result = twoSum(nums, 9);
		for(int i : result) {
			System.out.print(i + " ");
		}
	}
    public static int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return new int[]{};
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i] , i);
        }
        return new int[]{};
    }
}
