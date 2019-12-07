package Prototyp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;

public class Frame extends JFrame
{
  // ...ok...
  private static final long serialVersionUID = 2L;
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  int w = (int) 1600;
  int h = (int) 900;
	
  private Panel panel = null;	

  public Frame() throws IOException
  { this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	// this.setSize(w,h);
  	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	this.setUndecorated(true);
	this.setResizable(false);
	this.setTitle("Prototyp");								
	panel = new Panel();
	this.setContentPane(panel);
  }
  
  public Panel getPanel() {return panel;}
}
