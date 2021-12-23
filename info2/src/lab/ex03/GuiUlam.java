package lab.ex03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiUlam extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel();
	JLabel title = new JLabel("Bei der Ulam-Rekursion ist nicht bekannt, ob für alle Eingabezahlen der Algorithmus terminiert,\n"
			+ "also die Basis erreicht wird:");
	JLabel title2 = new JLabel("Finden Sie durch Implementierung die Größte Zahl, die man noch „testen“ kann.");
	JLabel title3 = new JLabel("Implementieren Sie „gerade“-„ungerade“ durch wechselseitige Rekursion.");
	JTextField a = new JTextField(40);
	JButton calc = new JButton("gib ihm");
	JTextField answer = new JTextField(5);

	GuiUlam() {
		super("ggT");
		this.add(panel);
		this.setVisible(true);
		this.setSize(800, 400);
		panel.add(title);
		panel.add(a);
		panel.add(answer);
		panel.add(calc);
		panel.add(title2);
		panel.add(title3);
		answer.setEditable(false);
		calc.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String aText = a.getText();
		int aInt = Integer.parseInt(aText);
		String answerText = Integer.toString(Formeln.ulam(aInt));
		answer.setText(answerText);
	}
	
	public static void main(String[] args) {
		new GuiUlam();
	}
}
