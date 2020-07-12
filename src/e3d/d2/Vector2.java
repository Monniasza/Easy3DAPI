/**
 * 
 */
package e3d.d2;

/**
 * @author oskar
 *
 */
public class Vector2 implements TwoDimensions<Vector2> {
	public double x,y;
	
	private Vector2(double xx, double yy) {
		x = xx;
		y = yy;
	}
	
	/**
	 * Creates two-dimensional vector using Cartesian coordinates
	 * @param x horizontal coordinate
	 * @param y vertical coordinate
	 * @return newly created vector
	 */
	public static Vector2 newCartesian(double x, double y) {
		return new Vector2(x,y);
	}
	
	/**
	 * Creates two-dimensional vector using angle and radius
	 * @param r radius
	 * @param a angle in radians
	 * @return newly created vector
	 */
	public static Vector2 newPolarRadians(double r, double a) {
		return new Vector2(r*Math.cos(a), r*Math.cos(a));
	}
	
	/**
	 * Creates two-dimensional vector using angle and radius
	 * @param r radius
	 * @param a angle in degrees
	 * @return newly created vector
	 */
	public static Vector2 newPolarDegrees(double r, double a) {
		return newPolarRadians(r, Math.toDegrees(a));
	}

	/* (non-Javadoc)
	 * @see e3d.d2.TwoDimensions#x(double)
	 */
	@Override
	public void x(double xx) {
		x = xx;	
	}

	/* (non-Javadoc)
	 * @see e3d.d2.TwoDimensions#x()
	 */
	@Override
	public double x() {
		return x;
	}

	/* (non-Javadoc)
	 * @see e3d.d2.TwoDimensions#y(double)
	 */
	@Override
	public void y(double yy) {
		y = yy;
	}

	/* (non-Javadoc)
	 * @see e3d.d2.TwoDimensions#y()
	 */
	@Override
	public double y() {
		return y;
	}

	/* (non-Javadoc)
	 * @see e3d.d2.TwoDimensions#create(double, double)
	 */
	@Override
	public Vector2 create(double x, double y) {
		// TODO Auto-generated method stub
		return newCartesian(x, y);
	}
	
	
}
