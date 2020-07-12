package e3d.d3;

public class Vector3 implements ThreeDimensions<Vector3> {
	public double x = 0, y = 0, z = 0;
	
	/**
	 * Creates [x, y, z]
	 * @param x @param y @param z Cartesian coordinates
	 */
	public Vector3(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	/**
	 * Creates [0, 0, 0]
	 */
	public Vector3() {}
	
	@Override
	public void x(double x) {
		this.x = x;
	}
	@Override
	public double x() {
		return x;
	}
	@Override
	public void y(double y) {
		this.y = y;
	}
	@Override
	public double y() {
		return y;
	}
	@Override
	public void z(double z) {
		this.z = z;
	}
	@Override
	public double z() {
		return z;
	}
	/* (non-Javadoc)
	 * @see e3d.d3.ThreeDimensions#create(double, double, double)
	 */
	@Override
	public Vector3 create(double x, double y, double z) {
		return new Vector3(x, y, z);
	}
	
	
}
