package java_01;

import java.util.Scanner;

public class buoi1ptbac2 {
	//cau1
    public static void main(String[] args) {
    	 Scanner input = new Scanner(System.in);
	       	System.out.println("Nhap a: ");
	       	long a=input.nextInt();
	       	System.out.println("Nhap b: ");
	       	long b=input.nextLong();
	        System.out.println("Nhap c: ");
	        long c=input.nextLong();
	       	double alpha= (b*b)-4*a*c;
	       	input.close();
	       	if(alpha<0) {
	       		System.out.println("Phuong trinh vo nghiem");
	       	}
	        else if (alpha==0) {
	        	double s= -b/(2*a);
				System.out.printf("Phuong trinh co 1 nghiem duy nhat la: %f",s);
			}
	       	else{
				double s1= (-b + Math.sqrt(alpha))/(2*a);
				double s2= (-b - Math.sqrt(alpha))/(2*a);
				System.out.printf("Phuong trinh co 2 nghiem phan biet la: %f, %f", s1, s2);
			}
	}
}
