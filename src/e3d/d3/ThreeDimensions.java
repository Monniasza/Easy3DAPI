/**
 * 
 */
package e3d.d3;

/**
 * @author oskar
 *
 */
@SuppressWarnings("rawtypes")
public interface ThreeDimensions<T extends ThreeDimensions> {
	public void x(double x);
	public double x();
	public void y(double y);
	public double y();
	public void z(double z);
	public double z();
	
	/**
	 * Create new vector in the same type
	 * @param x @param y @param z Cartesian coordinates
	 * @return newly created vector
	 */
	public T create(double x, double y, double z);
	default public T create() {return create(0, 0, 0);}
	default public Vector3 cloneV() {
		return new Vector3(x(), y(), z());
	}
	default public Rotation3 cloneR() {
		return new Rotation3(x(), y(), z());
	}
	default public double pythagoreanTheoremSQR() {
		return x()*x() + y()*y() + z()*z();
	}
	default public double pythagoreanTheorem() {
		return Math.sqrt(pythagoreanTheoremSQR());
	}
	
	/**
	 * Add a value, modifying this object. This method is chainable
	 * @param a value to add
	 * @return this object
	 */
	@SuppressWarnings("unchecked")
	default public T add(T a) {
		x(x() + a.x());
		y(y() + a.y());
		x(z() + a.z());
		return (T) this;
	}
	
	/**
	 * Subtract a value, modifying this object. This method is chainable
	 * @param a value to add
	 * @return this object
	 */
	@SuppressWarnings("unchecked")
	default public T sub(T a) {
		x(x() - a.x());
		y(y() - a.y());
		x(z() - a.z());
		return (T) this;
	}
	
	/**
	 * Mutiply individual ingredients, modifying this object. This method is chainable
	 * @param a value to add
	 * @return this object
	 */
	@SuppressWarnings("unchecked")
	default public T ingmul(T a) {
		x(x() * a.x());
		y(y() * a.y());
		x(z() * a.z());
		return (T) this;
	}
	/**
	 * Divide individual ingredients, modifying this object. This method is chainable
	 * @param a value to add
	 * @return this object
	 */
	@SuppressWarnings("unchecked")
	default public T ingdiv(T a) {
		x(x() / a.x());
		y(y() / a.y());
		x(z() / a.z());
		return (T) this;
	}
	
	/**
	 * Mutiply individual ingredients, modifying this object. This method is chainable
	 * @param a value to add
	 * @return this object
	 */
	@SuppressWarnings("unchecked")
	default public T mul(double a) {
		x(x() * a);
		y(y() * a);
		x(z() * a);
		return (T) this;
	}
	
	/**
	 * Mutiply individual ingredients, modifying this object. This method is chainable
	 * @param a value to add
	 * @return this object
	 */
	@SuppressWarnings("unchecked")
	default public T div(double a) {
		x(x() / a);
		y(y() / a);
		x(z() / a);
		return (T) this;
	}
	
	/**
	 * Negates the value, modifying this object. This method is chainable 
	 * @return this object
	 */
	 @SuppressWarnings("unchecked")
	 default public T neg() {
		x(-x()); y(-y()); z(-z());
		return (T)this;
	}
	
	
	/**
	 * Add a value to the new object
	 * @param a value to add
	 * @return new object
	 */
	 
	default public T add1(T a) {	
		return create(x() + a.x(), y() + a.y(), z() + a.z());
	}
	
	/**
	 * Subtract a value from the new object
	 * @param a value to subtract
	 * @return new object
	 */
	default public T sub1(T a) {
		return create(x() - a.x(), y() - a.y(), z() - a.z());
	}
	
	/**
	 * Mutiply individual ingredients with the new object.
	 * @param set of three multipliers
	 * @return new object
	 */
	default public T ingmul1(T a) {
		return create(x() * a.x(), y() * a.y(), z() * a.z());
	}
	/**
	 * Divide individual ingredients with the new object.
	 * @param set of three multipliers
	 * @return new object
	 */
	default public T ingdiv1(T a) {
		return create(x() / a.x(), y() / a.y(), z() / a.z());
	}
	
	/**
	 * Multiply new vector
	 * @param mutiplier
	 * @return new object
	 */
	default public T mul1(double a) {
		return create(x() * a, y() * a, z() * a);
	}
	
	/**
	 * Divide new vector
	 * @param divider
	 * @return new object
	 */
	default public T div1(double a) {
		return create(x() / a, y() / a, z() / a);
	}
	
	/**
	 * Negate values, creating a new object.
	 * @return new object
	 */
	default public T neg1() {
		return create(-x(), -y(), -z());
	}
	
	default public double dot(T a){
		return ingmul1(a).sum();
	}
	
	/**
	 * Adds all values in the vector
	 * @return sum
	 */
	default public double sum() {
		return x() + y() + z();
	}
	
	default public double distance(T a) {
		return sub1(a).pythagoreanTheorem();
	}
	
	/**
	 * Normalize, modifying this object. This method is chainable
	 * @return this object
	 */
	default public T norm() {
		return div(pythagoreanTheorem());
	}
	/**
	 * Mutiply individual ingredients, modifying this object. This method is chainable.
	 * @return new object
	 */
	default public T norm1() {
		return div1(pythagoreanTheorem());
	}
	
	/**
	 * Return angle to the vector
	 * @param vec target
	 * @return angle in radians
	 */
	default public double angle(T vec) {
		return Math.acos((dot(vec))/(pythagoreanTheorem()*vec.pythagoreanTheorem()));
	}
	
	default public boolean isParallel(T vec) {
		//Check for zeroes
		if(vec.x() == 0) {
			if(vec.z() == 0) return true;
			return y() / vec.y() == z() / vec.z();
		}else if(vec.y() == 0) {
			if(vec.x() == 0) return true;
			if(vec.z() == 0) return true;
			return x() / vec.x() == z() / vec.z();
		}else if(vec.z() == 0) return y() / vec.y() == z() / vec.z();
		
		T x = ingdiv1(vec);
		return x.x() == x.y() && x.y() == x.z();	
	}
}
