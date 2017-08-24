package hayashi;
import java.util.Scanner;

class Jikyu{

	 int tanka,jikan;

	public int kyuyo(){
		return tanka * jikan;
	}

	public int zei(){
		return (int)(kyuyo() * 0.1);
	}

	public int jyukyu(){
		return (int)(kyuyo() - zei());
	}
}
class Sample1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Jikyu jikyu = new Jikyu();
		jikyu.tanka = sc.nextInt();
		jikyu.jikan = sc.nextInt();
		System.out.println("時給：" + jikyu.tanka);
		System.out.println("時間：" + jikyu.jikan);
		System.out.println("給与：" + jikyu.kyuyo());
		System.out.println("所得税：" + jikyu.zei());
		System.out.println("支給額：" + jikyu.jyukyu());
	}
}