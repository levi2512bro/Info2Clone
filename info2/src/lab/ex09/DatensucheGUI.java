package lab.ex09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DatensucheGUI extends JFrame implements ActionListener{
	
	public static void main(String[] args) {
		new DatensucheGUI ();
	}
	
	
	JPanel oberfläche = new JPanel();
	JLabel name = new JLabel("Name ");
	JTextField nameTF = new JTextField(20);
	JLabel nummer = new JLabel("Nummer ");
	JTextField nummerTF = new JTextField(20);
	JButton sucheKnopf = new JButton("Finden");

	DatensucheGUI () {
		super("Datensuche");
		this.add(oberfläche);
		this.setVisible(true);
		this.setSize(800, 400);
		oberfläche.add(name);
		oberfläche.add(nameTF);
		oberfläche.add(nummer);
		oberfläche.add(nummerTF);
		oberfläche.add(sucheKnopf);
		sucheKnopf.addActionListener(this);
		nummerTF.setEditable(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		String parsed = nameTF.getText();
		
	}

}
