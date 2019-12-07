package Prototyp;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class World
{
  private A_GraphicSystem graphicSystem;
  private A_InputSystem    inputSystem;
 // private PhysicsSystem physicsSystem;
  
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  int w = (int) screenSize.getWidth();
  int h = (int) screenSize.getHeight();
  
  //contains the games objects
  protected ArrayList<A_GameObject> gameObjects = new ArrayList<A_GameObject>();
  
  private UserInput userInput;
  
  private Player userDot;
  
  private Wall wall;
  
  
  public void init() throws IOException
  {
	BufferedImage a = ImageIO.read(new File("Project/src/resources/alien.png")); 
	userDot = new Player(20,20);
	//gameObjects.set(0,userDot);
  }
  
  public void run() throws IOException
  {
	long lastTick = System.currentTimeMillis();
	while(true)
	{
	  // calculate elapsed time
	  //
	  long currentTick    = System.currentTimeMillis();
	  double diffSeconds  = (currentTick-lastTick)/1000.0;
	  lastTick            = currentTick;
	  
	  // parse User Input
	  userInput = inputSystem.getUserInput();
	  if(userInput!=null)
	  { inputSystem.command(userDot, userInput);
	  }
	  
	  Rectangle p = new Rectangle((int)userDot.x, (int)userDot.y, 20, 20);
	  Rectangle maze1 = new Rectangle(50,0, 60,h-120);
		if(p.intersects(maze1)) {
			userDot.x = 20;
			userDot.y = 20;
			userDot.setDestination(20, 20);
		}
	  
	  try{ Thread.sleep(50); } catch(Exception ex){}
	  
	  userDot.move(diffSeconds);
	  graphicSystem.clear();
	  graphicSystem.draw(userDot);
	  graphicSystem.redraw();
	  
	  
	}
  }
  
  
  public void setGraphicSystem(A_GraphicSystem p) { graphicSystem = p; }
  public void setInputSystem(A_InputSystem p)     { inputSystem   = p; }
}
