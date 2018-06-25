package hayashi;
import java.util.Scanner;
public class Okasi {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int o = sc.nextInt();
	int youki = 0;
	int amari = 100;
	int kikai = 0;
	for(int i=0;i<m;i++) {
	    int y = sc.nextInt();
	     if(amari >= o % y) {
		     amari = o % y;
		     youki = y;
		     kikai = i + 1;
	     }
	}
	System.out.println(kikai);
    }
}
