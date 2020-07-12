/**
 * 
 */
package e3d.d3.geom;

import e3d.d3.Vector3;

/**
 * @author oskar
 *
 */
public class ClosedLine3 {
	public Vector3 A, B;

	public ClosedLine3(Vector3 a, Vector3 b) {
		super();
		A = a;
		B = b;
	}
	
	
	public ClosedLine3 nearestApproach(ClosedLine3 other) {
		return toOpenLine().nearestApproach(other.toOpenLine());
	}
	
	public OpenLine3 toOpenLine() {
		OpenLine3 l = new OpenLine3();
		Vector3 dir = B.clone();
		dir.substract(A);
		dir.divide(dir.pythagoreanTheorem());
		l.start = A.clone();
		l.dir = dir;
		return l;
	}
}
