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
import javax.swing.JOptionPane;

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
  
  private EnemyInput enemyInput;
  
  private Player userDot;
  
  private enemy_KI enemyDot;
  
  private Wall wall;
  

  
  
  public void init() throws IOException
  {
	BufferedImage a = ImageIO.read(new File("src/resources/alien.png")); 
	userDot = new Player(20,20);
	enemyDot = new enemy_KI(1200, 300);
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
	  
	  // wenn health = 0
	  if(Panel.healthcount == 0 ) {
			JOptionPane.showMessageDialog(null,
				    Frame.lose,
				    "Alien Crash",
				    JOptionPane.PLAIN_MESSAGE);
		  System.exit(0);
		  
	  }
	  
	  //enemyInput = inputSystem.getEnemyInput();
	  //if(enemyInput!=null)
	  //{ inputSystem.enemycommand(enemyDot, enemyInput);
	  //}
	  

	  

	  
	  
	  // Player
	  Rectangle p = new Rectangle((int)userDot.x, (int)userDot.y, 20, 20);
	// enemy
	  Rectangle e = new Rectangle((int)enemyDot.x, (int)enemyDot.y, 20, 20);
	  //UFO
	  Rectangle u = new Rectangle(1250, 300, Panel.ufo.getWidth(), Panel.ufo.getHeight());
	  // Maze
	  // Rectangle x_linksoben, y_linksoben, Breite, H�he
	  Rectangle maze1 = new Rectangle(0,50, 150,30);
	  Rectangle maze2 = new Rectangle(120,50,30,200);
	  Rectangle maze3 = new Rectangle(120,320,30,380);
	  Rectangle maze4 = new Rectangle(45,130,30,570);
	  Rectangle maze5 = new Rectangle(200,50,400,30);
	  Rectangle maze6 = new Rectangle(70,450,75,30);
	  Rectangle maze7 = new Rectangle(200,50,30,450);
	  
	  Rectangle maze8 = new Rectangle(150,600,50,30);
	  //mh5?
	  
	  Rectangle maze9 = new Rectangle(300,140,300,30);
	  Rectangle maze10 = new Rectangle(300,150,30,150);
	  Rectangle maze11 = new Rectangle(300,350,30,400);
	  
	  Rectangle maze12 = new Rectangle(700,50,300,30);
	  Rectangle maze13 = new Rectangle(1000,50,30,480);
	  Rectangle maze14 = new Rectangle(890,140,30,270);
	  Rectangle maze15 = new Rectangle(800,140,30,260);
	  Rectangle maze16 = new Rectangle(400,230,30,70);
	  
	  Rectangle maze17 = new Rectangle(400,210,400,30);
	  Rectangle maze18 = new Rectangle(400,300,300,30);
	  Rectangle maze19 = new Rectangle(400,400,30,270);
	  Rectangle maze20 = new Rectangle(400,400,300,30);
	  Rectangle maze21 = new Rectangle(500,500,510,30);
	  Rectangle maze22 = new Rectangle(800,400,100,30);
	  Rectangle maze23 = new Rectangle(500,500,30,100);
	  
	  Rectangle maze24 = new Rectangle(400,700,300,30);
	  Rectangle maze25 = new Rectangle(670,600,30,50);
	  Rectangle maze26 = new Rectangle(1100,0,30,100);
	  Rectangle maze27 = new Rectangle(1000,100,1200,30);
	  Rectangle maze28 = new Rectangle(750,700,550,30);
	  Rectangle maze29 = new Rectangle(750,600,30,100);
	  
	  Rectangle maze30 = new Rectangle(750,600,270,30);
	  Rectangle maze31 = new Rectangle(400,780,500,30);
	  Rectangle maze32 = new Rectangle(50,780,250,30);
	  Rectangle maze33 = new Rectangle(200,700,30,70);
	  Rectangle maze34 = new Rectangle(980,785,30,85);
	  Rectangle maze35 = new Rectangle(981,780,219,30);
	  
	  Rectangle maze36 = new Rectangle(1100,200,30,520);
	  Rectangle maze37 = new Rectangle(1300,700,30,170);
	  Rectangle maze38 = new Rectangle(670,700,30,170);
	  Rectangle maze39 = new Rectangle(1200,200,30,410);
	  Rectangle maze40 = new Rectangle(980,785,200,30);
	  
	  Rectangle maze41 = new Rectangle(1400,0,30,100);
	  Rectangle maze42 = new Rectangle(1400,100,150,30);
	  Rectangle maze43 = new Rectangle(1400,200,30,600);
	  Rectangle maze44 = new Rectangle(1200,600,100,30);
	  Rectangle maze45 = new Rectangle(1300,600,30,270);
	  
	  
		if (p.intersects(maze1) ||
			p.intersects(maze2) ||
			p.intersects(maze3) ||
			p.intersects(maze4) ||
			p.intersects(maze5) ||
			p.intersects(maze6) ||
			p.intersects(maze7) ||
			p.intersects(maze8) ||
			p.intersects(maze9) ||
			p.intersects(maze10) ||
			p.intersects(maze11) ||
			p.intersects(maze12) ||
			p.intersects(maze13) ||
			p.intersects(maze14) ||
			p.intersects(maze15) ||
			p.intersects(maze16) ||
			p.intersects(maze17) ||
			p.intersects(maze18) ||
			p.intersects(maze19) ||
			p.intersects(maze20) ||
			p.intersects(maze21) ||
			p.intersects(maze22) ||
			p.intersects(maze23) ||
			p.intersects(maze24) ||
			p.intersects(maze25) ||
			p.intersects(maze26) ||
			p.intersects(maze27) ||
			p.intersects(maze28) ||
			p.intersects(maze29) ||
			p.intersects(maze30) ||
			p.intersects(maze31) ||
			p.intersects(maze32) ||
			p.intersects(maze33) ||
			p.intersects(maze34) ||
			p.intersects(maze35) ||
			p.intersects(maze36) ||
			p.intersects(maze37) ||
			p.intersects(maze38) ||
			p.intersects(maze39) ||
			p.intersects(maze40) ||
			p.intersects(maze41) ||
			p.intersects(maze42) ||
			p.intersects(maze43) ||
			p.intersects(maze44) ||
			p.intersects(maze45) ||
			p.intersects(e)
		)
		{
			userDot.x = 20;
			userDot.y = 20;
			userDot.setDestination(20, 20);
			Panel.healthcount -= 1;
			Frame.health.setText("Health: " + Panel.healthcount);
		}
		
		if(p.intersects(u) && Panel.batterycount == 3) {
			System.out.println("gewonnen!");
			Panel.fogr=100000;
			JOptionPane.showMessageDialog(null,
				    Frame.win,
				    "Alien Crash",
				    JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		
		if(p.intersects(u) && Panel.batterycount < 3) {
			System.out.println("Du brauchst noch mehr Batterien!");
		}
		if(p.intersects(Panel.bat1)) {
			Panel.bat1Y = 10000;
			Panel.batterycount += 1;
			Frame.battery.setText("Batteries: " + Panel.batterycount + " / 3");
		}
		if(p.intersects(Panel.bat2)) {
			Panel.batterycount += 1;
			Panel.bat2Y = 10000;
			Frame.battery.setText("Batteries: " + Panel.batterycount + " / 3");
		}
		if(p.intersects(Panel.bat3)) {
			Panel.bat3X = 10000;
			Panel.batterycount += 1;
			Frame.battery.setText("Batteries: " + Panel.batterycount + " / 3");
		}
		if(p.intersects(Panel.bat4)) {
			Panel.bat4X = 10000;
			Panel.batterycount += 1;
			Frame.battery.setText("Batteries: " + Panel.batterycount + " / 3");
		}
		if(p.intersects(Panel.bat5)) {
			Panel.bat5X = 10000;
			Panel.batterycount += 1;
			Frame.battery.setText("Batteries: " + Panel.batterycount + " / 3");
		}
		if(p.intersects(Panel.bat6)) {
			Panel.bat6X = 10000;
			Panel.batterycount += 1;
			Frame.battery.setText("Batteries: " + Panel.batterycount + " / 3");
		}
		if(p.intersects(Panel.bat7)) {
			Panel.bat7X = 10000;
			Panel.batterycount += 1;
			Frame.battery.setText("Batteries: " + Panel.batterycount + " / 3");
		}
		if(p.intersects(Panel.bat8)) {
			Panel.bat8X = 10000;
			Panel.batterycount += 1;
			Frame.battery.setText("Batteries: " + Panel.batterycount + " / 3");
		}
		if(p.intersects(Panel.bat9)) {
			Panel.bat9X = 10000;
			Panel.batterycount += 1;
			Frame.battery.setText("Batteries: " + Panel.batterycount + " / 3");
		}
		if(p.intersects(Panel.bat10)) {
			Panel.bat10X = 10000;
			Panel.batterycount += 1;
			Frame.battery.setText("Batteries: " + Panel.batterycount + " / 3");
		}
		if(p.intersects(Panel.flash)) {
			Panel.fogr = 12;
			Panel.fogxy = 110;
			if(Panel.help == 1) {
				Panel.bat1X = 100000;
			}
			if(Panel.help == 2) {
				Panel.bat2X = 100000;
			}
			if(Panel.help == 3) {
				Panel.bat3X = 100000;
			}
			if(Panel.help == 4) {
				Panel.bat4X = 100000;
			}
			if(Panel.help == 5) {
				Panel.bat5X = 100000;
			}
			if(Panel.help == 6) {
				Panel.bat6X = 100000;
			}
			if(Panel.help == 7) {
				Panel.bat7X = 100000;
			}
			if(Panel.help == 8) {
				Panel.bat8X = 100000;
			}
			if(Panel.help == 9) {
				Panel.bat9X = 100000;
			}
			if(Panel.help == 10) {
				Panel.bat10X = 100000;
			}
			
			
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
