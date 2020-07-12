package e3d.d3;

public class Transform3 {

		public double[] values;
	    public Transform3(double[] values) {
	        this.values = values;
	    }
	    
	    public Transform3(double xx,double xy,double xz,double yx,double yy,double yz,double zx,double zy,double zz) {
	        this.values = new double[]{xx, xy, xz, yx, yy, yz, zx, zy, zz};
	    }
	    
	    public Transform3 multiply(Transform3 other) {
	        double[] result = new double[9];
	        for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 3; col++) {
	                for (int i = 0; i < 3; i++) {
	                    result[row * 3 + col] +=
	                        this.values[row * 3 + i] * other.values[i * 3 + col];
	                }
	            }
	        }
	        return new Transform3(result);
	    }
	    
	    public Vector3 transform(Vector3 in) {
	    	return new Vector3(
	        	in.x * values[0] + in.y * values[3] + in.z * values[6],
	           	in.x * values[1] + in.y * values[4] + in.z * values[7],
	           	in.x * values[2] + in.y * values[5] + in.z * values[8]
	        	);	 
	    }
	
	    public static Transform3 rotation(double x, double y, double z) {
	    	double cx = Math.cos(x), cy = Math.cos(y), cz = Math.cos(z), sx = Math.sin(x), sy = Math.sin(y), sz = Math.sin(z);
	    	return new Transform3(cz, sz, 0, -sz, cz, 0, 0, 0, 1).multiply(new Transform3(cy, 0.0, sy, 0.0, 1.0, 0.0, -sy, 0.0, cy)).multiply(new Transform3(1, 0, 0, 0, cx, sx, 0, -sx, cx));
	    }
	    public static Transform3 rotation(Rotation3 r) {
	    	return rotation(r.x, r.y, r.z);
	    }
	    public Vector3 right() {
	    	return new Vector3(values[0], values[1], values[2]);
	    }
	    public Vector3 top() {
	    	return new Vector3(values[3], values[4], values[5]);
	    }
	    public Vector3 fwd() {
	    	return new Vector3(values[6], values[7], values[8]);
	    }
}


