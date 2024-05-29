import java.awt.Color;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import java.util.Random;


public class Main extends JFrame implements KeyListener{

	/**
	 * 
	 */

	private Player player1;
	//private Dashboard mainView;

	private final String PATH_BACKGROUND = "~/assets/layout-Galaga.png";


	public void initScreen() {
		setSize(800, 800);
		setTitle("GALAGA BY DavidChavez513");
		setVisible(true);
		setLayout(null);
		this.addKeyListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.player1 = new Player(35, 150, 64, 96, 20, 100, 3, this);
		this.getContentPane().setBackground(Color.BLACK);
		
		this.add(player1.printSprite());

		
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().initScreen();
			}
		});
	}

	public void paintEnemy() {
		Random random = new Random();
		int x = random.nextInt(getWidth() - 64); // generate random x coordinate within the width of the frame
		int y = random.nextInt(getHeight() - 96); // generate random y coordinate within the height of the frame
		Enemy enemy1 = new Enemy(x, y, 64, 96, 20, 100, 3, this);
		this.add(enemy1.printSprite());
		enemy1.start();
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub

		System.out.println("Player location: " + player1.getX() + ", " + player1.getY());
		//System.out.println("Player limits: \n up:" + player1.getLimUp() + ", \n down:" + player1.getLimDown() + ", \n left:" + player1.getLimLeft() + ", \n rigth:" + player1.getLimRight());

		if (e.getKeyChar() == 'a') player1.moveLeft();
		if (e.getKeyChar() == 'd') player1.moveRight();
		if (e.getKeyChar() == 'w') player1.moveUp();
		if (e.getKeyChar() == 's') player1.moveDown();
		if (e.getKeyChar() == 'e') player1.shoot();

		player1.calculateLimits();
	}
	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Key Pressed: " + e.getKeyChar());
	}
	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Key Released: " + e.getKeyChar());
	}
}
