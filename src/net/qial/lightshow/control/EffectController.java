package net.qial.lightshow.control;

import java.util.Iterator;
import java.util.LinkedList;

import net.qial.lightshow.Effect;
import net.qial.lightshow.Grid;
import net.qial.lightshow.LSUtil;

public class EffectController {
	private int step = 0;
	
	private Grid grid;
	
	private LinkedList<Effect> effects;
	
	public EffectController() {
		effects = new LinkedList<Effect>();
	}
	
	public void setGrid(Grid g) {
		this.grid = g;
	}
	
	// synchronized so we don't add effects while running effects for a step
	public synchronized void addEffect(Effect e) {
		e.setStartStep(step);
		effects.add(e);
	}
	
	public synchronized void runStep() {
		// do each step (or remove if finished)
		// using an iterator so we can be tricky like that
		// also I've never used an iterator for this purpose so it sounds fun
		Iterator<Effect> iter = effects.iterator();
		while(iter.hasNext()) {
			Effect e = iter.next();
			if(e.isFinished(step)) {
				// effect completed, so remove
				iter.remove();
				continue;
			}
			e.applyStep(grid.getMtx(), step);
		}
		
		// we're done! send refresh to grid
		grid.refresh();
		
		step++;
	}
	
	
}
