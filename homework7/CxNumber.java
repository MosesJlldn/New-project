import java.util.Scanner;

class CxNumber {
	private double a;
	private double b;
	public CxNumber(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public String getAddition(CxNumber number) {
		return ((this.a + number.getA()) + "+" + "(" + (this.b + number.getB()) + ")i"); 
	}
	public String getSubtract(CxNumber number) {
		return ((this.a - number.getA()) + "+" + "(" + (this.b - number.getB()) + ")i");
	}
	public String getMultiply(CxNumber number) {
		return ((this.a * number.getA() + this.b * number.getB() * (-1)) + "+" + "(" + (this.a * number.getB() + this.b * number.getA()) + ")i");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type number1 without spaces, please!" + "('i' type as '1i')");
		StringBuilder s1 = new StringBuilder(sc.nextLine());
		StringBuilder aa1 = new StringBuilder("");
		StringBuilder bb1 = new StringBuilder("");
		reading(s1, aa1, bb1);
		double a1 = Double.valueOf(aa1.toString());
		double b1 = Double.valueOf(bb1.toString());
		System.out.println("Type number2 without spaces, please!" + "('i' type as '1i')");
		StringBuilder s2 = new StringBuilder(sc.nextLine());
		StringBuilder aa2 = new StringBuilder("");
		StringBuilder bb2 = new StringBuilder("");
		reading(s2, aa2, bb2);
		double a2 = Double.valueOf(aa2.toString());
		double b2 = Double.valueOf(bb2.toString());
		CxNumber number1 = new CxNumber(a1, b1);
		CxNumber number2 = new CxNumber(a2, b2);
		System.out.println("Number's Addition:" + number1.getAddition(number2));
		System.out.println("Number's Subtract:" + number1.getSubtract(number2));
		System.out.println("Number's Multiply:" + number1.getMultiply(number2));
	}
	public static void reading(StringBuilder s, StringBuilder a, StringBuilder b) {
		int size = s.length();
		int k = 0;
		for (int i = 0; i < size; i++) {
			k = i;
			if ((s.charAt(i) != '+') && (s.charAt(i) != '-') || (i == 0)) {
				a.append(s.charAt(i));
			}
			else break;
        }
        for (int i = k; i < size; i++) {
        	if (s.charAt(i) != 'i') {
				b.append(s.charAt(i));
			}
        }
	}
}