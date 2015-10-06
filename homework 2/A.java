public class A {
	public static void main (String args[]) {
		double n = Double.parseDouble (args [0]);
                double x = Double.parseDouble (args [1]);
		double A=0; 
		int i=1;
		for (i=1; i<=n; i++) {
			A=Math.cos(x+A);
		}
		System.out.println("A="+A);
	}
}	
	
