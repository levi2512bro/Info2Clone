package lab.ex13;

import java.util.Arrays;

public class InsertionSort {

	static int[] elementAnRichtigePosition(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = i;
			while ((j > 0) && (a[j - 1] > a[j])) {
				int tmp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = tmp;
				j--;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int array[] = { 7, 2, 6, 9, 3 };
		System.out.println(Arrays.toString(array));
		InsertionSort.elementAnRichtigePosition(array);
		System.out.println(Arrays.toString(array));
	}

}
