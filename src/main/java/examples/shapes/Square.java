package examples.shapes;

/**
 * Square
 *
 * This class represents square objects that can be moved and scales.  Users of a square can also get its area.
 *
 */
@SuppressWarnings("WeakerAccess")
public class Square extends Shape {
    private Point center;
    private double sideLength;
    

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the square -- must be a valid double
     * @param y                 The y-location of the center of the square
     
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Square(double x, double y,  double sideLength) throws ShapeException {
        Validator.validatePositiveDouble(sideLength, "Invalid side length");
        center = new Point(x, y);
        this.sideLength = sideLength;
    }

    /**
     * Constructor with a Point for center
     *
     * @param center            The x-location of the center of the square -- must be a valid point
     * @param side length            The side length of the square -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Square(Point center,  double sideLength) throws ShapeException {
        Validator.validatePositiveDouble(sideLength, "Invalid side length");
       
        if (center==null)
            throw new ShapeException("Invalid center point");

        this.center = center;
        this.sideLength = sideLength;
        
    }

    /**
     * @return  The center of the square
     */
    public Point getCenter() { return center; }


    /**
     * @return  The side length of the square
     */
    public double getSideLength() { return sideLength; }
  
   
    
    @Override
    public void move(double deltaX, double deltaY) throws ShapeException {
        center.move(deltaX, deltaY);
    }

    @Override
    public void scale(double scaleFactor) throws ShapeException {
        Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        sideLength *= scaleFactor;       
    }

	@Override
	public double computeArea() {
	//  Area of a square = sideLength^2  	
    	return sideLength * sideLength;
	}

}