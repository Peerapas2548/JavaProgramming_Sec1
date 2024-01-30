
public class Rectangle extends Shape {

	private double width,length;
	
	Rectangle(double width,double length,String color){
		super(color);
		this.width=width;
	    this.length=length;
	}
	@Override
	public double getArea() {//Method getArea()-->abstract method from SuperClass
		return this.width*this.length;
	}
	@Override
	public String toString() {
		return "Rectangle[width = "+this.width+" , length = "+this.length+" , "+super.toString()+"]";
	}
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
}
