public class quadratic_equation {
    public static void  main (String[] args) {
    	double a = Double.parseDouble (args [0]);
    	double b = Double.parseDouble (args [1]);
    	double c = Double.parseDouble (args [2]);
    	double x1; 
    	double x2;
    	double D;
    	D=b*b-4*a*c;
    	x1=((-b)-Math.sqrt(D))/(2*a);
    	x2=((-b)+Math.sqrt(D))/(2*a);
    	if (D<0) {
    		System.out.println("there's no solution");
    	}
    	else {
    	    if (D>0) {
      		System.out.println("x1="+x1);
      		System.out.println("x2="+x2);
    	    }
    	    else {
    	       System.out.println("x="+x1);
    	    }
      	}
    }
}
    
