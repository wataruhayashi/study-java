package seikyusyo;
import java.util.Scanner;
public class Seikyu{
	public static int shokei(Meisai[] mei) {
		int kei = 0;
		for(int i=0;i<2;i++) {
			kei += mei[i].kin();
		}
		return kei;
	}
	public static int zei(int shokei) {
		return (int)Math.floor(shokei * 0.08);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Item it = new Item();
		System.out.print("お客様名：");
		String name = sc.nextLine();

		Meisai[] mei = new Meisai[2];
		mei[0] = new Meisai();
		mei[1] = new Meisai();

		System.out.print("商品1:");
		mei[0].sho = it.getShohin(Integer.parseInt(sc.nextLine()));
		System.out.print("数量:");
		mei[0].suryo = Integer.parseInt(sc.nextLine());
		System.out.print("商品2:");
		mei[1].sho = it.getShohin(Integer.parseInt(sc.nextLine()));
		System.out.print("数量:");
		mei[1].suryo = Integer.parseInt(sc.nextLine());


		System.out.println("商品名\t単価\t数量\t金額");
		for(Meisai m : mei) {
			System.out.println(m.sho.name + "\t\t" + m.sho.tanka +
					"\t" + m.suryo + "\t" + m.kin());
		}
		int sho, tax;
		sho = shokei(mei);
		tax = zei(sho);
		System.out.println("\t\t\t小計\t" + sho);
		System.out.println("\t\t\t税\t" + tax);
		System.out.println("\t\t\t合計\t" + (sho + tax));

	}
}