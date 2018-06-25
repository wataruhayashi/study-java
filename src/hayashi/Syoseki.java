package hayashi;
import java.util.Scanner;

public class Syoseki {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	    int ninzu = sc.nextInt();
	    String[] nameary = new String[ninzu];
	    int [] kingakuary = new int[ninzu];
	    for(int i=0;i<ninzu;i++) {
		String name = sc.next();
		nameary[i] = name;
	    }
	    int honkazu = sc.nextInt();
	    for(int i=0;i<honkazu;i++) {
		String namae = sc.next();
		int kingaku = sc.nextInt();
		for(int j=0;j<ninzu;j++) {
		    if(nameary[j].equals(namae)) {
			kingakuary[j] += kingaku;
		    }
		}
	    }
	    for(int i=0;i< kingakuary.length-1;i++) {
		for(int j=i+1;j<kingakuary.length;j++) {
		    if(kingakuary[i] < kingakuary[j] ) {
			int tim = kingakuary[i];
			String str = nameary[i];
			kingakuary[i] = kingakuary[j];
			nameary[i] = nameary[j];
			kingakuary[j] = tim;
			nameary[j] = str;
		    }
		}
	    }
	    for(int i=0;i<ninzu;i++) {
		System.out.println(nameary[i]);
	    }
    }
}
