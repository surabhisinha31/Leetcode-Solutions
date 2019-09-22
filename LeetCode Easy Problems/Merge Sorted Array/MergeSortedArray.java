package leetcodeEasy;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5 , 6};
		merge(nums1 , 3 , nums2 , 3);
		for(int i : nums1) {
			System.out.print(i + " ");
		}
	}
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null && nums2 == null) {
        	return;
        }
        m = m - 1;
        n = n - 1;
        int j = nums1.length - 1;
        while(m >= 0 && n >= 0) {
        	if(nums1[m] > nums2[n]) {
        		nums1[j--] = nums1[m--];
        	}
        	else {
        		nums1[j--] = nums2[n--];
        	}
        }
        while(n >= 0) {
        	nums1[j--] = nums2[n--];
        }
        while(m >= 0) {
        	nums1[j--] = nums1[m--];
        }
        return;
    }
}
