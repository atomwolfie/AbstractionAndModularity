package examples.shapes;
import Internal.AreaCalculator;

/**
 * Ellipse
 *
 * This class represents ellipse objects that can be moved and scales.  Users of a ellipse can also get its area.
 *
 */
@SuppressWarnings("WeakerAccess")
public class Ellipse extends Shape {
    private double width;
    private double height;

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the ellipse -- must be a valid double
     * @param y                 The y-location of the center of the ellipse
     * @param width            The width of the ellipse -- must be greater or equal to zero.
     * @param height            The height of the ellipse -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Ellipse(double x, double y,  double width, double height) throws ShapeException {
        Validator.validatePositiveDouble(width, "Invalid width");
        Validator.validatePositiveDouble(height, "Invalid height");
       
        this.setCenter(x, y);
        
        this.width = width;
        this.height = height;
    }

    /**
     * Constructor with a Point for center
     *
     * @param center            The x-location of the center of the ellipse -- must be a valid point
     * @param width            The width of the ellipse -- must be greater or equal to zero.
     * @param height            The height of the ellipse -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Ellipse(Point center,  double width, double height) throws ShapeException {
        Validator.validatePositiveDouble(width, "Invalid width");
        Validator.validatePositiveDouble(height, "Invalid height");
       
        if (center==null)
            throw new ShapeException("Invalid center point");

        this.setCenter(center);
        
        this.width = width;
        this.height = height;
    }

    

    /**
     * @return  The width of the ellipse
     */
    public double getWidth() { return width; }

    
    /**
     * @return  The height of the ellipse
     */
    public double getHeight() { return height; }

      
    
    
    

    @Override
    public void move(double deltaX, double deltaY) throws ShapeException {
    	this.move(deltaX, deltaY);
    }
    
    @Override
    public void scale(double scaleFactor) throws ShapeException {
        Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        width *= scaleFactor;
        height *= scaleFactor;
    }

    /**
     * @return  The area of the ellipse.
     */
    @Override
    public double computeArea() {  		
    	//  Area of an ellipse = pi * (width/2) * (height/2)   	  	
    	AreaCalculator areaHelper = new AreaCalculator();
    	return areaHelper.computeEllipseArea(width, height);
    }

}