/**
 * 
 */
package e3d.d3;

/**
 * @author oskar
 *
 */
public class Ray3 {
	public Vector3 from;
	private Ray3(Vector3 from, Vector3 dir) {
		super();
		this.from = from;
		this.dir = dir;
	}
	public Vector3 dir;
	/**
	 * 
	 */
	public Ray3() {
		// TODO Auto-generated constructor stub
	}

}
