
import OOP.Point;
public class Program {
	public static void main(String[] args) {
		Point p = new Point();
		p.Nhap();
		Point p2 = new Point(10,20);
		p.In();
		System.out.println(p.distance(p2));
	}

}
