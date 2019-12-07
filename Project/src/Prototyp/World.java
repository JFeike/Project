package Prototyp;

import java.awt.Rectangle;
import java.awt.Shape;
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
  
  //contains the games objects
  protected ArrayList<A_GameObject> gameObjects = new ArrayList<A_GameObject>();
  
  private UserInput userInput;
  
  private Player userDot;
  
  private Wall wall;
  
  
  public void init() throws IOException
  {
	BufferedImage bush = ImageIO.read(new File("Project/src/resources/busch.png")); 
	userDot = new Player(20,20);
	//gameObjects.set(0,userDot);
	wall = new Wall(bush, 50, 50);   
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
	  Rectangle maze = new Rectangle(50,0, 60,1000);
		if(p.intersects(maze)) {
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
