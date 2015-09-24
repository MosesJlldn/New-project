public class A {
	public static void main (String args[]) {
		double n = Double.parseDouble (args [0]);
		double A=0; 
		double y=0;
		int i=1; int x=3;
		for (i=1; i<=n; i++) {
			A=Math.cos(x+A);
		}
		System.out.println("A="+A);
	}
}	
	