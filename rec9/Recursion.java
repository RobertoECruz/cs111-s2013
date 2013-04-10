public class Recursion{

	public static String reverse(String str){
		if (str.equals("")){
			return "";
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
	
	public static boolean equals(String str1, String str2){
		if (str1.length() != str2.length()){
			return false;
		}
		if (str1.length() == 0){
			return true;
		}
		if (str1.charAt(0) == str2.charAt(0)){
			return equals(str1.substring(1),str2.substring(1));
		}
		return false;
	}

	public static void main(String args[]){
		System.out.println(reverse("hello"));
		System.out.println(reverse("CS 111"));
		System.out.println(reverse("A"));
		System.out.println(equals("a","b"));
		System.out.println(equals("ab","ab"));
		System.out.println(equals("ab","b"));
	}

}
















