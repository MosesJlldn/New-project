public class Repeat {
	public static void main(String[] args) {
		String s = args[0];
		int f = 0;
		int charNumber[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			for (int j = 0; j < s.length(); j++) {	
				if (a == s.charAt(j)) {
					charNumber[i] = charNumber[i] + 1;
				}
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (charNumber[i] == 1) {
				System.out.println("");
				f = 0;
				break;
			}
			else {
				f = i;
			}
		}
		if (f != 0) {
			System.out.println(s.charAt(f));
		}
		else 
			System.out.println("There's one or more nonrecurring symbol.");
	}
}


