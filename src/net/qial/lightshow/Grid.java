package net.qial.lightshow;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

public class Grid {

	private int[][][] mtx;
	private GridView view;
	private List<Effect> effects;
	
	public Grid(int x, int y) {

		mtx = new int[x][y][3];
		effects = new ArrayList<Effect>();
		init();
	}
	
	private void init() {
		// set a default starting value
		for(int x =0;x<mtx.length;x++) {
			for(int y=0;y<mtx[x].length;y++) {
				//mtx[x][y][2] = (x+y)*12;
			}
		}
	}
	
	public void addEffect(Effect e) {
		effects.add(e);
	}
	
	public void setView(GridView v ) {
		view = v;
	}
	
	public void refresh() {
		final GridView theview = view;
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				theview.repaint(mtx);
			}
		});
	}
	
	public int[][][] getMtx() {
		return mtx;
	}

	public List<Effect> getEffects() {
		return effects;
	}

	public void update(int[][][] next) {
//		for(int x = 0; x < mtx.length; x++) {
//			for(int y = 0; y < mtx[x].length; y++) {
//				mtx[x][y] = next[x][y];
//			}
//		}
	}

}
