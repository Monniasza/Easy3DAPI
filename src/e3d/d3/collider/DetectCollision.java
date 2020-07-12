/**
 * 
 */
package e3d.d3.collider;

import e3d.d2.Range2;
import e3d.d2.Vector2;
import e3d.d3.*;

/**
 * @author oskar
 *
 */
public class DetectCollision {

	/**
	 * 
	 */
	public DetectCollision() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean sphereSphere(Sphere A, Sphere B) {
		return A.size+B.size < A.pos.distance(B.pos);
	}
	
	
	
	
	//Below are methods used to detect near perfectly cylinder collision
	
	public static cylinderCylinder(Cylinder A, Cylinder B) { //http://www.sksaha.com/sites/default/files/upload_data/documents/IROS_2013.pdf
		if(testInfCyl(A, B)) {
			if(A.isParallel(B)) {
				//Perform Simple Parallel Cylinder test
				//Choose XY/XZ/YZ planes
				Range2 cyl1, cyl2;
				if(A.dir.x == 0) {
					cyl1 = Range2.centeredAt(Vector2.newCartesian(A.pos.y, A.pos.z), Vector2.newCartesian(A.radius * 2, A.length));
					cyl2 = Range2.centeredAt(Vector2.newCartesian(B.pos.y, B.pos.z), Vector2.newCartesian(B.radius * 2, B.length));
					return rangeRange(cyl1, cyl2);
				}else if(A.dir.y == 0) {
					
				}else {
					
				}
			}else {
				
			}
		}else {
			return false;
		}
	}
	private static  boolean testInfCyl(Cylinder A, Cylinder B) {
		
	}
	
	
	
	
	//2D
	public static boolean rangeRange(Range2 a, Range2 b)
}
