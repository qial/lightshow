package net.qial.lightshow.effect;

import net.qial.lightshow.Effect;

public class VerticalBar extends Effect {
	
	private int step = 0;
	
	public int[][][] next(int[][][] mtx) {
		step++;
		int x = step%mtx.length;
		for(int y = 0; y < mtx[x].length; y++) {
			mtx[x][y][2] = 250;
		}
		return mtx;
	}

	@Override
	public void applyStep(int[][][] mtx, int step) {
		// TODO Auto-generated method stub
		
	}

}
