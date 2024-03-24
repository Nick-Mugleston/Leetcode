
public class P0035 {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1,3,5,6}, 7));
	}

	public static int searchInsert(int[] nums, int target) {
		int left = 0, right = nums.length, mid = (left+right)/2;
		do {
			if(nums[mid] > target) {
				right = mid-1;
			}
			else if(nums[mid] < target) {
				left = mid+1;
			}
			else {
				return mid;
			}
			mid = (left+right)/2;
		} while(mid < nums.length && left <= right);
		return mid >= nums.length?mid:(nums[mid] > target?mid:mid+1);
	}
}
