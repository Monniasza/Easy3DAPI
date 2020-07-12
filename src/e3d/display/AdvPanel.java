/**
 * 
 */
package e3d.display;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

/**
 * @author oskar
 *
 */
public class AdvPanel extends A2DObject {
	JPanel panel;
	/**
	 * 
	 */
	public AdvPanel(JPanel pane) {
		panel = pane;
	}
	/* (non-Javadoc)
	 * @see e3d.Renderable#render(e3d.Graphics2D)
	 */
	@Override
	public void render(Graphics g2d) {
		BufferedImage img = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
		Graphics g = img.createGraphics();
		panel.paint(g);
		//TODO Calculate vertices
		
	}
	
	

}
