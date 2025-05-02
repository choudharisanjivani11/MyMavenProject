package javapractices;

public class MethodOverloading {

	public static void main(String[] args) {
	
		Shape s=new Shape();
		System.out.println("Area of circle πr2 :" +s.area(3.00));
		System.out.println("Area of rectangle l*w: " +s.area(2.00, 5.00));

	}

}

class Shape {
	                                      //Area of a circle (overloaded method)
	public double area(double radius) {
		return Math.PI*radius*radius;
	}
	                                           // Area of a rectangle (overloaded method)
	public double area(double length,double width) {
		return length*width;
	}
}

