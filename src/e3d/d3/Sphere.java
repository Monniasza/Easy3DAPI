package e3d.d3;

public class Sphere implements Shape3 {
	public Vector3 pos;
	public double size;
	
	public Sphere() {
		pos = new Vector3(0,0,0);
		size = 1;
	}

	public Sphere(Vector3 pos, double size) {
		super();
		this.pos = pos;
		this.size = size;
	}

	@Override
	public double vol() {
		return 3*Math.PI*size*size*size/4;
	}

	@Override
	public double surface() {
		return 4*Math.PI*size*size;
	}

	@Override
	public boolean contains(Vector3 v) {
		return false;
	}

	@Override
	public Vector3 pushOut(Vector3 point) {
		if(contains(point)) {
			
		}
		return pos = new Vector3(0,0,0);
	}

}
