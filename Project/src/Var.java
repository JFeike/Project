import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Var {
	
	static BufferedImage player;
	static int playerLocX = 0;
	static int playerLocY = 0;
	static int playerSpeed = 10;
	static boolean moveup, movedown, moveleft, moveright;
	static int MouseLocX;
	static int MouseLocY;

	
	public Var() {
		
		try {
			
		player = ImageIO.read(new File("material/player.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Fehler beim Bilder laden!");
		}

	}

}
