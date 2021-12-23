package lab.ex01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.text.DecimalFormat;

public class Rechner extends JFrame implements ActionListener {
	JPanel oberfläche = new JPanel();
	JLabel titel = new JLabel("Entwicklung einer Kapitalanlage");
	JLabel kapitaleinlage = new JLabel("Kapitaleinlage: ");
	JTextField kapitaleinlageTf = new JTextField("10000");
	JLabel zinssatz = new JLabel("Zinssatz: ");
	JTextField zinssatzTf = new JTextField("10");
	JLabel laufzeit = new JLabel("Laufzeit (Jahre): ");
	JTextField laufzeitTf = new JTextField("10");
	JLabel endsumme = new JLabel("Endkapital: ");
	JTextField endsummeTf = new JTextField(10);
	JButton berechnenKnopf = new JButton("Berechnen!");

	/**
	 * Konstruktor in dem alles eingefügt wird
	 */
	Rechner() {
		super("Rechner");
		this.add(oberfläche);
		this.setVisible(true);
		this.setSize(800, 400);
		oberfläche.add(titel);
		oberfläche.add(kapitaleinlage);
		oberfläche.add(kapitaleinlageTf);
		oberfläche.add(zinssatz);
		oberfläche.add(zinssatzTf);
		oberfläche.add(laufzeit);
		oberfläche.add(laufzeitTf);
		oberfläche.add(endsumme);
		oberfläche.add(endsummeTf);
		oberfläche.add(berechnenKnopf);
		berechnenKnopf.addActionListener(this);
		endsummeTf.setEditable(false);
	}

	/**
	 * hier werden die Buchstabenketten aus den Textfeldern herausgenommen und in
	 * Nummern verwandelt. Das Konzept heißt Parsing Integer.parseInt verwandelt
	 * eine Zeichenkette in Nummern
	 */
	public void actionPerformed(ActionEvent e) {
		String stammkapitalText = kapitaleinlageTf.getText();
		double stammkapitalInt = Integer.parseInt(stammkapitalText);
		String zinssatzText = zinssatzTf.getText();
		double zinssatzInt = Integer.parseInt(zinssatzText);
		String laufzeitText = laufzeitTf.getText();
		double laufzeitInt = Integer.parseInt(laufzeitText);

		/**
		 * Formel zur Berechung der Endsumme
		 */
		double endsumme = stammkapitalInt * Math.pow(1 + (zinssatzInt / 100), laufzeitInt);

		/**
		 * Formatierung der Nummer mit korrenkten Dezimalstellen etc.
		 */
		DecimalFormat f = new DecimalFormat();
		f.setMaximumFractionDigits(2);
		String s = f.format(endsumme);
		endsummeTf.setText(s);

		/**
		 * hier werden nur noch die nummern ausgegeben
		 */

	}

	public static void main(String[] args) {
		new Rechner();

	}

}
