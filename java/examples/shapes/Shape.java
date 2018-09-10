package examples.shapes;

public abstract class Shape {
    
	private Point center;
	
public Point getCenter(){return center;};
	
	public void setCenter(double x, double y){
		center.setX(x);
		center.setY(y);
	}
	
	public void setCenter(Point center){
		center.setX(center.getX());
		center.setY(center.getY());
	}
	
	
	public abstract double computeArea();
    
	
	
	
    public abstract void scale(double scaleFactor) throws ShapeException;
    
    public abstract void move(double deltaX, double deltaY) throws ShapeException;
}