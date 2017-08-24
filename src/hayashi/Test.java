package hayashi;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Test extends Application{
		private Label lb;
		private Button bt;

	public static void main(String[] args){

		launch(args);
	}

	public void start(Stage stage) throws Exception {

		lb = new Label();
		bt = new Button();

		lb.setText("いらっしゃいませ");
		bt.setText("購入");

		BorderPane bp = new BorderPane();

		bp.setTop(lb);
		bp.setCenter(bt);

		bt.setOnAction(new SampleEventHandler());

		Scene sc = new Scene(bp, 300, 200);

		stage.setScene(sc);

		stage.setTitle("サンプル");

		stage.show();
	}
	class SampleEventHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e){
			lb.setText("ご購入ありがとうございます。");
		}
	}
}











/*class Resipi{

	int zairyo_kazu;
	String zairyo_name;
	int za_nm_kazu;

	Resipi(){
		Scanner sc = new Scanner(System.in);
		zairyo_kazu = sc.nextInt();
		for(int i=0;i<zairyo_kazu;i++){
			zairyo_name = sc.next();
			za_nm_kazu = sc.nextInt();
		}
	}
}
class Temoti extends Resipi{
	Temoti(){
		super();
	}
}

class Sample{
	public static void main(String[] args){

		Resipi resipi = new Resipi();
		Temoti temoti = new Temoti();
	}
}*/
