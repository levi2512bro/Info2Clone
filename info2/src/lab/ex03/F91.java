package lab.ex03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F91 extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel();
	JLabel title = new JLabel("Begründen Sie durch Implementierung, warum die 91-Funktion von McCarthy so benannt wurde:");
	JTextField input = new JTextField(20);
	JButton calc = new JButton("gib ihm");
	JTextField output = new JTextField(20);

	F91() {
		super("F91");
		this.add(panel);
		this.setVisible(true);
		this.setSize(800, 400);
		panel.add(title);
		panel.add(input);
		panel.add(output);
		panel.add(calc);
		output.setEditable(false);
		calc.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String aText = input.getText();
		int aInt = Integer.parseInt(aText);
		String answerText = Integer.toString(Formeln.f91(aInt));
		output.setText(answerText);
	}
	
	public static void main(String[] args) {
		new F91();
	}
}
