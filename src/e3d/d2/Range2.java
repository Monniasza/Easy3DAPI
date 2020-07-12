/**
 * 
 */
package e3d.d2;

/**
 * @author oskar
 *
 */
public class Range2 {
	public Vector2 a, b;
	
	
	private Range2(Vector2 a, Vector2 b) {
		super();
		this.a = a;
		this.b = b;
	}
	public static Range2 centeredAt(Vector2 center, Vector2 size) {
		Vector2 half = size.div1(2);
		Vector2 a = center.sub1(half);
		Vector2 b = center.add1(half);
		return new Range2(a, b);
	}
	public static Range2 sizeCorner(Vector2 size, Vector2 corner) {
		Vector2 a = corner.cloneV();
		Vector2 b = corner.add1(size);
		return new Range2(a, b);
	}
	public static Range2 corners(Vector2 a, Vector2 b) {
		return new Range2(a, b);
	}
	

}
