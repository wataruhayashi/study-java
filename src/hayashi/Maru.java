package hayashi;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class Maru extends Frame{
	int x = 10;
	int y = 10;
	public static void main(String[] args) {
		Maru maru = new Maru();
	}
	public Maru() {
		super("サンプル");

		addWindowListener(new SampleWindowListener());
		addMouseListener(new SampleMouseAdapter());

		setSize(250, 200);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 10, 10);
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(MouseEvent e) {
			System.exit(0);
		}
	}
	class SampleMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
	}
}