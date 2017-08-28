package hayashi;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Car extends Frame implements Runnable{

	private int num;

	public static void main(String[] args){
		Car c =new Car();
	}

	public Car(){
		super("サンプル");
		setSize(250, 200);
		setVisible(true);

		addWindowListener(new SampleWindowListener());

		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		try {

			for(int i=0;i<10;i++) {
				num = i;
				repaint();
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {}
	}
	public void paint(Graphics g) {
		String str = num + "です。";
		g.drawString(str, 100, 100);
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
}