package Alien;

import javax.swing.UIManager;

public class GameOver {

		public GameOver() {

			GameOverFrame frame = new GameOverFrame();
			frame.validate();
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			}
		
			public static void showOver() {
			try
			{ UIManager.setLookAndFeel(new
					javax.swing.plaf.nimbus.NimbusLookAndFeel());
			}
			
			catch (Exception e)
			{ }
			new GameOver();
			}
			
	}