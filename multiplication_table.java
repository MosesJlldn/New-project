public class multiplication_table {
    public static void  main (String[] args) {
	    int x=1; int i=1;
	    for (i=1 ;i<11; i++) {
         for (x=1 ;x<11; x++) {
           System.out.print(x+"x"+i+"="+i*x);
            if (x*i>9 && i==10) {
              System.out.print(" ");
            }
             else {
               if (x*i>9) {
                 System.out.print("  ");
                }
                else {
                  System.out.print("   ");
                }
              }
          }
          System.out.println("");
      }
    }
  }    