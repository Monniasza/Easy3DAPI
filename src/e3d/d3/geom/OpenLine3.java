/**
 * 
 */
package e3d.d3.geom;

import e3d.d3.Vector3;

/**
 * @author oskar
 *
 */
public class OpenLine3 implements Line3 {
	public Vector3 start, dir;
	/**
	 * 
	 */
	public OpenLine3() {
		// TODO Auto-generated constructor stub
	}
	public OpenLine3(Vector3 start, Vector3 dir) {
		super();
		this.start = start;
		this.dir = dir;
	}
	public ClosedLine3 nearestApproach(OpenLine3 clone) {
		Vector3 normal = clone.dir.
		return null;
	}

}
