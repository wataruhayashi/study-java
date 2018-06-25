package hayashi;

import java.util.Scanner;

public class Where {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	    int w = sc.nextInt();
	    int h = sc.nextInt();
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    for(int i=0;i<n;i++) {
		String dir = sc.next();
		int m = sc.nextInt();
		if(dir.equals("U")) {
		    if(y+m > h) {
			y = (y+m) - h;
		    }else {
			y = y+m;
		    }
		}if(dir.equals("D")) {
		    if(y-m == 0){
			y = h;
		    }else if(y-m < 0) {
			y = h - (m-y);
		    }else {
			y = y-m;
		    }
		}if(dir.equals("R")) {
		    if(x+m > w) {
			x = (x+m) - w;
		    }else {
			x = x+m;
		    }
		}if(dir.equals("L")) {
		    if(x-m == 0) {
			x = w;
		    }else if(x-m < 0) {
			x = w - (m-x);
		    }else {
			x = x-m;
		    }
		}
	    }
	    System.out.println(x + " " + y);

    }

}
