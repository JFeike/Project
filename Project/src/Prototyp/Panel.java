package Prototyp;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

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
  int tileHeight = 200;
  int tileWidth = 200;
  
  BufferedImage tile = ImageIO.read(new File("src/resources/Background.png"));  
  BufferedImage fog = ImageIO.read(new File("src/resources/clouds.png")); 
  
  // UserInput variables
  //
  private boolean newInput = false;
  private int     mousePressedX, mousePressedY, 
                  mouseMovedX, mouseMovedY, mouseButton;
  private char    keyPressed;
  
  private int	keyW, keyA, keyS, keyD;
	
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
  { graphics.setColor(Color.black);
    graphics.fillRect(0, 0, w, h);
  }
  
  public final void draw(A_GameObject dot) throws IOException
  {
	  
	Graphics2D g2d = (Graphics2D) graphics;
	
	
	
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
    mazeVertical mv7 = new mazeVertical(50,1000,370,graphics);
    mazeVertical mv8 = new mazeVertical(140,890,490,graphics);
    mazeVertical mv9 = new mazeVertical(140,800,500,graphics);
    mazeVertical mv10 = new mazeVertical(230,400,600,graphics);
    //mazeVertical mv11 = new mazeVertical(290,500,600,graphics);
    mazeHorizontal mh8 = new mazeHorizontal(h-500,210,800,graphics);
    mazeHorizontal mh9 = new mazeHorizontal(h-500,300,900,graphics);
    mazeVertical mv11 = new mazeVertical(400,400,200,graphics);
    mazeHorizontal mh10 = new mazeHorizontal(h-500,400,900,graphics);
    mazeHorizontal mh11 = new mazeHorizontal(h-400,500,590,graphics);
    mazeHorizontal mh12 = new mazeHorizontal(h-100,400,700,graphics);
    mazeVertical mv12 = new mazeVertical(500,500,300,graphics);
    // 
    mazeHorizontal mh13 = new mazeHorizontal(h-500,700,900,graphics);
    mazeVertical mv13 = new mazeVertical(600,670,180,graphics);
    mazeVertical mv14 = new mazeVertical(0,1100,800,graphics);
    mazeHorizontal mh15 = new mazeHorizontal(1000,100,300,graphics);
    mazeHorizontal mh14 = new mazeHorizontal(750,700,300,graphics);
    mazeVertical mv15 = new mazeVertical(600,750,200,graphics);
    //
    mazeHorizontal mh16 = new mazeHorizontal(750,600,580,graphics);
    mazeHorizontal mh17 = new mazeHorizontal(400,780,700,graphics);
    mazeHorizontal mh18 = new mazeHorizontal(50,780,1300,graphics);
    mazeVertical mv16 = new mazeVertical(700,200,130,graphics);
    mazeVertical mv17 = new mazeVertical(785,980,30,graphics);
    mazeHorizontal mh19 = new mazeHorizontal(981,780,400,graphics);
    
    mazeVertical mv18 = new mazeVertical(200,1100,190,graphics);
    mazeVertical mv19 = new mazeVertical(700,1300,30,graphics);
    mazeVertical mv20 = new mazeVertical(700,670,30,graphics);
    mazeVertical mv21 = new mazeVertical(200,1200,290,graphics);
    mazeHorizontal mh20 = new mazeHorizontal(1200,200,200,graphics);
    
    mazeVertical mv22 = new mazeVertical(0,1400,800,graphics);
    mazeHorizontal mh21 = new mazeHorizontal(1400,100,50,graphics);
    mazeVertical mv23 = new mazeVertical(200,1400,100,graphics);
    mazeHorizontal mh22 = new mazeHorizontal(1200,600,300,graphics);
    mazeVertical mv24 = new mazeVertical(600,1300,30,graphics);
    
    
    
    // MAZE END
    
    // UFO
    BufferedImage ufo = ImageIO.read(new File("src/resources/ufo.png"));
    graphics.drawImage(ufo,1250,300,null);
    
	int x = (int)dot.x-RADIUS_DOT;
	int y = (int)dot.y-RADIUS_DOT;
	int r = RADIUS_DOT*2;
	
	
	
	//Fog
	if(true) {
		Area a = new Area(new Rectangle(0, 0, 1600, 900));
		a.subtract(new Area(new Ellipse2D.Double(x-28, y-28, r*4, r*4)));
		g2d.fill(a);
	}

	
	graphics.setColor(COLOR_DOT);
	graphics.fillOval(x, y, r, r);
	graphics.setColor(Color.BLACK);
	graphics.drawOval(x,y,r,r);
	
	
	
  	//int xe = (int)dot.x+1250;
	//int ye = (int)dot.y+300;
	//graphics.setColor(Color.red);
	//graphics.fillOval(xe, ye, r, r);
  	//dot.movedown(50, graphics);
	
	
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
  
  @Override
  //public void keyPressed(KeyEvent e) {
  	// TODO Auto-generated method stub
	 // newInput = true;
	 // if(e.getKeyCode()==KeyEvent.VK_W) {
		//  keyW = e.getKeyCode();
	  //}else if(e.getKeyCode()==KeyEvent.VK_A) {
	//	  keyA = e.getKeyCode();
	 // }else if(e.getKeyCode()==KeyEvent.VK_S) {
		//  keyS = e.getKeyCode();
	  //}else if(e.getKeyCode()==KeyEvent.VK_D) {
	//	  keyD = e.getKeyCode();
	//  }
	  
  	
  //}
  
  
  public UserInput getUserInput()
  { 
    if(!newInput) return null;
    
    newInput = false;
    return new UserInput(mousePressedX,mousePressedY, 
	  	                   mouseMovedX,mouseMovedY,mouseButton,keyPressed);
  }
  
  //public EnemyInput getEnemyInput()
  //{ 
  //if(!newInput) return null;
    
  //newInput = false;
  //return new EnemyInput(keyW, keyA, keyS, keyD);
  //}
  
  
  // direct the Avatar
  public void command(A_GameObject av, UserInput input)
  {
    Player avatar = (Player)av;
    avatar.setDestination(input.mousePressedX, input.mousePressedY);    
  }
  
  
  //public void enemycommand(A_GameObject ev, EnemyInput einput)
  //{
    //enemy_KI enemy = (enemy_KI)ev;
    //if(einput.keyW == keyW) {
    	//enemy.setDestination(enemy.x, enemy.y++);  
    //}else if(einput.keyA == keyA) {
    	//enemy.setDestination(enemy.x--, enemy.y); 
    //}else if(einput.keyS == keyS) {
    	//enemy.setDestination(enemy.x, enemy.y--); 
    //}else if(einput.keyD == keyD) {
    	//enemy.setDestination(enemy.x++, enemy.y); 
    //}
  //}

  
  public void mouseEntered(MouseEvent evt){}
  public void mouseExited(MouseEvent evt){}
  public void mouseClicked(MouseEvent evt){}
  public void mouseReleased(MouseEvent evt){}

@Override
public EnemyInput getEnemyInput() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void enemycommand(A_GameObject enemyObject, EnemyInput enemyInput) {
	// TODO Auto-generated method stub
	
}

  
  
//@Override
//public void keyTyped(KeyEvent e) {}


//@Override
//public void keyReleased(KeyEvent e) {}

//@Override
//public EnemyInput getEnemyInput() {
	// TODO Auto-generated method stub
	//return null;
//}

//@Override
//public void enemycommand(A_GameObject enemyObject, EnemyInput enemyInput) {
	// TODO Auto-generated method stub
	
//}
}
