package hayashi;
import java.util.Scanner;
public class Card {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] nums = {1,2,3,4,5};
	int sum = 0;
	for(int i=0;i<4;i++){
	    int n = sc.nextInt();
	    for(int j=0;j<nums.length;j++) {
		if(n == nums[j]) {
		    sum += n;
		}
	    }
	}
	System.out.println(15 - sum);
    }
}
