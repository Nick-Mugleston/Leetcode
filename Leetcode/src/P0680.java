
public class P0680 {

	public static void main(String[] args) {
		System.out.println(validPalindrome("abc"));
	}
	
	public static boolean validPalindrome(String s) {
		boolean valid = true;
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				if(s.charAt(i) == s.charAt(s.length()-2-i)) {
					for(int j = i; j < s.length()/2; j++) {
						if(s.charAt(j) != s.charAt(s.length()-2-j))
							valid = false;
					}
					if(valid) {
						return true;
					}
				}
				if(s.charAt(i+1) == s.charAt(s.length()-1-i)) {
					for(int j = i; j < s.length()/2; j++) {
						if(s.charAt(j+1) != s.charAt(s.length()-1-j))
							return false;
					}
					return true;
				}
				return false;
			}
		}
		return true;
	}
}
