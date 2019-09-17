package leetcodeHard;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}
    public static int trap(int[] height) {
    	if(height == null || height.length == 0) {
    		return 0;
    	}
    	int left_max = 0;
    	int right_max = 0;
    	int result = 0;
    	int i = 0;
    	int j = height.length - 1;
    	while(i < j) {
    		if(height[i] < height[j]) {
    			if(height[i] >= left_max) {
    				left_max = height[i];
    			}
    			else {
    				result += left_max - height[i];
    			}
    			i++;
    		}
    		else {
    			if(height[j] >= right_max) {
    				right_max = height[j];
    			}
    			else {
    				result += right_max - height[j];
    			}
    			j--;
    		}
    	}
        return result;
    }
}
