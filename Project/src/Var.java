import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Var {
	
	static JFrame jf = new JFrame();
	static JLabel keys = new JLabel("x " + Var.keycount);
	static BufferedImage player;
	static int playerLocX = 0;
	static int playerLocY = 80;
	static BufferedImage wall;
	static int wallLocX = 300;
	static int wallLocY = 300;
	static BufferedImage Akey;
	static int AkeyLocX = 700;
	static int AkeyLocY = 900;
	static BufferedImage Bkey;
	static int BkeyLocX = 100;
	static int BkeyLocY = 1200;
	static BufferedImage fog;
	static int fogLocX = 0;
	static int fogLocY = 0;
	static boolean fogVisible = true;
	static int headerLocX = 0;
	static int headerLocY = 70;
	static int playerSpeed = 20;
	static boolean moveup, movedown, moveleft, moveright;
	static int keycount = 0;

	public Var() {
		
		try {
			
		player = ImageIO.read(new File("material/player.png"));
		wall = ImageIO.read(new File("material/wall.png"));
		Akey = ImageIO.read(new File("material/key.png"));
		Bkey = ImageIO.read(new File("material/key.png"));		
		fog = ImageIO.read(new File("material/wall.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Fehler beim Bilder laden!");
		}

	}

}
