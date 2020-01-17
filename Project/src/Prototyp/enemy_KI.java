package Prototyp;

import java.awt.Graphics;

public class enemy_KI extends A_GameObject
{
  // destination the Avatar shall move to
  
  public enemy_KI(double x_, double y_) 
  {
	  x=x_;
	  y=y_;
  }
  
  public void move()
  { 
	// if no moving shall occur
	

  }
  
  
  public void setDestination(double dx, double dy)
  {
    y    = dx;
    y    = dy;
  }
  
  public void moveup(int pix,Graphics g){
		for(int i = 0; i < pix; i++) {
			y--;
		}
	}
	public void movedown(int pix,Graphics g){
		for(int i = 0; i < pix; i++) {
			y++;
		}
	}
	public void moveright(int pix,Graphics g){
		for(int i = 0; i < pix; i++) {
			x++;
		}
	}
	public void moveleft(int pix,Graphics g){
		for(int i = 0; i < pix; i++) {
			x--;
		}
	}
  
}