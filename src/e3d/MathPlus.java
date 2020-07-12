package e3d;

public class MathPlus {
	static public double deinterp(double start, double end, double value) {
		return (end-value)/(end-start);
	}
	static public double interp(double start, double end, double progress) {
		return (progress * end)+((1-progress)*start);
	}
	static public double remap(double s1, double e1, double s2, double e2, double value) {
		return interp(s2, e2, deinterp(s1, e1, value));
	}
	static public double interp(Color start, Color end, double progress) {
		
	}
}
