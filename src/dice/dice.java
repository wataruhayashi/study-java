
package dice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class dice {

	public static void main(String[] args)throws IOException {

		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));

		int youScore=0;
		int comScore=0;
		int drawScore=0;
		int count=0;
		int j=1;

		System.out.println("ゲームを開始しますか？(5以下＝開始：5以上＝終了)");

		String ready=br.readLine();
		int your =Integer.parseInt(ready);

		if(your>5){
		}else
		do{
			while(count<5){
				System.out.println((count+1)+"回戦目(サイコロを振ってください。(1を入力))");
				count++;
				String str=br.readLine();
				int  you =Integer.parseInt(str);
				if( you!=1){
				System.out.println("1を入力して下さい。");
					 count=0;
					 continue;
				}else
				you=(int)(Math.random()*6+1);
				int com;
				com=(int)(Math.random()*6+1);
				System.out.println("you:"+you+"\n"+"com:"+com);
				if(you>com){
					System.out.println("youの勝ち");
					youScore++;
				}else if(you<com){
					System.out.println("comの勝ち");
					comScore++;
				}else{
					System.out.println("引き分け");
				  	drawScore++;
				}
			}
			System.out.println("---------------------------------------------------------------------------------------------------");
			if(youScore>comScore){
				System.out.println("YOU WINNER :"+youScore+"勝");
			}else if(youScore<comScore){
				System.out.println("COM WINNER :"+comScore+"勝");
			}else{
				System.out.println("DRAW"+"\t"+"引き分け");
			}

			System.out.println("もう一度チャレンジしますか？(0=終了：0以外の整数＝継続)");
			count=0;
			youScore=0;
			comScore=0;
			String retry=br.readLine();
			j=Integer.parseInt(retry);
		}while(j!=0);
		System.out.println("終了");
	}
}

