package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics {
	double perimeter,
			area;
	
	public Statistics(double perimetro, double area){
		this.perimeter = perimetro;
		this.area = area;
	}

	public void add(Statistics s){
		perimeter += s.getPerimeter();
		area += s.getArea();
	}
	

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
}
