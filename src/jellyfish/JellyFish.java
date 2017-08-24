package jellyfish;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JellyFish {
	
		static final int COUNT=5;//クラス変数の宣言
		static int yourScore;     //クラス変数の宣言
		static int comScore;      //クラス変数の宣言
		static int drawCount;     //クラス変数の宣言
		
	public static void main(String[] args) {//メソッドの宣言
		InitJellyfish();
		PlayJellyfish();
		EndJellyfish();
	}
	public static void InitJellyfish(){//メソッドの宣言
		yourScore=0;
		comScore=0;
		drawCount=0;
	}
	public static void PlayJellyfish(){//メソッドの宣言
	String[] janken ={"グー","チョキ","パー"};
	int i=0;
	boolean playMode=false;
	while(i<COUNT){
		System.out.println(i+1+"回戦目（グー：0 チョキ：1 パー：2 を入力）");
		InputStreamReader in= new InputStreamReader(System. in);
		BufferedReader br =new BufferedReader(in);
		try{
			String str =br.readLine();
			int you =Integer.parseInt(str);
			if(you<0 || you>2){//youが0未満または2より上の場合
				System.out.println("0～2までの数値を入力してください。");
				continue;
			}
			//インチキモード
			if(i<=3 && yourScore==2){//3戦目でyouが2勝した場合
				playMode=true;//インチキモード発動
			}else{
				playMode=false;//発動しない
			}
			
			int com =ComPlay(playMode,you);
			System.out.println("you:"+janken[you]);
			System.out.println("com:"+janken[com]);
			int judg = JudgmentJam(you,com);
			if(judg !=0){
				i++;
			}
			}catch(IOException err){//入力側が異常な場合
				System.out.println(err);
			}catch(NumberFormatException err){//数値以外が入力された場合
				System.out.println("0～2の数値を入力してください。");
				}
				}
				}
	public static void EndJellyfish(){//メソッドの宣言
		System.out.println("---------------------------");
		if(yourScore>comScore){
			System.out.println("YOUの勝ち"+yourScore+"勝");
			System.out.println("引き分け数"+drawCount);
			System.out.println("COMの勝ち"+comScore+"勝");
		}else{
			System.out.println("COMの勝ち"+comScore+"勝");
			System.out.println("引き分け数"+drawCount);
			System.out.println("YOUの勝ち"+yourScore+"勝");
	}
	}
	public static int ComPlay(boolean quackMode, int youCode){//メソッドの宣言
		int comPlay=0;
		if(quackMode==true){
			System.out.println("インチキモード発動");
//インチキコード
			switch(youCode){
			case 0://YOUがグー
			comPlay=2;//COMがパー
			break;
			case 1://YOUがチョキ
			comPlay=0;//COMがグー
			break;
			case 2://YOUがパー
			comPlay=1;//COMがチョキ
			break;
			}
		}else{
			 comPlay=(int)(Math.random()*3);
		}
		return comPlay;
	}
	public static int JudgmentJam(int a, int b){//メソッドの宣言
		int judg=(a-b+3)%3;
		if(judg==1){
			comScore++;
			System.out.print("Comの勝ち");	
		}else if(judg==2){
			yourScore++;
			System.out.print("Youの勝ち");
		}else{
			System.out.print("あいこなので再戦");
			drawCount++;
		}
		System.out.println("You:"+yourScore+"勝 Com:"+comScore+"勝");
		System.out.println("");
		return judg;
	}
	}
