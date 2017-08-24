package dice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class thohan {
	static int you/*,com*/;
	static int dice1,dice2,sum_dice;
	public void start()throws IOException{
		System.out.println("丁半ゲームを開始しますか？");
		BufferedReader br=
				 new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		switch(num){
			case 1:
				System.out.println("開始します。");
				int i = 0;
				while(i < 10){
					i++;
					choice();
				}
			break;
			case 2:
				System.out.println("終了します。");
			break;
			default:
				System.out.print("1か2を入力してください。");
			break;
			
		}
	}
	public void choice()throws IOException{
		System.out.println("丁か半か決めて下さい。(2=丁:1=半)");
		BufferedReader br=
				 new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		you = Integer.parseInt(str);
		//com = (int)(Math.random()*2+1);
		if(you == 1){
			System.out.println("You choice :半");
			huru();
		}else if(you == 2){
			System.out.println("You choice :丁");
			huru();
		}else{
			System.out.println("1か2を入れろ。");
		}
		/*if(com == 1){
			System.out.println("COMは半を選びました。");
		}else
			System.out.println("COMは丁を選びました。");*/
		
	}
	public void huru(){
		System.out.println("サイコロを振った。");
		dice1 = (int)(Math.random()*6+1);
		dice2 = (int)(Math.random()*6+1);
		sum_dice = dice1 + dice2;
		if(sum_dice%2==0){
			System.out.println(sum_dice + ":丁がでたよ。");
		}else
			System.out.println(sum_dice + ":半がでたよ。");
		judg();
	}
	public void judg(){
		if((you == 2 && sum_dice % 2 == 0) || (you == 1 && sum_dice % 2 == 1)){
			System.out.println("いえーい。");
		}else{
			System.out.println("残念。");
		}
	}
}

class Action{
	public static void main(String[] args)throws IOException {
		thohan tn = new thohan();
		tn.start();
	}
}
