package net.qial.lightshow.effect;

import net.qial.lightshow.Effect;

public class Simple2DCircle extends Effect {
	
	private int step = 0;
	
	public Simple2DCircle() {
		init();
	}
	
	protected void init() {
		
	}
	
	@Override
	public int[][] next(int[][] mtx) {
		step++;
		for(int x = 0; x < mtx.length; x++) {
			double xIdx = (x*Math.PI)/3.0 + (step*Math.PI)/3.0;
			double xVal = Math.sin(xIdx);
			
			for(int y = 0; y < mtx[x].length; y++) {
				
				double yIdx = (y*Math.PI)/12.0 + (step*Math.PI)/12.0;
				double yVal = Math.cos(yIdx);
				mtx[x][y] = (int) (yVal*125) + 128;
			}
		}
		return mtx;
	}

}
