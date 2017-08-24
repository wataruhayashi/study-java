package hayashi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Car extends Frame{

	private Button bt;
	private TextField tf1,tf2;
	private Label lb1,lb2,lb3;

	public static void main(String[] args){
		Car c =new Car();
	}

	public Car(){
		super("足し算");
		setSize(300, 200);
		setVisible(true);
		setLayout(null);
		tf1 = new TextField();
		tf1.setBounds(20, 100, 50, 20);
		add(tf1);
		lb1 = new Label("+");
		lb1.setBounds(80, 100, 10, 20);
		add(lb1);
		tf2 = new TextField();
		tf2.setBounds(100, 100, 50, 20);
		add(tf2);
		lb2 = new Label("=");
		lb2.setBounds(160, 100, 10, 20);
		add(lb2);
		lb3 = new Label("??");
		lb3.setBounds(180, 100, 50, 20);
		add(lb3);
		bt = new Button("計算");
		bt.setBounds(240, 100, 50, 20);
		add(bt);
		addWindowListener(new SampleWindowListener());
		bt.addMouseListener(new SampleMouseListener());
	}

	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
	class SampleMouseListener extends MouseAdapter{
		public boolean chkNum(String str){
			try{
				Double.parseDouble(str);
				return true;
			}catch(Exception e){
				return false;
			}
		}
		public void mouseClicked(MouseEvent e){
			if(chkNum(tf1.getText()) && chkNum(tf2.getText())){
				lb3.setText(String.valueOf(Double.parseDouble(tf1.getText())
						+ Double.parseDouble(tf2.getText())));
			}else{
				lb3.setText("error");
			}
		}
	}

}