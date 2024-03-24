import java.util.Arrays;

public class P0238 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[] {-1,1,0,-3,3,0})));
	}
	
	public static int[] productExceptSelf(int[] nums) {
		int product = 1;
		boolean zero = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0 && !zero) {
				zero = true;
			}
			else {
				product *= nums[i];
			}
		}
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i]==0?product:(zero?0:product/nums[i]);
		}
		return nums;
	}
}
