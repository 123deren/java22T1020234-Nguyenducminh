package java_01;

import java.util.Scanner;

public class cau11 {
      public static void main(String[] args) {
	       Menu();
      }
      static void Menu() {
    	  Scanner input = new Scanner(System.in);
    	  while(true) {
    		  System.out.println("\n----MENU----\n");
    		  System.out.println("1.Phuong trinh bac 2\n");
    		  System.out.println("2.Giai thua\n");
    		  System.out.println("3.So fibonacci\n");
    	      System.out.println("4.UCLN va BCNN\n");
    		  System.out.println("5.Liet ke so nguyen to nho hon n\n");
    		  System.out.println("6.Liet ke n so nguyen to\n");
    		  System.out.println("7.Liet ke tat ca so co 5 chu so\n");
    		  System.out.println("8.Liet ke tong cac so cua 1 so nguyen\n");
    		  System.out.println("9.So thuan nghich\n");
    		  System.out.println("10.liet ke so fibonacci\n");
    		  System.out.println("0.Ket thuc\n");
    			System.out.println("Nhap lc: ");
    			long n= input.nextLong();
    			if(n==1) {
    				MyMath.ptBac2();
    			}
    			else if (n==2) {
    				System.out.println("Nhap n: ");
					long a=input.nextLong();
					long c=MyMath.giaiThua2(a);
					System.out.printf("Giai thua cua %d la: %d", a, c);
				}
    			else if (n==3) {
    				System.out.println("Nhap n: ");
					long b=input.nextLong();
					long d=MyMath.Fibo(b);
					System.out.printf("So Fibo tai vi tri cua %d la: %d", b, d);
				}
    			else if(n==4) {
    				buoi1.ucln();
    			}
    			else if (n==5) {
					soNguyenTo.nhapnsonguyento();
				}
    			else if (n==6) {
					soNguyenTo.nsonguyento();
				}
    			else if (n==7) {
					soNguyenTo.chon5soNguyenTo();
				}
    			else if (n==8) {
					soNguyenTo.tongCacChuSoCuaN();
				}
    			else if(n==9) {
    				soThuanNghich.thuannghich();
    			}
    			else if(n==10) {
    				soNguyenTo.fiBovoiNsoNt();
    			}
    			else if (n==0) {
    				input.close();
    				System.out.println("Kết thúc chương trình\n");
					break;
				}
    	  }
      }
}
