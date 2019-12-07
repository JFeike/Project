package Prototyp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class mazeVertical {
	 
	 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	 int h = (int) screenSize.getHeight();
	 int w = (int) screenSize.getWidth();
	 BufferedImage bush = ImageIO.read(new File("Project/src/resources/busch.png"));
	 
	  public mazeVertical(int startAt, int positionX, int distanceHeight, Graphics graphics) throws IOException {
		  Graphics g = graphics;
		  for (int i = startAt; i < (h-distanceHeight); i += 47) {
			  	Wall wall = new Wall(bush, positionX, i); 
				wall.draw(g); }
	  }
	  
}
