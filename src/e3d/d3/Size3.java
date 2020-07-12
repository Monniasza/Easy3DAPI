package e3d.d3;

public class Size3 {
	public int x,y,z;

	public Size3(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	/**
	 * Get position of given value using three numbers
	 * @param x @param y @param z position
	 * @return position for array
	 */
	public int getArrPos(int X, int Y, int Z) {
		return X + Y*x+ Z*x*y;
	}
	public int getArrPos(Size3 p) {
		return p.x + p.y*x+ p.z*x*y;
	}

}
