package hayashi;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Maru_app extends Applet{
	int x = 10;
	int y = 10;

	public void init() {
		addMouseListener(new MyMouseAdapter());
	}
	public void paint(Graphics g) {
		g.fillOval(x, y, 10, 10);
	}
	public class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
	}
}