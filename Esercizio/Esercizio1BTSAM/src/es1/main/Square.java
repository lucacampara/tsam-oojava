package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Square implements Shape{

	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double area(){
		return side*side;
	}
	
	public double perimeter(){
		return 4*side;
	}
	
	
}
