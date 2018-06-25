package hayashi;
import java.util.Scanner;;
public class Zisa {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	    int[] sary = new int[n];
	    for(int i=0;i<n;i++) {
		String p = sc.next();
		int s = sc.nextInt();
		sary[i] = s;
	    }
	    String q = sc.next();
	    String t = sc.next();
	    String[] str = t.split(":");
	    String[] ary = new String[n];
	    for(int i=0;i<n;i++) {
		if(sary[i] < 12 && sary[i] > -12) {
		    if(sary[i] < -2) {
			ary[i] ="0" + String.valueOf(12 + sary[i]);
		    }else {
			ary[i] = String.valueOf(12 + sary[i]);
		    }
		}else if(sary[i] == 12 || sary[i] == -12){
		    ary[i] = "00";
		}else if(sary[i] > 12) {
		    ary[i] ="0" + String.valueOf(12 + sary[i] - 24);
		}
	    }
	    for(String s : ary) {
		System.out.println( s + ":" + str[1]);
	    }
    }

}
