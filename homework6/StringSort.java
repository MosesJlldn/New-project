import java.util.Arrays;

public class StringSort {
	public static void main(String[] args) {
		String[] a = new String[args.length]; 
		for (int i = 0; i < args.length; i++) {
			a[i] = args[i];
		}
		toSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void toSort(String[] a) {
		String temp;
		double factor = 1.247330950103979;
		int step = (int)Math.round(a.length / factor);
		boolean flag = true;
		while ((step > 1) || (flag)) {
			if (step > 1)
			step = (int)(step / factor);
			flag = false;
			for (int j = 0; j < (a.length - step); j++) {
				if (a[j].length() > a[j + step].length()) {
					temp = a[j];
					a[j] = a[j + step];
					a[j + step] = temp;
					flag = true;
				}	
			}
		}
	}
}