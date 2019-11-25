package Alien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	public class GameOverFrame extends JFrame implements ActionListener {
		
		private static final long serialVersionUID = 1L;
		
		private JButton buttonRetry = new JButton("RETRY");
		private JButton buttonExit = new JButton("EXIT");
		private JLabel labelOver = new JLabel("Du wurdest exmatrikuliert! \n");
		private final int go_width = 200;
	    private final int go_height = 200;

			public GameOverFrame()
			{
				init();
			}

			private void init()
			{
				this.setSize(go_width, go_height);
				this.setTitle("Game Over...");
				
				// Panels erstellen mit Border(int top, int left, int bottom, int right)
				
				JPanel panel = new JPanel();
				
				panel.add(labelOver);
				buttonRetry.addActionListener((ActionListener) this);
				buttonExit.addActionListener((ActionListener) this);
				panel.add(buttonRetry);
				panel.add(buttonExit);

				this.add(panel);
				
			}
			
			// Implementierung des ActionListeners
			// durch die Methode <actionPerformed> :
			//
			
			public void actionPerformed(ActionEvent evt)
			{
				Object src = evt.getSource();
				if(src==buttonRetry)
				{
					EventQueue.invokeLater(() -> {
			            JFrame ex = new Main();
			            ex.setVisible(true);
			        });
				}
				else if(src==buttonExit)
				{
					System.exit(0);
				}
		
			}
			 	
	}