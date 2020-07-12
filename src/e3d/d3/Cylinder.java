/**
 * 
 */
package e3d.d3;

/**
 * @author oskar
 *
 */
public class Cylinder {
	public Vector3 pos;
	public Vector3 dir;
	public double radius, length;
	public Cylinder(Vector3 pos, Vector3 dir, double radius, double length) {
		super();
		this.pos = pos;
		this.dir = dir;
		this.radius = radius;
		this.length = length;
	}
	
	
	public boolean isParallel(Cylinder cyl) {
		return dir.isParallel(cyl.dir);
	}

}
