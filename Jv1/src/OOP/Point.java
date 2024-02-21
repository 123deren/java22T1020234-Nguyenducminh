package OOP;

import java.util.Scanner;

public class Point {
	private int x, y;
	/*source -> generate getters and setters*/
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
    public Point() {
    	x=y=0;
    }
    public Point(int x, int y) {
    	this.x=x;
    	this.y=y;
    }
    public double distance() {
    	return Math.sqrt(x*x + y *y);
    }
    public double distance(Point p) {
    	return Math.sqrt(Math.pow(this.x-p.x, 2) +Math.pow(this.y-p.y, 2));
    }
    public Point(Point p) {
    	this.x=p.x;
    	this.y=p.y;
    }
    public void Nhap() {
		Scanner in= new Scanner(System.in);
		System.out.println("Nhap x:");
		this.x= in.nextInt();
		System.out.println("Nhap y:");
		this.y= in.nextInt();
		in.close();
	}
    public void In() {
    	System.out.printf("Gia tri cua x va y la: %d va %d\n", this.x, this.y);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
    	Point p =new Point();
        p.x=this.x;
        p.y=this.y;
    	return p;
    }
    @Override
    public String toString() {
    	return String.format("Point(%d, %d", x, y);
    }
}
