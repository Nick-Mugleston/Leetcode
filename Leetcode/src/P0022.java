import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P0022 {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(4));
	}
	
	public static List<String> generateParenthesis(int n) {
		HashSet<String>[] key = new HashSet[n+1];
		key[1] = new HashSet<String>();
		key[1].add("()");
		
		for(int i = 2; i <= n; i++) {
			key[i] = new HashSet<String>();
			for(String s : key[i-1]) {
				for(int j = 0; j < s.length(); j++) {
					key[i].add(s.substring(0,j)+"()"+s.substring(j));
				}
			}
		}
		
        return new ArrayList<String>(key[n]);
	}

}
