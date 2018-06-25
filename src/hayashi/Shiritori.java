package hayashi;
import java.util.Scanner;
public class Shiritori {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	String[] ary = a.split("");
	String b = sc.nextLine();
	String[] bry = b.split("");
	if(ary[ary.length-1].equals(bry[0]) && !(bry[bry.length-1].equals("n"))) {
	    System.out.println("OK");
	}else {
	    System.out.println("NG");
	}

    }
}
