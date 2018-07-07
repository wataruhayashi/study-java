package hayashi;
import java.util.Scanner;
public class Test{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    try {
		if(Integer.parseInt(s) == 0 || s.equals(null)) {
			System.out.println(s);
		    }
		    if(Integer.parseInt(s) == 2) {
			System.out.println(s);
		    }
	    }catch(NullPointerException n) {
		n.printStackTrace();
	    }
	    System.out.println("Hello");
	}
}