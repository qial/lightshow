package net.qial.lightshow.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import net.qial.lightshow.Effect;
import net.qial.lightshow.effect.ColorFlash;
import net.qial.lightshow.effect.HalfColorFlash;

public class KeyboardHandler implements KeyListener {
	
	private EffectController control;
	
	public KeyboardHandler() {
		
	}
	
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();
		Effect ef = null;
		switch(key) {
		case 'a': ef = new ColorFlash(10,Effect.RED); break;
		case 's': ef = new ColorFlash(10,Effect.GREEN); break;
		case 'd': ef = new ColorFlash(10,Effect.BLUE); break;
		case 'q': ef = new HalfColorFlash(10,Effect.RED); break;
		case 'w': ef = new HalfColorFlash(10,Effect.GREEN); break;
		case 'e': ef = new HalfColorFlash(10,Effect.BLUE); break;
		}
		if(ef != null && control != null) {
			control.addEffect(ef);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}



	public EffectController getControl() {
		return control;
	}



	public void setControl(EffectController control) {
		this.control = control;
	}

}
