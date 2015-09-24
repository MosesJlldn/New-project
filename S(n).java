public class example_3 {
	public static void main (String args[]) {
		double n = Double.parseDouble (args [0]);
		double S=0; 
		int i=1; 
		for (i=1; i<=n; i++) {
			double x=Math.pow((2*i-1),2);
			if (i%2==0) {
				S=S-1/x;
			}
			else {
				S=S+1/x;
			}	
		}
		System.out.println("S="+S);
	}		
}
