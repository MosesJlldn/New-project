public class line {
	public static void main (String[] args) {
		Double x=Double.parseDouble(args[0]);
		Double y=Double.parseDouble(args[1]);
		Double a=Double.parseDouble(args[2]);
		Double b=Double.parseDouble(args[3]);
		if (y>a*x+b) {
			System.out.println("the point is higher than  the line");
		}
		if (y<a*x+b) {
			System.out.println("the point is lower then the line");
		}
		if (y==a*x+b) {
			System.out.println("the point is on the line");
		}
	}
}