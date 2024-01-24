package java_01;

import java.util.Scanner;

public class MyMath {
   static long add(long a, long b) {
     	long tong= a+b;
		return tong;
     }
   static boolean isEven(long a) {
  	 if(a%2==0) {
  		 return true;
  	 }
  	 return false;
   }
   //cau 2
   public static long giaiThua(long n) {
  	 long kq=1;
  	 for(int i=1;i<=n;i++) {
  		 kq=kq*i;
  	 }
  	 return kq;
   }
   public static long giaiThua2(long n) {
  	 if(n==0) {
  		 return 1;
  	 }
  	 return n* giaiThua2(n-1);
   }
   //cau 3
   public static long Fibo(long n) {
  	 if(n==0) {
  		 return 0;
  	 }
  	 if(n==1||n==2) {
  		 return 1;
  	 }
  	 return Fibo(n-1)+Fibo(n-2);
   }
   //cau 4
   public static long ucln(long a, long b) {
	while (a!=b) {
		if(a>b) {
			a=a-b;
		}
		else {
			b=b-a;
		}
	}
	return a;
   }
   public static boolean soNt(long n) {
	   if(n<=1) {
		   return false;
	   }
	   for(int i=2;i<=Math.sqrt(n);i++) {
		   if(n%i==0) {
			   return false;
		   }
	   }
	return true;
}
   static boolean thuanNghich(long n) {
	   long a=n;
	   long r=0;
	   while(n>0) {
		   long c= n%10;
		   r=r*10+c;
		   n/=10;
	   }
	   return a==r;
   }
   static void ptBac2() {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Nhap a: ");
	    long a = input.nextLong();
	    System.out.println("Nhap b: ");
	    long b = input.nextLong();
	    System.out.println("Nhap c: ");
	    long c = input.nextLong();
	    double alpha = (b * b) - 4 * a * c;
	    if (alpha < 0) {
	        System.out.println("Phuong trinh vo nghiem");
	    } else if (alpha == 0) {
	        double s = -b / (2.0 * a);
	        System.out.printf("Phuong trinh co 1 nghiem duy nhat la: %f", s);
	    } else {
	        double s1 = (-b + Math.sqrt(alpha)) / (2.0 * a);
	        double s2 = (-b - Math.sqrt(alpha)) / (2.0 * a);
	        System.out.printf("Phuong trinh co 2 nghiem phan biet la: %f, %f", s1, s2);
	    }
	}

}
