package Prototyp;

import java.awt.Graphics;

public abstract class A_GameObject 
{
  
  public double x,y;
  public double speed = 0;
  public double alfa  = 0;
  public double radius = x/2;
  
  // move one step to direction <alfa>
  public void move(double diffSeconds)
  {  
	 x += Math.cos(alfa)*speed*diffSeconds/2;
	 y += Math.sin(alfa)*speed*diffSeconds/2;   	  
  }
  
  
  
	
}
