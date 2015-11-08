import java.util.Scanner;

public class Head {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("To put glasses in wallet press \"I\".");
		System.out.println("To put on glasses press \"W\".");
		System.out.println("To sale glasses press \"S\".");
		System.out.println("To throw glasses press \"T\".");
		System.out.println("To increase price of 100 rubles press \"+\".");
		System.out.println("To subtract price of 100 rubles press \"-\".");
		System.out.println("To damage (25hp) glasses press \"H\".");
		System.out.println("To repair (25hp) glasses press \"R\".");
		System.out.println("To exit press \"Q\".");
		Glasses g1 = new Glasses(1500, 3, "steal", false, "black", 100, false, " ", false);
		System.out.println(g1.getGlasses());
		char c = ' ';
		while (c != 'Q') {
			c = sc.next().charAt(0);
			g1.toInteract(c);
		}
		System.out.println(g1.getGlasses());
		System.out.println("To put 200 rubles in wallet press \"P\"!");
		System.out.println("To increase price of 1000 rubles press \"+\".");
		System.out.println("To subtract price of 1000 rubles press \"-\".");
		System.out.println("To exit press \"Q\".");
		Wallet w1 = new Wallet("leather", "green" , 5000, 0, 200, false, " ");
		System.out.println(w1.getWallet());
		if (g1.getSaled()) {
			w1.putMoney(g1.getPrice());
		}
		if (g1.getInventory()) {
			w1.slot(); 
		}
		c = ' ';
		while (c != 'Q') {
			c = sc.next().charAt(0);
			w1.toInteract(c);
		}
		System.out.println(w1.getWallet());
	}
}