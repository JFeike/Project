package Prototyp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class mazeHorizontal {

	 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	 int h = (int) 900;
	 int w = (int) 1600;
	 BufferedImage bush = ImageIO.read(new File("src/resources/lab.png"));
	 
	  public mazeHorizontal(int startAt, int positionY, int distanceWidth, Graphics graphics) throws IOException {
		  Graphics g = graphics;  
		    for (int i = startAt; i < (w-distanceWidth); i += 30) {
		        Wall wall = new Wall(bush, i, positionY); 
		    	wall.draw(g); }
	  }
	  
}
