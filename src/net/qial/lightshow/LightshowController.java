package net.qial.lightshow;

import java.util.ArrayList;
import java.util.List;

import net.qial.lightshow.effect.*;

public class LightshowController implements Runnable {

	private List<Grid> grids;
	
	private static final int FRAME_WAIT = 50;
	
	@Override
	public void run() {
		System.out.println("Begin run!");
		int runs = 1;
		while(true) {
			runs++;
			for(Grid g : grids) {
				for(Effect e : g.getEffects()) {
					//e.update(g.getMtx());
					g.update(e.next(g.getMtx()));
				}
				//System.out.println(g.getMtx());
				g.refresh();
			}
			try {
				Thread.sleep(FRAME_WAIT);
			} catch(Exception e) {
				// do nothing
			}
			//System.out.println("did frame");
			if(runs % 10 == 0) {
				System.out.println("rendered 10 frames");
			}
		}
	}

	public void addGrid(Grid grid) {
		grids.add(grid);
		//grid.addEffect(new Simple2D());
		//grid.addEffect(new VerticalBar());
		grid.addEffect(new CircleGrid());
	}
	
	public LightshowController() {
		grids = new ArrayList<Grid>();
	}

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//
//	}

}
