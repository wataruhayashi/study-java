package hayashi;

import java.util.Scanner;

public class Rabbit {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int s = sc.nextInt();
	    int p = sc.nextInt();
	    int count = 0 ;
	    int si = 0;
	    for(int i=1;i<=n;i++) {
		int m = sc.nextInt();
		int sa = sc.nextInt();
		if(sa > s - p && sa < s + p) {
		    if(m > si) {
			si = m;
			count = i;
		    }
		}
	    }
	    if(count == 0) {
		System.out.println("not found");
	    }else {
		System.out.println(count);
	    }
    }

}
