package lab.ex08;

public class TryCatch {

	public static void main(String[] args) {

		try {
			int[] array = new int[3];
			for (int i = 0; i < 4; ++i) {
				array[i] = i;
			}
			System.out.println(array);
		} catch (Exception e) {
			System.out.println("The array is not long enough");
		}
	}
}
