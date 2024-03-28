
public class P0713 {

	public static void main(String[] args) {
		System.out.println(numSubArrayProductLessThanK(new int[] {1,2,3}, 0));
	}
	
	public static int numSubArrayProductLessThanK(int[] nums, int k) {
		if(k <= 1)
            return 0;
        int count = 0;
		int product = 1;
		int left = 0;
		int right = 0;
		while(right < nums.length) {
			product *= nums[right];
			while(product >= k) {
				product /= nums[left++];
			}
			count += 1 + (right - left);
			right++;
		}
		return count;
	}
}
