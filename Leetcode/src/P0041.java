import java.util.Arrays;

public class P0041 {

	public static void main(String[] args) {
		int[] nums = {3,3,1,4,0};
		System.out.println(firstMissingPositive(nums));
	}
	
	public static int firstMissingPositive(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0)
				nums[i] = 0;
		}
		for(int x : nums) {
			x = Math.abs(x)-1;
			if(x < 0 || x >= nums.length)
				continue;
			if(nums[x] > 0)
				nums[x] *= -1;
			else if(nums[x] == 0)
				nums[x] = -(nums.length+1);
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] >= 0)
				return i+1;
		}
		return nums.length+1;
	}
}
