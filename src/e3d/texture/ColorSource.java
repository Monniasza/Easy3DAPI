/**
 * 
 */
package e3d.texture;

import java.awt.Color;

import e3d.d2.Vector2;

/**
 * @author oskar
 *
 */
public interface ColorSource {
	public Color getColor(Vector2 pos);
}
