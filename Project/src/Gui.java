import javax.swing.JFrame;

public class Gui extends JFrame {
	
	JFrame jf = new JFrame();
	Graphic g = new Graphic();
	
	public Gui() {
		
		jf.setLayout(null);
		jf.setTitle("Proj2");
		jf.setSize(1200, 800);
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		jf.addKeyListener(new InputHandler());
		jf.setVisible(true);
		
		jf.setContentPane(g);
		g.setBounds(0,0,jf.getWidth(), jf.getHeight());
		
	}	
}
