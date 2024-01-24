package java_01;

import java.util.Scanner;

public class Program {
     public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n= input.nextInt();
		long[] a= new long[n];
		MyMath.nhapMang(n, a);
		MyMath.xuatMang(a);
		MyMath.maxMang(a);
		MyMath.minMang(a);
		MyMath.avgMang(a);
	}
}
