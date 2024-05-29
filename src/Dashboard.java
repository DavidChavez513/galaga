import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Dashboard
 */
public class Dashboard extends JPanel {

	private ImageIcon background;

	public Dashboard(String imagePath) {
		this.background = new ImageIcon(imagePath);
	}
	

	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		g.drawImage(background.getImage(), ALLBITS, ABORT, getFocusCycleRootAncestor());
	}

}