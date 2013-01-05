package net.qial.lightshow.effect;

import net.qial.lightshow.Effect;

public class ColorFlash extends Effect {
	
	public ColorFlash() {
		this(10);
	}
	
	public ColorFlash(int duration) {
		super();
		setDuration(duration);
	}

	@Override
	public void applyStep(int[][][] mtx, int step) {
		// TODO Auto-generated method stub

	}

}
