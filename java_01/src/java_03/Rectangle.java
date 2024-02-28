package java_03;

public class Rectangle {
	private float length;
	private float width;

	public Rectangle() {
		length = width = 0;
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return this.length;
	}
	public float getWidth() {
		return this.width;
	}
	public void setLength(float length) {
		this.length=length;
	}
	public void setWidth(float width) {
		this.width=width;
	}
	public double getArea() {
		return this.length*this.width;
	}
	public double getPrimeter() {
		return 2*(this.length*this.width);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Rectangle[Length=%f, Width=%f]", this.length,this.width);
		
	}
}
