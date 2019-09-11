package leetcodeMedium;
import java.util.*;
public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(nums));
	}
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 2 ; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    result.add(Arrays.asList(nums[i], nums[j++] , nums[k--]));
                    while(i < j && j < k && nums[j] == nums[j - 1])
                        j++;
                    while(j < k && k < nums.length - 1 && nums[k] == nums[k + 1])
                        k--;
                }
                else if(nums[i] + nums[j] + nums[k] < 0)
                    j++;
                else
                    k--;
            }
        }
        return result;
    }
}
