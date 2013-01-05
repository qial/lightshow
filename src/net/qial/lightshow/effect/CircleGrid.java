package net.qial.lightshow.effect;

import net.qial.lightshow.Effect;
import net.qial.lightshow.LSUtil;

public class CircleGrid extends Effect {
	
	private int step = 0;
	
	public CircleGrid() {
		init();
	}
	
	protected void init() {
		
	}
	
	public int[][][] next(int[][][] mtx) {
		step++;
		for(int x = 0; x < mtx.length; x++) {
			for(int y = 0; y < mtx[x].length; y++) {
				int amt = x+y+step;
				//double val = Math.sin(amt*Math.PI/16.0);
				double stp = step*Math.PI / 48;
				double xv= Math.cos(x*Math.PI/8 + stp);
				double yv= Math.cos(y*Math.PI/8 + stp);
				mtx[x][y][1] = (int)((xv+yv+2.0)*60);
				//mtx[x][y] = x*y;
			}
		}
		
		//LSUtil.outMatrix(mtx);
		
		return mtx;
	}

	@Override
	public void applyStep(int[][][] mtx, int step) {
		// TODO Auto-generated method stub
		
	}

}
