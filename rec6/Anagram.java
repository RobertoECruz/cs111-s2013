public class Anagram {
	
	public static void main(String args[]) {
		String s1=IO.readString();
		String s3=IO.readString();
		String s2=s3;

		if (s1.length() != s2.length()) {
			System.out.println(s1+" and "+s2+" are not anagrams");
			return;
		}

		for(int i=0; i<s1.length(); i++) {
			for(int j=0; j<s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					s2=s2.substring(0,j)+s2.substring(j+1,s2.length());
					break;
				}
			}	
		}
		if (s2.length() == 0) {
			System.out.println(s1+" and "+s3+" are anagrams");
		} else {
			System.out.println(s1+" and "+s3+" are not anagrams");
		}
	}

}
