package examples.shapes;

public abstract class Shape {
    
	private Point center;
	
	public abstract double computeArea();
    
    public abstract void scale(double scaleFactor) throws ShapeException;
    
    public abstract void move(double deltaX, double deltaY) throws ShapeException;
}