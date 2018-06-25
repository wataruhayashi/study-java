package hayashi;
import java.util.Scanner;
public class Caffe {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Double x = sc.nextDouble();
	Double p = sc.nextDouble();
	Double sum = x;
	Double waribiki = 0.0;
	for(Double i = x; i > 0.0; i--) {
	    waribiki = x - x * (p * 0.01);
	    sum += Math.floor(waribiki);
	    x = waribiki;
	}
	System.out.println((int)(Math.floor(sum)));
    }
}
