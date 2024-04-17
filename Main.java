import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main extends JFrame{
	public void initScreen(Player player) {
		setSize(800, 600);
		setTitle("GALAGA BY DavidChavez513");
		setVisible(true);

		add(player.draw(getGraphics()));
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				

				Player player = new Player(400, 500, 50, 50);
				new Main().initScreen(player);
			}
		});
	}
}
