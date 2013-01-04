package net.qial.lightshow.effect;

import net.qial.lightshow.Effect;
import net.qial.lightshow.LSUtil;

public class Simple2D extends Effect {
	
	private int step = 0;
	
	public Simple2D() {
		init();
	}
	
	protected void init() {
		
	}
	
	@Override
	public int[][] next(int[][] mtx) {
		step++;
		for(int x = 0; x < mtx.length; x++) {
			for(int y = 0; y < mtx[x].length; y++) {
				int amt = x+y+step;
				double val = Math.sin(amt*Math.PI/16.0);
				mtx[x][y] = (int)((val+1.0)*125.0);
				//mtx[x][y] = x*y;
			}
		}
		
		//LSUtil.outMatrix(mtx);
		
		return mtx;
	}

}
