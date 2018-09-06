package examples.shapes;

/**
 * Rectangle
 *
 * This class represents rectangle objects that can be moved and scales.  Users of a rectangle can also get its area.
 *
 */
@SuppressWarnings("WeakerAccess")
public class Rectangle extends Shape {
    private Point center;
    private double width;
    private double height;

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the Rectangle -- must be a valid double
     * @param y                 The y-location of the center of the Rectangle
     * @param width            The width of the Rectangle -- must be greater or equal to zero.
     * @param height            The height of the Rectangle -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Rectangle(double x, double y,  double width, double height) throws ShapeException {
        Validator.validatePositiveDouble(width, "Invalid width");
        Validator.validatePositiveDouble(height, "Invalid height");
        center = new Point(x, y);
        this.width = width;
        this.height = height;
    }

    /**
     * Constructor with a Point for center
     *
     * @param center            The x-location of the center of the Rectangle -- must be a valid point
     * @param width            The width of the Rectangle -- must be greater or equal to zero.
     * @param height            The height of the Rectangle -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Rectangle(Point center,  double width, double height) throws ShapeException {
        Validator.validatePositiveDouble(width, "Invalid width");
        Validator.validatePositiveDouble(height, "Invalid height");
       
        if (center==null)
            throw new ShapeException("Invalid center point");

        this.center = center;
        this.width = width;
        this.height = height;
    }

    /**
     * @return  The center of the Rectangle
     */
    public Point getCenter() { return center; }


    /**
     * @return  The width of the Rectangle
     */
    public double getWidth() { return width; }

    
    /**
     * @return  The height of the Rectangle
     */
    public double getHeight() { return height; }

      
    
    
    @Override
    public void move(double deltaX, double deltaY) throws ShapeException {
        center.move(deltaX, deltaY);
    }
  
    @Override
    public void scale(double scaleFactor) throws ShapeException {
        Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        width *= scaleFactor;
        height *= scaleFactor;
    }

	@Override
	public double computeArea() {
	//  Area of a rectangle = length * width   	
    	return width * height;
	}

}