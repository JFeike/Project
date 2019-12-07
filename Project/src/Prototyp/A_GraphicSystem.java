package Prototyp;

import java.io.IOException;

public interface A_GraphicSystem 
{
  // prepare to draw a new Screen
  public void clear();
  
  // draw ONE GameObject on the Screen
  public void draw(A_GameObject dot) throws IOException;
  
  // display the completed Screen
  public void redraw();
}
