package hayashi;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChoose extends Application{
		private Label lb1,lb2,lb3,lb4;
		private Button bt;

	public static void main(String[] args){

		launch(args);
	}

	public void start(Stage stage) throws Exception {

		lb1 = new Label("ファイルを選択して下さい。");
		lb2 = new Label();
		lb3 = new Label();
		lb4 = new Label();
		bt = new Button("選択");

		BorderPane bp = new BorderPane();
		VBox vb = new VBox();

		vb.getChildren().add(lb1);
		vb.getChildren().add(lb2);
		vb.getChildren().add(lb3);
		vb.getChildren().add(lb4);
		bp.setTop(lb1);
		bp.setCenter(vb);
		bp.setBottom(bt);
		bp.setAlignment(bt, Pos.CENTER);

		bt.setOnAction(new SampleEventHandler());

		Scene sc = new Scene(bp, 300, 200);

		stage.setScene(sc);
		stage.setTitle("サンプル");
		stage.show();
	}
	class SampleEventHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e){
			FileChooser fc = new FileChooser();
			File fl = fc.showOpenDialog(new Stage());
			if(fl != null) {
				lb2.setText("ファイル名は" + fl.getName() + "です。");
				lb3.setText("絶対パスは" + fl.getAbsolutePath() + "です。");
				lb4.setText("サイズは"+ fl.length() + "バイトです。");
			}
		}
	}
}