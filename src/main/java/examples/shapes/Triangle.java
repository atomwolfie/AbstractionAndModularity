package examples.shapes;

/**
 * Circle
 *
 * This class represents circle objects that can be moved and scales.  Users of a circle can also get its area.
 *
 */
@SuppressWarnings("WeakerAccess")
public class Triangle extends Shape {
    private Point center;
    private double height;
    private double baseLength;
    private double t1, t2, l1, l2, r1,r2;

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the circle -- must be a valid double
     * @param y                 The y-location of the center of the circle
     * @param t1				the x location of the top most point of the triangle	
     * @param t2				the y location of the top most point of the triangle
     * @param l1				the x location of the left most point of the triangle
     * @param l2				the y location of the left most point of the triangle
     * @param r1				the x location of the right most point of the triangle
     * @param r2				the y location of the right most point of the triangle
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Triangle(double x, double y, double t1, double t2, double l1, double l2, double r1, double r2) throws ShapeException {
        Validator.validatePositiveDouble(t1, "Invalid point");
        Validator.validatePositiveDouble(t2, "Invalid point");
        Validator.validatePositiveDouble(l1, "Invalid point");
        Validator.validatePositiveDouble(l2, "Invalid point");
        Validator.validatePositiveDouble(r1, "Invalid point");
        Validator.validatePositiveDouble(r2, "Invalid point");
               
        Validator.validateTriangle(t1, t2, l1, l2, r1, r2, "Invalid Tringle");
        
 
        center = new Point(x, y);
        this.t1 = t1;
        this.t2 = t2;
        this.l1 = l1;
        this.l2 = l2;
        this.r1 = r1;
        this.r2 = r2;
    }

    /**
     * Constructor with a Point for center
     *
     * @param center            The x-location of the center of the triangle -- must be a valid point
     * @param t1				the x location of the top most point of the triangle	
     * @param t2				the y location of the top most point of the triangle
     * @param l1				the x location of the left most point of the triangle
     * @param l2				the y location of the left most point of the triangle
     * @param r1				the x location of the right most point of the triangle
     * @param r2				the y location of the right most point of the triangle
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Triangle(Point center, double t1, double t2, double l1, double l2, double r1, double r2) throws ShapeException {
    	Validator.validatePositiveDouble(t1, "Invalid point");
        Validator.validatePositiveDouble(t2, "Invalid point");
        Validator.validatePositiveDouble(l1, "Invalid point");
        Validator.validatePositiveDouble(l2, "Invalid point");
        Validator.validatePositiveDouble(r1, "Invalid point");
        Validator.validatePositiveDouble(r2, "Invalid point");
                
        
        if (center==null)
            throw new ShapeException("Invalid center point");

        this.center = center;
        this.t1 = t1;
    }

    /**
     * @return  The center of the circle
     */
    public Point getCenter() { return center; }

    /**
     * @return  The T1 point of the triangle
     */
    public double getT1() { return t1; }
    /**
     * @return  The t2 point of the triangle
     */
    public double getT2() { return t2; }
    /**
     * @return  The L1 point of the triangle
     */
    public double getL1() { return l1; }
    /**
     * @return  The l2 point of the triangle
     */
    public double getL2() { return l2; }
    /**
     * @return  The r1 point of the triangle
     */
    public double getR1() { return r1; }
    /**
     * @return  The r2 point of the triangle
     */
    public double getR2() { return r2; }
    /**
     * @return  The height of the triangle
     */
    public double getHeight() { return height; }

    
    
    
    
    
    
    @Override
    public void move(double deltaX, double deltaY) throws ShapeException {
        center.move(deltaX, deltaY);
    }

    
    
    @Override
    public void scale(double scaleFactor) throws ShapeException {
        Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        t1 *= scaleFactor;
        t2 *= scaleFactor;
        l1 *= scaleFactor;
        l2 *= scaleFactor;
        r1 *= scaleFactor;
        r2 *= scaleFactor;
    }

    
    /**
     * @return  The height of the triangle.
     */
    public double computeHeight() {
        
        //figure out how to calculate height from 3 points
        
        return 0;
    }
    
    
    /**
     * @return  The base length of the triangle.
     */
    public double computeBaseLength() {
        
        //figure out how to calculate base length from 3 points
        
        return t2 - ((l2 + r2)/2);
    }
    
    
	@Override
	public double computeArea() {
// Area of Triangle = (height * base ) / 2
    	    	
    	baseLength = computeBaseLength();
    	height = computeHeight();
    	
    	return (baseLength * height)/2;
	}

}
