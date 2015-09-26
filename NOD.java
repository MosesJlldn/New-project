public class NOD {
    public static void main (String args[]) {
    	double number1=Double.parseDouble(args[0]);
    	double number2=Double.parseDouble(args[1]);
    	double a=Math.max(number1,number2);
    	double b=Math.min(number1,number2);
        while (b !=0) {
            double tmp = a%b;
            a = b;
            b = tmp;
        }
        System.out.println("NOD="+a);
    }
}