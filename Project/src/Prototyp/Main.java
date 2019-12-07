package Prototyp;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

public class Main 
{
  private World world = null;
  
  public Main() throws IOException
  { 
	Frame frame = new Frame();
    frame.setVisible(true);
    
    world = new World();
    world.setGraphicSystem(frame.getPanel());
    world.setInputSystem(frame.getPanel());
    world.init();
    world.run();
  }
	
  public static void main(String[] args) throws IOException
  { new Main();
  }
}
