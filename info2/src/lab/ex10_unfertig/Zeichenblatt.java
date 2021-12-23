package lab.ex10_unfertig;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import hdm.shared.MyBasicFrame;


public class Zeichenblatt extends JPanel implements Funktion {

	
	public static void main(String[] args) {
		Zeichenblatt panel = new Zeichenblatt();
		new MyBasicFrame("Zeichenblatt", 1200, 400, panel);
	}
	

	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		int width = this.getWidth();
		int height = this.getHeight();
		
		g.setColor(Color.RED);
		g.drawLine(0, height / 2, width, height / 2);
		g.drawLine(width / 2, 0, width / 2, height);
		
	
	}

	@Override
	public double f(double x) {
		double y = 2*x;
		return y;
	}

	@Override
	public double cos(double x) {
		return (Math.cos(x/5));
	}




}
