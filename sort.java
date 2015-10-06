import java.util.Arrays;

public class sort {
	public static void main(String[] args) {
		int size = Integer.valueOf(args[0]);
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = (int)Math.round(Math.random() * 100);
		}
		System.out.println("original:"+Arrays.toString(a));
		toSort(a);
		System.out.println("sorted:"+Arrays.toString(a));

	}	
	public static void toSort(int[] a) {
		int temp;
		int step = a.length;
		while (step >= 1) {
			for (int j = 0; j < (a.length - step); j++) {
				if (a[j] > a[j + step]) {
					temp = a[j];
					a[j] = a[j + step];
					a[j + step] = temp;
				}
				
			}
			step = step-1;
		}
	}

}