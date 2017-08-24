package dice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class dice_2  {
	static int  count = 1;
	static int  yourscore = 0;
	static int  comscore = 0;
	public void start_game()throws IOException{
		System.out.println("ゲームを開始しますか？");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		switch(num) {
		case 1:
			System.out.println("開始します。");
			saikoro_huru();
			break;
		case 2:
			System.out.println("終了します。");
			break;
		}
	}
	public void saikoro_huru() throws IOException{

		while(count <= 5){
			System.out.println(count + "回戦。サイコロを振ってください。");
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int you = Integer.parseInt(str);
			int com;
			you=(int)(Math.random()*6+1);
			com=(int)(Math.random()*6+1);
			System.out.println("あなたの手:" + you);
			System.out.println("相手の手:" + com);
			if(you>com){
				yourscore += 1;
				count += 1;
				System.out.println("あなたが勝ちましたよ。 あなたの点数： " + yourscore);
			}
			else if(you<com){
				comscore += 1;
				count += 1;
				System.out.println("あなたは負けました。相手の点数： " + comscore);
			}
			else{
				System.out.println("あいこだよ！もう一回やって。");
			}
		}
	}
}
class Sample{
	public static void main(String[] args) throws IOException {
		dice_2 start = new dice_2();
			start.start_game();

	}
}
