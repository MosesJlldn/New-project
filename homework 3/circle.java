public class circle {
	public static void main (String[] args) {
		Double x=Double.parseDouble(args[0]);
		Double y=Double.parseDouble(args[1]);
		Double a=Double.parseDouble(args[2]);
		Double b=Double.parseDouble(args[3]);
		Double x1=Double.parseDouble(args[4]);
		Double y1=Double.parseDouble(args[5]);
		Double R=Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
		if ((Math.pow(x1-a,2)+Math.pow(y1-b,2))==Math.pow(R,2)) {
			System.out.println("on"); 
		}
		if ((Math.pow(x1-a,2)+Math.pow(y1-b,2))>Math.pow(R,2)) {
			System.out.println("outside");
		}
		if ((Math.pow(x1-a,2)+Math.pow(y1-b,2))<Math.pow(R,2)) {
			System.out.println("inside");
		}
	}
}


