public class Alphabet {
	public static void main(String[] args) {
		int f = 0;
		int difference = 0;
		int e = 1;
		String s = args[0];
		char a = ' ';
		char b = ' ';
		for (int i = 0; i<s.length() - 1; i++) {
			a = s.charAt(i);
			b = s.charAt(i + 1);
			if ((a >= 'a') && (a <= 'z')) {
				a = (char)(a - 32);
			} 
			if ((b >= 'a') && (b <= 'z')) {
				b = (char)(b - 32);
			} 
			if ((a >= 'A') && (a <= 'Z')) {
				if (a <= b) {
					f = f + 1;
				}
			}
			else
				e = 0;
		}
		if (e == 1) {
			if (f == s.length() - 1) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		else {
			System.out.println("isnvalid string");
		}		
	}
}