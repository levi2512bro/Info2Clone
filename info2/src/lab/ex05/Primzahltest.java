package lab.ex05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Primzahltest extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel();
	JLabel title = new JLabel("Primzahltest Rekursiv und Iterativ");
	JTextField primzahl = new JTextField(5);
	JButton calc = new JButton("gib ihm");
	JTextField answer = new JTextField(30);
	
	Primzahltest() {
		super ("Primzahltest");
		this.add(panel);
		this.setVisible(true);
		this.setSize(800, 400);
		panel.add(title);
		panel.add(primzahl);
		panel.add(answer);
		panel.add(calc);
		answer.setEditable(false);
		calc.addActionListener(this);
	}
	
	public static void main(String[] args) {	
		new Primzahltest();
	}

	
	public void actionPerformed(ActionEvent e) {
		int eingabe = Integer.parseInt(primzahl.getText());
		if ((eingabe == 1 || 
			 eingabe == 2 || 
			 eingabe == 3 || 
			(eingabe % 2 != 0) && 
				Methoden.primzahlTestIterativ(3, eingabe))) {
			answer.setText("PRIMZAAAHHL");
		} else {
			answer.setText("zahl ist keine Primzahl :(");
		}
	}
}