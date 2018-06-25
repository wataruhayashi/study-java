package hayashi;
import java.util.Scanner;
public class Lieg {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] w = new int[n*(n-1)/2];
	/*int w,l;
	for(int i=0;i<n;i++){
	    w = sc.nextInt();
	    l = sc.nextInt();
	}*/
	for(int i=0;i<n;i++){
	    for(int j=1;j<n;j++){
		if(i+1 == j){
		    System.out.print("-\t");
		}else{
		    System.out.print("*\t");
		}
	    }
	    if(i == n-1){
		System.out.println("-");
	    }else{
		System.out.println("*");
	    }
	}
    }
}
