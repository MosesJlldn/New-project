public class Palindrome {
	public static void main(String[] args) {
		int k = 0;
		String s = args[0];
		StringBuilder stringPart1 = new StringBuilder("");
		StringBuilder stringPart2 = new StringBuilder("");
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) > '9') || (s.charAt(i) < '0')) {
				System.out.println("Write a string of number, please!");
				break;
			} 
			else {
				if (s.length() % 2 == 0) {
					for (i = 0; i < (s.length() / 2) ; i++) {
						stringPart1.append(s.charAt(i));
						k = i + 1;
					}
					for (i = k; i < s.length(); i++) {
						stringPart2.append(s.charAt(i));
					}
					stringPart2 = new StringBuilder(stringPart2).reverse();
					if (stringPart1.toString().equals(stringPart2.toString())) {
						System.out.println("It's a palindrome");
					}
					else {
						System.out.println("It's not a palindrome");
					}	
				}
				else {
					for (i = 0; i < (s.length() / 2) ; i++) {
						stringPart1.append(s.charAt(i));
						k = i + 2;
					}
					for (i = k; i < s.length(); i++) {
						stringPart2.append(s.charAt(i));
					}
					stringPart2 = new StringBuilder(stringPart2).reverse();
					if (stringPart1.toString().equals(stringPart2.toString())) {
						System.out.println("It's a palindrome");
					}
					else {
						System.out.println("It's not a palindrome");
					}	
				}
			}
		}	
	}
}