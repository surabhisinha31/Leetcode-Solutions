package leetcodeMedium;

import java.util.HashMap;

public class SubarraySumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 1, 1};
		System.out.println(subarraySum(nums , 2));
	}
    public static int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
        	return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for(int i : nums) {
        	sum += i;
        	if(map.containsKey(sum - k)) {
        		count += map.get(sum - k);
        	}
        	map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
