import java.util.LinkedList;
import java.util.List;

public class P0442 {

	public static void main(String[] args) {
		System.out.println(findDuplicates(new int[] {4,3,2,7,8,2,3,1}));
	}

	public static List<Integer> findDuplicates(int[] nums) {
		LinkedList<Integer> dupes = new LinkedList<Integer>();
		for(int i = 0; i < nums.length; i++) {
			int x = Math.abs(nums[i]);
			if(nums[x-1] < 0) {
				dupes.add(x);
			}
			nums[x-1] *= -1;
		}
		
		return dupes;
	}
}
