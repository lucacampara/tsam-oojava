package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display {
	
	private Shape[] shapes;
	
	
	
	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}
	
	public double totalPerimeter(){
		double tot = 0;
		for (Shape s : shapes) { 
			tot += s.perimeter();
		}
		return tot;
	}
	
	public double totalArea(){
		double tot = 0;
		for (Shape s : shapes) { 
			tot += s.area();
		}
		return tot;
	}
}
