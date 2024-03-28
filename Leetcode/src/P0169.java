
public class P0169 {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
	}
	
	public static int majorityElement(int[] nums) {
		int current = 0, count = 0;
		for(int x : nums) {
			if(count == 0) {
				current = x;
				count++;
			}
			else if(current == x) {
				count++;
			}
			else {
				count--;
			}
		}
		return current;
	}
}
