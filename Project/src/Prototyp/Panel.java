package Prototyp;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import Prototyp.A_GraphicSystem;

public class Panel extends JPanel implements A_GraphicSystem, A_InputSystem, MouseListener
{
  // ...ok...
  private static final long serialVersionUID = 1L;
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  int w = (int) screenSize.getWidth();
  int h = (int) screenSize.getHeight();
  
  // UserInput variables
  //
  private boolean newInput = false;
  private int     mousePressedX, mousePressedY, 
                  mouseMovedX, mouseMovedY, mouseButton;
  private char    keyPressed;
	
  // GraphicsSystem variables
  //
  private GraphicsConfiguration graphicsConf = 
    GraphicsEnvironment.getLocalGraphicsEnvironment().
    getDefaultScreenDevice().getDefaultConfiguration();
  private BufferedImage imageBuffer;
  private Graphics      graphics;
	
  // Graphic variables for drawing
  //
  private static final Color COLOR_DOT  = Color.black;
  private static final int   RADIUS_DOT = 10;
	
  public Panel() throws IOException
  { 
	this.setSize(w,h);  
	imageBuffer = graphicsConf.createCompatibleImage(
			        this.getWidth(), this.getHeight());	 
	graphics = imageBuffer.getGraphics();

	// initialize Listeners
	this.addMouseListener(this);
  }
  
  public void clear()
  { graphics.setColor(Color.LIGHT_GRAY);
    graphics.fillRect(0, 0, w, h);
  }
  
  public void draw(A_GameObject dot) throws IOException
  {
	BufferedImage tile = ImageIO.read(new File("Project/src/resources/Background.png"));  
	
	int tileHeight = 200;
	int tileWidth = 200;
	int h = (int) screenSize.getHeight();
	int w = (int) screenSize.getWidth();
    for (int y = 0; y < h; y += tileHeight) {
        for (int x = 0; x < w; x += tileWidth) {
	graphics.drawImage(tile,x,y,null); } }
	
    // MAZE
    // VER int startAt, int positionX, int distanceHeight, Graphics graphics
    // HOR int startAt, int positionY, int distanceWidth, Graphics graphics 
    
    mazeVertical mv1 = new mazeVertical(0, 50, 120, graphics);
    mazeHorizontal mh1 = new mazeHorizontal(70,(h-120),120,graphics);
    mazeVertical mv2 = new mazeVertical(60,(w-120),120,graphics);
    mazeHorizontal mh2 = new mazeHorizontal(160,60,90,graphics);
    mazeVertical mv3 = new mazeVertical(60,160,200,graphics);
    mazeHorizontal mh3 = new mazeHorizontal(160,(h-230),180,graphics);
    mazeVertical mv4 = new mazeVertical(150,(w-240),250,graphics);
    mazeHorizontal mh4 = new mazeHorizontal(280,150,250,graphics);
    
    // MAZE END
    
    // UFO
    BufferedImage ufo = ImageIO.read(new File("Project/src/resources/ufo.png"));
    graphics.drawImage(ufo,(w/2),(h/2),null);
    
	int x = (int)dot.x-RADIUS_DOT;
	int y = (int)dot.y-RADIUS_DOT;
	int r = RADIUS_DOT*2;
	
	graphics.setColor(COLOR_DOT);
	graphics.fillOval(x, y, r, r);
	graphics.setColor(Color.BLACK);
	graphics.drawOval(x,y,r,r);
	
  }
  
  
  public void redraw()
  { this.getGraphics().drawImage(imageBuffer, 0, 0, this);
  }
  
  
  public void mousePressed(MouseEvent evt)
  {
	// an input Event occurs
	newInput = true;
	
    mousePressedX = evt.getX();
    mousePressedY = evt.getY();
    mouseButton   = evt.getButton();  
  }  
  
  
  public UserInput getUserInput()
  { 
    if(!newInput) return null;
    
    newInput = false;
    return new UserInput(mousePressedX,mousePressedY, 
	  	                   mouseMovedX,mouseMovedY,mouseButton,keyPressed);
  }
  
  
  // direct the Avatar
  public void command(A_GameObject av, UserInput input)
  {
    Player avatar = (Player)av;
    avatar.setDestination(input.mousePressedX, input.mousePressedY);    
  }

  
  public void mouseEntered(MouseEvent evt){}
  public void mouseExited(MouseEvent evt){}
  public void mouseClicked(MouseEvent evt){}
  public void mouseReleased(MouseEvent evt){}
}
