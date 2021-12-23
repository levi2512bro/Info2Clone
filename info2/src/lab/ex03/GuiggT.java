package lab.ex03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiggT extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel();
	JLabel title = new JLabel("Der größte gemeinsame Teiler ggT zweier natürlicher Zahlen a und b lässt sich folgendermaßen\n"
			+ "berechnen:");
	JTextField a = new JTextField(20);
	JTextField b = new JTextField(20);
	JButton calc = new JButton("gib ihm");
	JTextField answer = new JTextField(20);

	GuiggT() {
		super("ggT");
		this.add(panel);
		this.setVisible(true);
		this.setSize(800, 400);
		panel.add(title);
		panel.add(a);
		panel.add(b);
		panel.add(answer);
		panel.add(calc);
		answer.setEditable(false);
		
		calc.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String aText = a.getText();
		int aInt = Integer.parseInt(aText);
		String bText = b.getText();
		int bInt = Integer.parseInt(bText);
		
		String calcText = Integer.toString(Formeln.ggT(aInt, bInt));
		calc.setText(calcText);
	}
	
	public static void main(String[] args) {
		new GuiggT();
	}
}
