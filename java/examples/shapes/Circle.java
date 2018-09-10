package examples.shapes;
import Internal.AreaCalculator;

/**
 * Circle
 *
 * This class represents circle objects that can be moved and scales.  Users of a circle can also get its area.
 *
 */
@SuppressWarnings("WeakerAccess")
public class Circle extends Shape{
    
	
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
        this.setCenter(x, y);       
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
       
        this.setCenter(center); 
             
        
        this.radius = radius;
    }

  

    /**
     * @return  The radius of the circle
     */
    public double getRadius() { return radius; }

  
     
    @Override
    public void move(double deltaX, double deltaY) throws ShapeException {
        this.move(deltaX, deltaY);
    }



	@Override
	public double computeArea() {		
		AreaCalculator areaHelper = new AreaCalculator();	
		 return areaHelper.computeCircleArea(radius);
	}

	@Override
	public void scale(double scaleFactor) throws ShapeException{
		Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        radius *= scaleFactor;
	}

}
