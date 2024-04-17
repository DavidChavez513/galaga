import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Player {

	private int x, y, width, height;
	private int limUp, limDown, limLeft, limRight;
	private int speed;
	private JLabel hitBox;
	private int health;
	private int score;
	private int lives;
	private boolean isDead;

	


	public Player(int x, int y, int width, int height, int speed, int health, int lives) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.health = health;
		this.lives = lives;
		this.score = 0;
		this.isDead = false;
		this.hitBox = new JLabel();
	}
	

	public JLabel printSprite() {
		ImageIcon playerIcon = new ImageIcon("assets/player.png");
		hitBox.setBounds(getX(), getY(), getWidth(), getHeight());
		hitBox.setIcon(playerIcon);
		
		// hitBox.setBackground(Color.RED);
		// hitBox.setOpaque(true);
		// Border lineBorder = BorderFactory.createLineBorder(Color.BLUE, 2);
		// hitBox.setBorder(lineBorder);
		
		return hitBox;
	}

	public void moveLeft() {
		if (getLimLeft() >= (getWidth() / 2) ) {
			System.out.println("LimLeft: " + getLimLeft() + " X: " + getX() + " Speed: " + getSpeed());
			setX(getX() - getSpeed());
		}
		this.hitBox.setLocation(getX(), getY());
	}

	public void moveRight() {
		if (getLimRight() <= 800){
			System.out.println("LimRight: " + getLimRight() + " X: " + getX() + " Speed: " + getSpeed());
			setX(getX() + getSpeed());
		}
		this.hitBox.setLocation(getX(), getY());
	}

	public void moveUp() {
		if (getLimUp() >= 0 + (getHeight() / 2)){
			System.out.println("LimUp: " + getLimUp() + " Y: " + getY() + " Speed: " + getSpeed());
			setY(getY() - getSpeed());
		}
		this.hitBox.setLocation(getX(), getY());
	}

	public void moveDown() {
		if (getLimDown() <= 720 + (getHeight() / 2)){
			System.out.println("LimDown: " + getLimDown() + " Y: " + getY() + " Speed: " + getSpeed());
			setY(getY() + getSpeed());
		}
		this.hitBox.setLocation(getX(), getY());
	}

	public void takeDamage(int damage) {
		this.health -= damage;
		if (this.health <= 0) {
			this.lives--;
			if (this.lives <= 0) {
				this.isDead = true;
			}
		}
	}

	public void calculateLimits() {
		this.limLeft = this.x + (this.width / 2);
		this.limRight = this.x + (this.width / 2) + this.height;
		this.limUp = this.y + (this.width / 2);
		this.limDown = this.y + (this.width / 2) + this.height;
	}

	// Getters and Setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	public int getLimUp() {
		return limUp;
	}

	public void setLimUp(int limUp) {
		this.limUp = limUp;
	}

	public int getLimDown() {
		return limDown;
	}

	public void setLimDown(int limDown) {
		this.limDown = limDown;
	}

	public int getLimLeft() {
		return limLeft;
	}

	public void setLimLeft(int limLeft) {
		this.limLeft = limLeft;
	}

	public int getLimRight() {
		return limRight;
	}

	public void setLimRight(int limRight) {
		this.limRight = limRight;
	}

}