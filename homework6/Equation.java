public class Equation{
    public static void main(String[] args){
        StringBuilder equation = new StringBuilder(args[0]);
        for(int i = 0; i < equation.length(); i++){
            if (equation.charAt(i) == ' '){
                equation.deleteCharAt(i);
            }
        }
        StringBuilder strA = new StringBuilder("");
        StringBuilder strB = new StringBuilder("");
        StringBuilder strC = new StringBuilder("");
        double a = 0;
        double b = 0;
        double c = 0;
        int k = 0;                          
        char s = ' ';                       
        for(int i = 0; i < equation.length(); i++){
            k = i;    
            s = equation.charAt(i);
            if (s != 'x'){
                strA.append(s);
            }
            else{
                k += 3;                     
                break;
            }
                
        }
        a = stringToDouble(strA.toString());
        for(int i = k; i < equation.length(); i++){
            k = i;                                
            s = equation.charAt(i);
            if (s != 'x'){
                strB.append(s);
            }
            else{
                k += 1;                     
                break;
            }  
        }
        b = stringToDouble(strB.toString());
        for(int i = k; i < equation.length(); i++){    
            s = equation.charAt(i);
            strC.append(s);
        }
        c = stringToDouble(strC.toString());
        doEquation(a, b, c);                
    }
    public static double stringToDouble(String a){
        String b =new String(a);
        if (b.equals("+") || b.equals("") || b.equals("-")){
            b += "1.0";
        }
        return Double.valueOf(b);
    }
    public static void doEquation(double a, double b, double c){
        double x1, x2, d;
        d = 0;
        x1 = 0;
        x2 = 0;
        if (a != 0){
            d = (b * b - 4 * a * c);
            if (d > 0) {
                x1 = (-b + Math.sqrt(d)) / (2.0*a); 
                x2 = (-b - Math.sqrt(d)) / (2.0*a);
                System.out.println("X[1] = " + x1 + "\nX[2] = " + x2);
            } else if (d == 0) {
                x1 = (-b) / (2.0*a);
                System.out.println("X = " + x1); 
            } else {
                System.out.println("X = NONE"); 
            }
        }
        else
        {
            System.out.println("It isn't quadratic equation!"); 
        }
    }
}