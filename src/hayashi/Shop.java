package hayashi;
import java.util.Scanner;
public class Shop {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int syokusum = 0;
	int syosesum = 0;
	int irusum = 0;
	int etcsum = 0;
	int sum = 0;
	for(int i=0;i<n;i++) {
	    int v = sc.nextInt();
	    int p = sc.nextInt();
	   switch(v) {
	    	case 0:
	    	    syokusum += p;
		break;
	    	case 1:
	    	    syosesum += p;
		break;
	    	case 2:
	    	    irusum += p;
	    	break;
	    	case 3:
	    	    etcsum += p;
		default:
	    }
	}
	sum += (syokusum/100 * 5) + (syosesum/100 * 3) + (irusum/100 * 2) + (etcsum/100 * 1);
	System.out.println(sum);
    }
}
/*6
0 200
1 240
0 120
3 460
1 240
2 3200*/
/*24
1 4750
2 2860
2 8420
1 4520
0 2450
1 3540
1 4960
1 590
3 2160
3 9160
1 7900
3 8730
0 9450
1 8940
1 8680
0 4530
0 4420
1 2320
3 7960
0 2110
0 2020
2 3650
0 6280
2 3270*/
//0 は食料品=100円每5ポイント、1 は書籍100円毎3ポイント、2 は衣類100円毎2ポイント、3 はその他100円毎1ポイント