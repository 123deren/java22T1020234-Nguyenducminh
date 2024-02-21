package Jv1;
import java.util.Scanner;
public class MyMath {
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
    	System.out.printf("Phan tu be nhat trong mang: %d\n", min);
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
    static long[][] nhapMT(int n, int m){
    	Scanner in= new Scanner(System.in);
    	long[][] mt= new long[n][m]; 
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			System.out.printf("Nhap hang %d cot %d: ", i+1, j+1);
    			mt[i][j]=in.nextLong();
    		}
    	}
    	return mt;
    }
    static void xuatMT(long a[][], int n, int m){
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			System.out.printf("Ma tran [%d][%d]=%d \n",i+1,j+1,a[i][j] );
    		}
    	}
    }
    static void congMT(long a[][], long b[][],int n,int m) {
    	long[][] c= new long[n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			c[i][j]= a[i][j]+b[i][j];
    		}
    	}
    	MyMath.xuatMT(c, n, m);
    }
    static void nhanMT(long a[][], long b[][],int n,int m) {
    	long[][] c= new long[n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			for(int k=0;k<m;k++) {
    				c[i][j]+= a[i][k]*b[k][j];
    			}
    		}
    	}
    	MyMath.xuatMT(c, n, m);
    }
}
