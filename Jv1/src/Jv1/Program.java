package Jv1;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {
     public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Nhap so hang: ");
		int n= input.nextInt();
		System.out.println("Nhap so cot: ");
		int m=input.nextInt();
		System.out.println("NHAP MA TRAN A");
		long[][] a= MyMath.nhapMT(n, m);
		System.out.println("NHAP MA TRAN B");
		long[][] b =MyMath.nhapMT(n, m);
		System.out.println("MA TRAN A");
		MyMath.xuatMT(a, n, m);
		System.out.println("Ma tran B");
		MyMath.xuatMT(b, n, m);
		System.out.println("TONG HAI MA TRAN");
		MyMath.congMT(a, b, n, m);
		System.out.println("Nhan hai ma tran");
		MyMath.nhanMT(a, b, n, m);
		LocalDate p = LocalDate.now();
		System.out.print(p);
	}
}
