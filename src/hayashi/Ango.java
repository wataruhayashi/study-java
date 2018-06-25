package hayashi;
import java.util.Scanner;
public class Ango {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int[] na = new int[100000];
	int n1 = 2;
	int n2 = n * n1;
	for(int i=0;i<na.length;i++) {
	    if(i == n * n1) {
		n1 += 2;
		n2 = n * n1;
		na[i] = n2;
	    }
	    na[i] = n2;
	    n2--;
	}

	System.out.println(na[m - 1]);
    }
}
