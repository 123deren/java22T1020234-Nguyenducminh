package java_01;
import java.util.Scanner;
public class buoi1{
      public static void main(String[] args) {
    	ucln();
	}
    static void gt() {
    	Scanner input = new Scanner(System.in);
      	System.out.println("Nhap n: ");
      	long n= input.nextInt();
      	long s= MyMath.giaiThua2(n);
      	input.close();
      	System.out.printf("Giai thua cua n la : %d", s);
    }
    static void ucln() {
    	Scanner input = new Scanner(System.in);
      	System.out.println("Nhap a: ");
      	long a= input.nextLong();
      	System.out.println("Nhap b: ");
      	long b= input.nextLong();
      	long s= MyMath.ucln(a,b);
      	System.out.printf("UCLN cua %d va %d la: %d",a,b, s);
    }
}
