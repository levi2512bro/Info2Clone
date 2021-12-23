package lab.ex08;

public class Ausnahme {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt((args[0]));
			System.out.println("Eingegebene Zahl i= " + i);
		} catch (NumberFormatException e) {
			System.out.println("kein int zugewisen");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Kein Argument beim Aufruf übergeben");
		}
	}

}
