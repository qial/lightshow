package net.qial.lightshow.effect;

import net.qial.lightshow.Effect;

public class HalfColorFlash extends Effect {
	
	private int color = RED;
	
	public HalfColorFlash() {
		this(10,RED);
	}
	
	public HalfColorFlash(int duration, int color) {
		super();
		setDuration(duration);
		this.color = color;
	}

	@Override
	public void applyStep(int[][][] mtx, int step) {
		// by default we're gonna assume 25% of duration is brighten time, 50% full bright, 25% darken
//		int brS = getDuration()/4 + step;
//		int drS = step + getDuration() - (getDuration()/4);
		
		// laziness, first 3 steps brighten, last 4 darken
		int stepNum = step - getStartStep();
		int stepNumI = getDuration() - stepNum;
		int bright = 255;
		switch(stepNum) {
		case 0: bright = 64; break;
		case 1: bright = 128; break;
		case 2: bright = 192; break;
		}
		switch(stepNumI) {
		case 1: bright = 0; break;
		case 2: bright = 64; break;
		case 3: bright = 128; break;
		case 4: bright = 192; break;
		}
		
		// apply flash
		for(int x = 0; x < mtx.length/2; x++) {
			for(int y = 0; y < mtx[x].length; y++) {
				mtx[x][y][color] = bright;
			}
		}
		// done
	}

}
