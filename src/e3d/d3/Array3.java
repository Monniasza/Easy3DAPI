/**
 * 
 */
package e3d.d3;

/**
 * @author oskar
 *
 */
public class Array3<T> {
	Size3 size;
	Object[] data;
	/**
	 * 
	 */
	public Array3(int x, int y, int z) {
		size = new Size3(x,y,z);
		data = new Object[x*y*z];
		for(int i = 0; i < x*y*z; i++) {
			data[i] = null;
		}
	}
	public void set(int x, int y, int z, T d) {
		data[getPos(x,y,z)] = d;
	}
	public int getPos(int x, int y, int z) {
		return size.getArrPos(x, y, z);
	}
	public void set(Size3 p, T d) {
		data[getPos(p)] = d;
	}
	public int getPos(Size3 p) {
		return size.getArrPos(p);
	}
}
