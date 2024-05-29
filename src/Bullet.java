import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Bullet extends Thread{
	private int x; // x-coordinate of the bullet
	private int y; // y-coordinate of the bullet
	private int speed; // speed of the bullet
	private JLabel hitboxBullet;

	public Bullet(int x, int y, int speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.hitboxBullet = new JLabel();
	}

	public JLabel printSprite() {
		this.hitboxBullet.setBounds(x, y, 20, 15);
		this.hitboxBullet.setBackground(Color.RED);
		this.hitboxBullet.setOpaque(true);
		this.hitboxBullet.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		return this.hitboxBullet;
	}

	public void move() {
		// Update the position of the bullet based on its speed
		y -= speed;
		// Update the position of the bullet in the GUI
		this.hitboxBullet.setLocation(x, y);
	}

	public void run() {
		while (y > 0) {
			move();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.hitboxBullet.setVisible(false);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
