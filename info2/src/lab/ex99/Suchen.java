package lab.ex99;

import java.util.Arrays;

public class Suchen {

	static void sort(int[] a) {
		if (a != null) {
			for (int i = 0; i < a.length-1; i++) {
				int hilfe = Suchen.isMinimum(a);
				a[i] = hilfe;
				i++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	static int isMinimum(int array[]) {
		int i;
		int min = array[0];
		for (i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

//	public static int lineareSuche (int a [], int b) {
//		return b;
//	}
//	
//	public static int binaereSuche (int a [], int b) {
//		int start = 1;
//		int end = 100;
//		
//		while (start < end) {
//			int mitte = (start+end)/2;
//			if (b>mitte) {
//				start = mitte+1;
//			} else {
//				end = mitte;
//			}
//		}
//		return end;
//	}
//		

	public static void main(String[] args) {

		int[] a = new int[] { 2, 5, 3, 1 };
		System.out.println(Arrays.toString(a));

		System.out.println("here we go");
		int b = 0;
		b = a[0];
		a[0] = a[3];
		a[3] = b;
		System.out.println(Arrays.toString(a));

		System.out.print("print minimum now ");
		System.out.println(Suchen.isMinimum(a));

		Suchen.sort(a);	

	}
}
