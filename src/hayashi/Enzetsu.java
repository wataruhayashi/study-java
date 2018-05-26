package hayashi;
import java.util.Scanner;
public class Enzetsu {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int k = sc.nextInt();
	int[] ma = new int[m];
	for(int i=0;i<k;i++) {
	    int a = sc.nextInt();
	    for(int j=0;j<ma.length;j++) {
		if(ma[j] == a-1) {
		    ma[j] += n-(n-1);
		}
	    }
	    n--;
	}
	int max = 0;
	for(int i : ma) {
	    if(i > max) {
		max = i;
	    }
	}
	System.out.println(max);
    }
}
