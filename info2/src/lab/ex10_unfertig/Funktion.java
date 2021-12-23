package lab.ex10_unfertig;

public interface Funktion {
	
	/*interface-Klasse = abstrakte Klasse 
	alle Methoden abstrakt 
	besitzt keine Attribute außer solchen, die zur Klasse selbst gehören 
	und konstant sind
	implizit ist jedes Feld eines Interfaces als public, static und final 
	deklariert
	
	Was sind abstrakte Methoden?
	Es ist sinnvoll eine abstrakte gruss() Methode in der Superklasse zu haben.
	Das besagt, dass jede Subklasse das "Konzept" gruss() erbt, 
	aber die jeweilige Implementation unterschiedlich ist.**/
	
	
	public double f(double x);
	
//	public double tan (double x);
	
//	public double f (double x);
	
//	public double sin (double x);

	public double cos (double x);
	

	
	
	

}
