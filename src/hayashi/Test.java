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