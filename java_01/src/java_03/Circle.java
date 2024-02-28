package java_03;
import java.lang.Math;
public class Circle {
    private double r;
    public Circle() {
		r=0;
	}     
    public Circle(double r) {
    	this.r=r;
    }
    public double getR() {
		return this.r;
	}
    public void setR(double r) {
		this.r=r;
	}
    public double getArea() {
		return Math.PI*Math.pow(r, 2);
	}
    public double getCircumference() {
		return (2*Math.PI)*r;
	}
    @Override
    public String toString() {
    	return String.format("Circle[radius=%f]", this.r);
    }
}
