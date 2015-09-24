public class example_1 {
	public static void main (String args[]) {
		double x = Double.parseDouble (args [0]);
		double y = Double.parseDouble (args [1]);
		double a;
		double b;
		double result;
		a=Math.pow(x,6)+Math.pow(y,7)-37;
		b=4/3+5*x/2-74;
		result=a/b+y*y/2-x*y;
		if (b==0) {
			System.out.println("division by zero is impossible");
		}
		else { 
			System.out.println("result="+result);
		}
	}
}	