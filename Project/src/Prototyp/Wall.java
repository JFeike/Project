package Prototyp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Wall{
	
	BufferedImage b;
	 int  X1;
	 int  Y1;
	 
	  public Wall(BufferedImage b_, int x_, int y_){
		  b =b_;  
		  X1 =x_;
		  Y1 =y_;
	  }
	  
	  public void draw(Graphics g) {
		  g.drawImage(b, X1, Y1, null);
	  }
	 
	  

}
