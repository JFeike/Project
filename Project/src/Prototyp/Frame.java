package Prototyp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Frame extends JFrame
{
  private static final long serialVersionUID = 2L;
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  int w = (int) 1600;
  int h = (int) 900;
  static Label battery = new Label("Batteries: " + Panel.batterycount + " / 3");
  static Label health = new Label("Health: " + Panel.healthcount);	
  static JLabel start = new JLabel("<html>Du bist mit deinem UFO auf der Erde abgestürzt, weil dir der Kraftstoff ausgegangen ist!<p/> Nach dem Absturz findest du dich nachts in einem Labyrinth wieder.<p/>Finde 3 Batterien, um dein UFO wieder aufzuladen!<p/>Aber pass auf! Die stachelige Hecke fügt dir Schaden zu und setzt dich an den Anfang des Labyrinths zurück!<p/>Bewege dich mit der linken Maustaste.</html>");
  static JLabel lose = new JLabel("Du hast das Spiel verloren!");
  static JLabel win = new JLabel("Du hast das Spiel gewonnen!");
  
  private Panel panel = null;	

  public Frame() throws IOException
  { this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(w,h);
	this.setResizable(false);
	this.setTitle("Alien Crash");								
	panel = new Panel();
	panel.setLayout(null);
	battery.setBounds(1470, 10, 120, 25);
	health.setBounds(1470,35, 120, 25);
	battery.setFont(new Font("Serif", Font.PLAIN, 20));
	health.setFont(new Font("Serif", Font.PLAIN, 20));
	start.setFont(new Font("Serif", Font.PLAIN, 20));
	lose.setFont(new Font("Serif", Font.PLAIN, 20));
	win.setFont(new Font("Serif", Font.PLAIN, 20));
	panel.add(battery);
	panel.add(health);
	this.setContentPane(panel);
	
	JOptionPane.showMessageDialog(this,
		    start,
		    "Alien Crash",
		    JOptionPane.PLAIN_MESSAGE);
	
  }
  
  public Panel getPanel() {return panel;}
}
