package java_01;

import java.util.Scanner;

public class soNguyenTo {
	public static void main(String[] args) {
		fiBovoiNsoNt();
	}
       static void nhapnsonguyento() {
    	   //Cau5
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap n: ");
		long n= input.nextLong();
		System.out.println("Tong hop cac so nt be hon n: ");
		for(int i=0;i<n;i++) {
			boolean a = MyMath.soNt(i);
			if(a==true) {
				System.out.printf("%d ",i);
			}
		}
	}
    static void nsonguyento() {
    	//Cau6
    	Scanner input = new Scanner(System.in);
		System.out.println("Nhap n: ");
		long n= input.nextLong();
		System.out.printf("%d so nguyen to dau la: ", n);
		int dem=2;
		while(n>0) {
			boolean a = MyMath.soNt(dem);
			if(a==true) {
				System.out.printf("%d ",dem);
				n--;
				dem=dem+1;
			}else {
			dem=dem+1;
		}
    }
    }
    static void chon5soNguyenTo() {
    	//cau7
		System.out.printf("so nguyen to co 5 chu so la: ");
		int dem=10000;
		while(dem<100000) {
			boolean a = MyMath.soNt(dem);
			if(a==true) {
				System.out.printf("%d\n",dem);
				dem=dem+1;
			}else {
			dem=dem+1;
		}
    }
    }
    static void tongCacChuSoCuaN() {
    	//cau8
    	Scanner input = new Scanner(System.in);
		System.out.println("Nhap n: ");
		long n= input.nextLong();
		long a=n;
		long t=0;
		while(a>0) {
			t=t+a%10;
			a/=10;
		}
		System.out.printf("Tong cac chu so nguyen cua %d la: %d", n, t);
    }
    static void fiBovoiNsoNt() {
    	//cau8
    	Scanner input = new Scanner(System.in);
		System.out.println("Nhap n: ");
		long n= input.nextLong();
		long z=n;
		System.out.println("Cac so fibo be hon n va la so nt la: ");
		while(z>0) {
			long a=MyMath.Fibo(z);
			if(a<n) {
				if(MyMath.soNt(a)) {
					System.out.printf("%d ", a);
				}
			}
			z--;
		}
    }
}
