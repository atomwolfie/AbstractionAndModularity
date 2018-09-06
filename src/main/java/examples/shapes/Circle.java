package examples.shapes;

/**
 * Circle
 *
 * This class represents circle objects that can be moved and scales.  Users of a circle can also get its area.
 *
 */
@SuppressWarnings("WeakerAccess")
public class Circle extends Shape{
	//private Point center;
    private double radius;

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the circle -- must be a valid double
     * @param y                 The y-location of the center of the circle
     * @param radius            The radius of the circle -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Circle(double x, double y, double radius) throws ShapeException {
        Validator.validatePositiveDouble(radius, "Invalid radius");
        center = new Point(x, y);
        this.radius = radius;
    }

    /**
     * Constructor with a Point for center
     *
     * @param center            The x-location of the center of the circle -- must be a valid point
     * @param radius            The radius of the circle -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Circle(Point center, double radius) throws ShapeException {
        Validator.validatePositiveDouble(radius, "Invalid radius");
        if (center==null)
            throw new ShapeException("Invalid center point");

        this.center = center;
        this.radius = radius;
    }

    /**
     * @return  The center of the circle
     */
    public Point getCenter() { return center; }

    /**
     * @return  The radius of the circle
     */
    public double getRadius() { return radius; }

  
    
    
    
    @Override
    public void move(double deltaX, double deltaY) throws ShapeException {
        center.move(deltaX, deltaY);
    }



	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		 return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void scale(double scaleFactor) throws ShapeException{
		// TODO Auto-generated method stub
		Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        radius *= scaleFactor;
	}

}
