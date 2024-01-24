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
    static long[] nhapMang(int n, long a[]){
    	 Scanner input = new Scanner(System.in);
    	for(int i =0;i<n;i++) {
    		System.out.printf("Nhap phan tu thu %d: ", i+1);
    		a[i]=input.nextLong();
    	}
    	return a;
    }
    static void xuatMang(long a[]) {
    	for(int i=0;i<a.length;i++) {
    		System.out.printf("Phan tu thu %d: ",i+1);
    		System.out.print(a[i]);
    		System.out.println();
    	}
    }
    static void maxMang( long a[]) {
    	long max = a[0];
    	for(int i=0;i<a.length;i++) {
    		if(a[i]>=max) {
    			max=a[i];
    		}
    	}
    	System.out.printf("Phan tu lon nhat trong mang: %d\n", max);
    }
    static void minMang(long a[]) {
    	long min = a[0];
    	for(int i=0;i<a.length;i++) {
    		if(a[i]<=min) {
    			min=a[i];
    		}
    	}
    	System.out.printf("Phan tu lon nhat trong mang: %d\n", min);
    }
    static void avgMang( long a[]) {
    	long sum = 0;
    	long dem=0;
    	for(int i=0;i<a.length;i++) {
    		sum+=a[i];
    		dem++;
    	}
    	double tb=sum/dem;
    	System.out.printf("Trung binh cua mang la: %f\n", tb);
    }
}
