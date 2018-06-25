package hayashi;
import java.util.Scanner;
public class Medal{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    //国の数
	    int n = sc.nextInt();
	    int[] ga = new int[n];
	    int[] sa = new int[n];
	    int[] ba = new int[n];
	    //メダルの数
	    for(int i=0;i<n;i++) {
		int g = sc.nextInt();
		int s = sc.nextInt();
		int b = sc.nextInt();

		ga[i] = g;
		sa[i] = s;
		ba[i] = b;
	    }
	    //メダルのソート
	    for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
		    if(ga[i] < ga[j]) {
			int t = ga[i];
			ga[i] = ga[j];
			ga[j] = t;

			t = sa[i];
			sa[i] = sa[j];
			sa[j] = t;

			t = ba[i];
			ba[i] = ba[j];
			ba[j] = t;

			if(i >= 1) {
            			if(ga[i-1] < ga[i]) {
            			    t = ga[i];
            			    ga[i] = ga[j];
            			    ga[j] = t;

            			    t = sa[i];
            			    sa[i] = sa[j];
            			    sa[j] = t;

            			    t = ba[i];
            			    ba[i] = ba[j];
            			    ba[j] = t;
            			}else if(ga[i-1] == ga[i]) {
            			    if(sa[i-1] < sa[i]) {
            				t = sa[i-1];
            				sa[i-1] = sa[i];
            				sa[i] = t;

            				t = ba[i-1];
            				ba[i-1] = ba[i];
            				ba[i] = t;

            			    }else if(sa[i-1] == sa[i]) {
            				if(ba[i-1] < ba[i]) {
            				    t = ba[i-1];
            				    ba[i-1] = ba[i];
            				    ba[i] = t;
            				}
            			    }
            			}
			}
		    }
		}
	    }
	    System.out.println("-------------");
	    for(int q=0;q<n;q++) {
		System.out.println(ga[q] + " " + sa[q] + " " + ba[q]);
	    }
	}
}
/*6
3 5 9
15 20 35
30 45 72
15 20 31
27 33 59
27 35 77
出力例1
30 45 72
27 35 77
27 33 59
15 20 35
15 20 31
3 5 9
*/
/*10
28 33 59
14 18 28
28 36 38
2 42 73
22 52 81
21 58 71
23 57 82
28 33 59
16 16 19
16 47 92
---------
28 36 38
28 33 59
28 33 59
23 57 82
22 52 81
21 58 71
16 47 92
16 16 19
14 18 28
2 42 73*/