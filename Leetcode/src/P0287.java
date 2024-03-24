
public class P0287 {

	public static void main(String[] args) {
		System.out.println(findDuplicate(new int[] {1,2,3,1}));
	}
	
	public static int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];
		
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while(slow != fast);
		
		slow = nums[0];
		
		while(slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		
		return slow;
	}

}
