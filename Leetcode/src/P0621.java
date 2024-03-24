import java.util.Arrays;
import java.util.LinkedList;

public class P0621 {

	public static void main(String[] args) {
		//System.out.println(leastInterval(new char[] {'A','A','A','A','B','B','C','D','E'}, 2)); //10
		//System.out.println(leastInterval(new char[] {'A','A','A','B','B','B'}, 2)); //8
		//System.out.println(leastInterval(new char[] {'A','C','A','B','D','B'}, 1)); //6
		//System.out.println(leastInterval(new char[] {'A','A','A','B','B','B'}, 3)); //10
		System.out.println(leastInterval(new char[] {'A','A','A','B','B','C','C','D','D'},2));
	}

	public static int leastInterval(char[] tasks, int n) {
		/*int[] f = new int[26];
		for(char c : tasks) {
			f[c-65]++;
		}
		System.out.println(Arrays.toString(f));
		Arrays.sort(f);
		System.out.println(Arrays.toString(f));
		LinkedList<int[]> spaces = new LinkedList<int[]>();
		int index = f.length-1;
		int total = 0;
		
		while(f[index] > 0) {
			if(spaces.isEmpty()) {
				spaces.add(new int[] {f[index],n});
				total += f[index]*(n+1);
				f[index--] = 0;
				continue;
			}
			int[] first = spaces.getFirst();
			if(f[index] < first[0]) {
				spaces.add(1,new int[] {first[0]-f[index],first[1]});
				first[0] = f[index];
				first[1]--;
				f[index--] = 0;
				if(first[1] == 0) {
					spaces.removeFirst();
				}
			}
			//while(f[index] >= first[0]) {
			else {
				//eat the spaces; remove first, index -= first[0]
				// or remove first, leave index, subtract excess, continue
				//roll to next space
				//f[index] -= first[0];
				//first[1]--;
				f[index] -= first[0];
				if(f[index] == 0) {
					index--;
				}
				first[1]--;
				if(first[1] == 0) {
					spaces.removeFirst();
				}
				//total -= spaces.getLast()[1];
			}
			//if(f[index] < )
			print(spaces);
			System.out.println("-----");
		}
		if(!spaces.isEmpty()) {
			total -= spaces.getLast()[1];
		}
		return total;*/
		
		return -1;
	}
	
	public static void print(LinkedList<int[]> spaces) {
		for(int[] n : spaces) {
			System.out.println(Arrays.toString(n));
		}
	}
}
