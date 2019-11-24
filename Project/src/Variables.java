

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Variables {
	
	static Graphic l;
	static JFrame jf;
	static BufferedImage player;
	static BufferedImage key;
	static BufferedImage wall;
	static int playerX = 50;
	static int playerY = 50;
	static int key1X = 600;
	static int key1Y = 600;
	static int key2X = 900;
	static int key2Y = 200;
	static int wall1X = 450;
	static int wall1Y = 200;
	static int keycount = 0;
	static boolean keycol = false;
	static int playerSpeed = 10;
	static JLabel keyamount;
	static boolean moveup = false, movedown= false, moveleft= false, moveright= false;
	
	
	
	
	public Variables() {
		
		try {
			player = ImageIO.read(new File("material/player.png"));
			key = ImageIO.read(new File("material/key.png"));
			wall = ImageIO.read(new File("material/wall.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bild nicht geladen!!!!");
		}
	}
}
