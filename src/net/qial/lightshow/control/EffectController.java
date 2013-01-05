package net.qial.lightshow.control;

import java.util.LinkedList;

import net.qial.lightshow.Effect;

public class EffectController {
	private int step = 0;
	
	private int[][][] mtx;
	
	private LinkedList<Effect> effects;
	
	public EffectController() {
		effects = new LinkedList<Effect>();
	}
	
	public void setMtx(int[][][] mtx) {
		this.mtx = mtx;
	}
	
	// synchronized so we don't add effects while running effects for a step
	public synchronized void addEffect(Effect e) {
		e.setStartStep(step);
		effects.add(e);
	}
	
	public synchronized void runStep() {
		
		step++;
	}
}
