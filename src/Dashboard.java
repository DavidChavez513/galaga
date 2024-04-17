import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;



public class Dashboard extends JPanel{
	private Image backgroundImage;

    public Dashboard() {
        try {
            this.backgroundImage = ImageIO.read(new File("../assets/layout-Galaga.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0,this.getWidth(), this.getHeight(), this);
    }

}