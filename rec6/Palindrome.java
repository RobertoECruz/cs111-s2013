public class Palindrome {

	public static void main(String args[]) {
		System.out.println(Rec8.gcf(1,4));
		String input = IO.readString();
		for (int n=0; n<input.length()/2; n++) {
			if (input.charAt(n) != input.charAt((input.length()-1)-n)) {
				System.out.println(input+" is not a palindrome");
				return;
			}
		}
		System.out.println(input+" is a palindrome");
	}
}

