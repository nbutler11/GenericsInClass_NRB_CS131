
public class SquareGenerics {
	private double side;
	private double area;
	
	public SquareGenerics() {
		side = 0.0;
	}
	public SquareGenerics(double s) {
		side = s; 
		calculateArea();
	}
	
	protected double calculateArea() {
		area=Math.pow(side, 2);
		return area;
	}
	
	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "SquareGenerics [side=" + side + ", area=" + area + "]";
	}
	
}

