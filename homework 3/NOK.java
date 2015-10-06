public class NOK {
	public static void main (String[] args) {
		double number1=Double.parseDouble(args[0]);
		double number2=Double.parseDouble(args[1]);
		double NOK=number1;
		while (NOK%number2!=0) {
		NOK=NOK+number1;
		}
		System.out.println("NOK="+NOK); 	
	}
}