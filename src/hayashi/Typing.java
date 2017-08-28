package hayashi;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Typing extends Frame{
	char[] c = {'A','B','C','D','E','F','G',
			'H','I','J','K','L','M','N','O',
			'P','Q','R','S','T','U','V','W',
			'X','Y','Z'};
	char ch1;
	public static void main(String[] args) {
		new Typing();
	}
	public Typing() {

		super("簡易タイピング練習プログラム");

		addWindowListener(new TypingWindowListener());
		addKeyListener(new TypingKeyListener());

		setSize(700,500);
		setVisible(true);
	}
	public void paint(Graphics g) {
		int pointX = 250;
		int pointY = 275;

		g.clearRect(0, 0, 600, 400);

		int i = (int)(Math.random()*25);
		ch1 = (char)(i + 0x0041);

		g.setColor(Color.blue);
		g.setFont(new Font("Serif",Font.BOLD,200));
		g.drawChars(c, i, 1, pointX, pointY);

	}
	class TypingKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int kc = e.getKeyCode();
			if(ch1 == (char)kc) {
				repaint();
			}
		}
	}
	class TypingWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}