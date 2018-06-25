package hayashi;
import java.util.Scanner;
public class Angokaidoku {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] str = null;
	    //暗号解読
	    char[] ary = {'a','b','c','d','e','f','g','h','i','j',
		'k','l','m','n','o','p','q','r','s','t','u','v','W','x','y','z'};
	    //int n = sc.nextInt();
	    String t = sc.next();
	    String s = sc.next();
	    String[] ta = t.split("");
	    String[] sa = s.split("");
	    char[] c = new char[sa.length];
	    for(int i=0;i<sa.length;i++) {
		for(int j=0;j<ta.length;j++) {
		    if(sa[i].equals(ta[j])) {
			c[i] = ary[j];
		    }
		}
	    }
	    for(char a : c) {
		System.out.print(a);
	    }
    }

}
