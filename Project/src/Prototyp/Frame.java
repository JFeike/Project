package Prototyp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frame extends JFrame
{
  private static final long serialVersionUID = 2L;
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  int w = (int) 1600;
  int h = (int) 900;
	
  private Panel panel = null;	

  public Frame() throws IOException
  { this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(w,h);
	this.setResizable(false);
	this.setTitle("Alien Invasion");								
	panel = new Panel();
	this.setContentPane(panel);
	
	JOptionPane.showMessageDialog(this,
		    "Die Welt wurde schwarz.Alles ist dunkel.\nDu bist gestrandet auf diesem unbekannten Planeten.\nDie einzige Hoffnung auf deinen Heimatplaneten zur�ckzukehren ist dein UFO, jedoch bist du in einem Labyrinth abgest�rzt."
		    + "\nFinde es, aber pass auf, die W�nde setzten dich an den Anfang des Labyrinthes zur�ck!\nBewege dich mit der linken Maustaste und finde dein UFO",
		    "Alien Invasion",
		    JOptionPane.PLAIN_MESSAGE);
	
  }
  
  public Panel getPanel() {return panel;}
}
