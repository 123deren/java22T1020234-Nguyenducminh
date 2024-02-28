package java_02;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so dia: ");
		int n = in.nextInt();
		in.close();
		String a="a", b="b", c="c";
		thaphanoi.thapHaNoi(n, a, b, c);
	}
}
