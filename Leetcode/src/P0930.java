
public class P0930 {

	public static void main(String[] args) {
		System.out.println(numSubarraysWithSum(new int[] {0,0,1,0,0}, 1));
	}
	
	public static int numSubarraysWithSum(int[] nums, int goal) {
		int total = 0, leftPos = 0, rightPos = 0, leftRun = 0, rightRun = 0, sum = 0;
		if(goal == 0) {
			int zeroRun = 0;
			while(rightPos < nums.length) {
				while(rightPos < nums.length && nums[rightPos++] == 0) {
					zeroRun++;
				}
				total += zeroRun*(zeroRun+1)/2;
				zeroRun = 0;
			}
		}
		else {
			while(rightPos < nums.length) {
				if(sum + nums[rightPos] < goal) {
					sum += nums[rightPos++];
				}
				else if(sum + nums[rightPos] == goal) {
					sum += nums[rightPos];
					if(nums[rightPos++] == 0) {
						rightRun++;
					}
					else {
						rightRun = 0;
					}
				}
				else {
					sum--;
					leftRun = 0;
					while(leftPos < rightPos) {
						if(nums[leftPos++] == 0) {
							leftRun++;
						}
						else {
							break;
						}
					}
					total += (leftRun+1)*(rightRun+1);
				}
			}
			if(sum == goal) {
				leftRun = 0;
				while(leftPos < rightPos) {
					if(nums[leftPos++] == 0) {
						leftRun++;
					}
					else {
						break;
					}
				}
				total += (leftRun+1)*(rightRun+1);
			}
		}
		return total;
	}

}
