package java_01;

public class soThuanNghich {
	public static void main(String[] args) {
		thuannghich();
	}
	static void thuannghich() {
		System.out.println("So thuan nghich chua 5 chu so: \n");
		for(int i=100000;i<1000000;i++) {
			if(MyMath.thuanNghich(i)) {
				System.out.printf("%d \n",i);
			}
		}
	}
}
