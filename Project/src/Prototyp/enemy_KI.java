package Prototyp;

public class enemy_KI extends A_GameObject
{
  // destination the Avatar shall move to
  private boolean isMoving = false;
  
  public enemy_KI(double x_, double y_) 
  {
	  x=x_;
	  y=y_;
	  speed=200;
  }
  
  public void move()
  { 
	// if no moving shall occur
	if(!isMoving) return;

  }
  
  
  public void setDestination(double dx, double dy)
  {
    isMoving = true;
    y    = dx;
    y    = dy;
  }
  
  
}