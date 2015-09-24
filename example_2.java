public class example_2 {
	public static void main (String args[]) {
		double x = Double.parseDouble (args [0]);
		double y = Double.parseDouble (args [1]);
		double a;
		double b;
		double result;
		a=Math.pow(x,6)+Math.pow(y,7)-64;
		b=x*y-y*y*y+3;
		result=a/b-72*x+1/8;
		if (b==0) {
			System.out.println("division by zero is impossible");
		}
		else { 
			System.out.println("result="+result);
		}
	}
}	