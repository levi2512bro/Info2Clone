package lab.ex05;

public class Methoden {

	public static boolean primzahlTestRekursiv(int teiler, int zahl) {
		if (zahl % teiler == 0) {
			return false;
		} else if (teiler > zahl / teiler) {
			return true;
		} else {
			return primzahlTestRekursiv(teiler + 2, zahl);
		}
	}

	public static boolean primzahlTestIterativ(int teiler, int zahl) {
		if (zahl % teiler == 0) {
			return false;
		} else {
			while (teiler > zahl / teiler) {
				teiler = teiler + 2;
				return false;
			}
			return true;
		}
	}
	
	
	
}
