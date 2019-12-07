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
  int w = (int) 1600;
  int h = (int) 900;
  
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
	BufferedImage tile = ImageIO.read(new File("src/resources/Background.png"));  
	
	int tileHeight = 200;
	int tileWidth = 200;
	int h = (int) 900;
	int w = (int) 1600;
    for (int y = 0; y < h; y += tileHeight) {
        for (int x = 0; x < w; x += tileWidth) {
	graphics.drawImage(tile,x,y,null); } }
	
    // MAZE
    // VER int startAt, int positionX, int distanceHeight, Graphics graphics
    // HOR int startAt, int positionY, int distanceWidth, Graphics graphics 
    
    mazeHorizontal mh1 = new mazeHorizontal(0,50,1450,graphics);
    mazeVertical mv1 = new mazeVertical(50,120,650,graphics);
    mazeVertical mv2 = new mazeVertical(h-580,120,200,graphics);
    mazeVertical mv3 = new mazeVertical(130,45,200,graphics);
    mazeHorizontal mh2 = new mazeHorizontal(h-700,50,1000,graphics);
    mazeHorizontal mh3 = new mazeHorizontal(70,450,1480,graphics);
    mazeVertical mv4 = new mazeVertical(50,200,400,graphics);
   //mazeVertical mv5 = new mazeVertical(500,350,350,graphics);
    mazeHorizontal mh4 = new mazeHorizontal(h-750,600,1400,graphics);
    mazeHorizontal mh5 = new mazeHorizontal(h-1000,750,1550,graphics);
    //mazeHorizontal mh6 = new mazeHorizontal(250,250,300,graphics);
    mazeHorizontal mh6 = new mazeHorizontal(h-600,140,800,graphics);
    mazeVertical mv5 = new mazeVertical(150,300,600,graphics);
    mazeVertical mv6 = new mazeVertical(350,300,200,graphics);
  //  mazeVertical mv7 = new mazeVertical(500,500,300,graphics);
    mazeHorizontal mh7 = new mazeHorizontal(h-200,50,600,graphics);
    mazeVertical mv7 = new mazeVertical(50,1000,400,graphics);
    mazeVertical mv8 = new mazeVertical(140,900,500,graphics);
    mazeVertical mv9 = new mazeVertical(140,800,500,graphics);
    mazeVertical mv10 = new mazeVertical(230,400,600,graphics);
    //mazeVertical mv11 = new mazeVertical(290,500,600,graphics);
    mazeHorizontal mh8 = new mazeHorizontal(h-500,210,800,graphics);
    mazeHorizontal mh9 = new mazeHorizontal(h-500,300,900,graphics);
    mazeVertical mv11 = new mazeVertical(400,400,200,graphics);
    mazeHorizontal mh10 = new mazeHorizontal(h-500,400,900,graphics);
    
    
    
    
    
 
    // MAZE END
    
    // UFO
    BufferedImage ufo = ImageIO.read(new File("src/resources/ufo.png"));
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
