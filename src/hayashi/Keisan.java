package hayashi;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Keisan extends Frame {
	int tanka;
	int suryo;
	Label lb1, lb2, lb3, lb4, lb5, lbx;
	TextField txt1, txt2, txt3, txt4, txt5;
	Button bt;
	public static void main(String[] args) {
		Keisan u = new Keisan();
	}

	public Keisan() {

		super("売上");


		lb1 = new Label("単価");
		lb1.setBackground(Color.GREEN);
		lb1.setFont(new Font("Serif",Font.BOLD,20));
		add(lb1);
		txt1 = new TextField();
		add(txt1);
		lb2 = new Label("数量");
		lb2.setBackground(Color.GREEN);
		lb2.setFont(new Font("Serif",Font.BOLD,20));
		add(lb2);
		txt2 = new TextField();
		add(txt2);

		bt = new Button("計算");
		bt.setFont(new Font("Serif",Font.BOLD,20));
		add(bt);

		lbx = new Label();
		add(lbx);

		lb3 = new Label("小計");
		lb3.setBackground(Color.CYAN);
		lb3.setFont(new Font("Serif",Font.BOLD,20));
		add(lb3);
		txt3 = new TextField();
		add(txt3);
		lb4 = new Label("税");
		lb4.setBackground(Color.CYAN);
		lb4.setFont(new Font("Serif",Font.BOLD,20));
		add(lb4);
		txt4 = new TextField();
		add(txt4);
		lb5 = new Label("合計");
		lb5.setBackground(Color.CYAN);
		lb5.setFont(new Font("Serif",Font.BOLD,20));
		add(lb5);
		txt5 = new TextField();
		add(txt5);

		addWindowListener(new UriWindowListener());
		bt.addActionListener(new UriActionListener());

		setSize(300, 100);
		setLayout(new GridLayout(2, 6));
		setVisible(true);
	}

	class UriActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			/*if(txt1.getText() !=null && txt2.getText() !=null) {
				txt3.setText("エ");
				txt3.setFont(new Font("Serif",Font.BOLD,20));
				txt4.setText("ラ");
				txt4.setFont(new Font("Serif",Font.BOLD,20));
				txt5.setText("ー！");
				txt5.setFont(new Font("Serif",Font.BOLD,20));
			}else {*/
			tanka = Integer.parseInt(txt1.getText());
			suryo = Integer.parseInt(txt2.getText());

			txt3.setText(String.valueOf(shokei()));
			txt4.setText(String.valueOf(zei()));
			txt5.setText(String.valueOf(gokei()));
			//}
		}

		public int shokei() {
			return tanka*suryo;
		}

		public int zei() {
			return (int)Math.round(shokei()*0.08);
		}

		public int gokei() {
			return shokei()+zei();
		}
	}

	class UriWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}