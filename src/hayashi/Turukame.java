package hayashi;
import java.util.Scanner;
public class Turukame {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int foot = sc.nextInt();
	int face = sc.nextInt();
	int turu = sc.nextInt();
	int kame = sc.nextInt();
	int nokori = foot - kame * face;
	int kc = nokori / (kame - turu);
	int tc = face - kc;
	System.out.println(tc + " " + kc);

    }

}
