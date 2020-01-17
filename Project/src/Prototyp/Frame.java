package Prototyp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
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
  static Label battery = new Label("Batteries: " + Panel.batterycount + " / 3");
  static Label health = new Label("Health: " + Panel.healthcount);	
  
  private Panel panel = null;	

  public Frame() throws IOException
  { this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(w,h);
	this.setResizable(false);
	this.setTitle("Alien Invasion");								
	panel = new Panel();
	panel.setLayout(null);
	battery.setBounds(1470, 10, 120, 25);
	health.setBounds(1470,35, 120, 25);
	battery.setFont(new Font("Serif", Font.PLAIN, 20));
	health.setFont(new Font("Serif", Font.PLAIN, 20));
	panel.add(battery);
	panel.add(health);
	this.setContentPane(panel);
	
	JOptionPane.showMessageDialog(this,
		    "Die Welt wurde schwarz.Alles ist dunkel.\nDu bist gestrandet auf diesem unbekannten Planeten.\nDie einzige Hoffnung auf deinen Heimatplaneten zurückzukehren ist dein UFO, jedoch bist du in einem Labyrinth abgestürzt."
		    + "\nFinde es, aber pass auf, die Wände setzten dich an den Anfang des Labyrinthes zurück!\nBewege dich mit der linken Maustaste und finde dein UFO",
		    "Alien Invasion",
		    JOptionPane.PLAIN_MESSAGE);
	
  }
  
  public Panel getPanel() {return panel;}
}
