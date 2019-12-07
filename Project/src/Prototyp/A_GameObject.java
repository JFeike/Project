package Prototyp;

public abstract class A_GameObject 
{
  // yes, public  :(
  //
  public double x,y;
  public double speed = 0;
  public double alfa  = 0;
  public double radius = x/2;
  
  // move one step to direction <alfa>
  public void move(double diffSeconds)
  {  
	 x += Math.cos(alfa)*speed*diffSeconds;
	 y += Math.sin(alfa)*speed*diffSeconds;   	  
  }
}
