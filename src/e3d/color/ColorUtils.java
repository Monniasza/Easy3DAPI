/**
 * 
 */
package e3d.color;

/**
 * @author oskar
 *
 */
public class ColorUtils {
	public static final int 
		black = colorRGBA(0, 0, 0, 255),
		red = colorRGBA(255, 0, 0, 255),
		green = colorRGBA(0, 255, 0, 255),
		blue =	colorRGBA(0, 0, 255, 255),
		cyan = colorRGBA(0, 255, 255, 255),
		yellow = colorRGBA(255, 255, 0, 255),
		magenta = colorRGBA(255, 0, 255, 255),
		white =	colorRGBA(255, 255, 255, 255),
		gray = colorRGBA(128, 128, 128, 255);
	
	public static int colorRGBA(int r, int g, int b, int a) {
		return a*16777216 + r*65536 + g*256 + b;
	}

}
