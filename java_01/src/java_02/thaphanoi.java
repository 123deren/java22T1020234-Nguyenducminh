package java_02;

public class thaphanoi {
    static void chuyen(int n, String a, String c) {
          System.out.printf("Dia thu %d da chuyen tu cot %s sang cot %s \n", n,a, c);
    }
    static void thapHaNoi(int n, String a, String b, String c) {
    	if(n==1) {
    		chuyen(1, a, c);
    	}
    	else {
    		thapHaNoi(n-1, a, c, b);
    		chuyen(n, a, c);
    		thapHaNoi(n-1, b, a, c);
    	}
    }
}
