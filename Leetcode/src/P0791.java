import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class P0791 {
	
	public static void main(String[] args) {
		System.out.println(customSortString("bcafg","abcd"));
	}
	
	public static String customSortString(String order, String s) {
		HashMap<Character, Integer> priority = new HashMap<Character, Integer>();
		for(int i = 0; i < order.length(); i++) {
			priority.put(order.charAt(i), i);
		}
		
		Character[] c = new Character[s.length()];
		for(int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		
		Arrays.sort(c, new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				return priority.getOrDefault(o1,-1) - priority.getOrDefault(o2,-1);
			}
			
		});
		
		String toRet = "";
		for(char x : c)
			toRet += x;
		
		return toRet;
	}
}
