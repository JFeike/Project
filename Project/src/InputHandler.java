

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class InputHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_W) {
			Variables.moveup = true;
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			Variables.movedown = true;
		}
		if(e.getKeyCode()==KeyEvent.VK_A) {
			Variables.moveleft = true;
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
			Variables.moveright = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_W) {
			Variables.moveup = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			Variables.movedown = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_A) {
			Variables.moveleft = false;
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
			Variables.moveright = false;
		}

		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}



}
