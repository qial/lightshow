package net.qial.lightshow;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class GridView extends Component {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7503243848086427276L;

	private int height = 640;
	private int width = 640;
	
	private Grid grid;
	
	public GridView(Grid grid) {
		this.grid = grid;
	}

	public void paint(Graphics g) {
		int[][] mtx = grid.getMtx();
		int xscale = width/mtx.length;
		int yscale = height/mtx[0].length;
		for(int x = 0; x < mtx.length; x++) {
			for(int y = 0; y < mtx[x].length; y++) {
				int val = mtx[x][y];
				
				Color c = getColor(val);
				g.setColor(c);
				
				g.fillRect(x*xscale, y*yscale, xscale, yscale);
			}
		}
	}
	
	private Color getColor(int value) {
		// for this, we just make a blue color
		Color c = new Color(0, 0, value);
		return c;
	}
}