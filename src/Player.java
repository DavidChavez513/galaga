import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.File;

public class Player implements KeyListener {
	private int x;
	private int y;
	private int width;
	private int height;

	private ImageIcon sprite;


	public Player(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		try {
			this.sprite = new ImageIcon(getClass().getResource("assets/player.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public void draw(Graphics g) {
		g.drawImage(sprite.getImage(), x, y, width, height, null);
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A) {
			move(-1, 0);
		} else if (e.getKeyCode() == KeyEvent.VK_D) {
			move(1, 0);
		} else if (e.getKeyCode() == KeyEvent.VK_W) {
			move(0, -1);
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			move(0, 1);
		}
	}
}
