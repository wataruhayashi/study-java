package hayashi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Keisandoriru {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tasizan = sc.nextInt();
	int hikizan = sc.nextInt();
	ArrayList<String> tasihiki = new ArrayList();
	for(int i = 0 ; i < tasizan ; i++) {
	    tasihiki.add("+");
	}
	for(int i = 0 ; i < hikizan ; i++) {
	    tasihiki.add("-");
	}
	Collections.shuffle(tasihiki);
	ArrayList<Integer> kazu = new ArrayList();
	for(int i = 0 ; i < 100 ; i++) {
	    kazu.add(i);
	}
	Collections.shuffle(kazu);
	int in = tasizan + hikizan;
	for(int i=0;i<in;i++) {
	    int a = kazu.get(i);
	    int b = kazu.get(i+1);
	    System.out.println(a + " " + tasihiki.get(i) + " " + b + " =");
	}
    }
}
