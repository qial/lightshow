package net.qial.lightshow;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class GridView extends Component {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7503243848086427276L;
	private int[][][] mtx;

	private int height = 640;
	private int width = 640;
	
	private Grid grid;
	
	public GridView(Grid grid) {
		this.grid = grid;
		mtx = new int[1][1][3];
	}

	public void paint(Graphics g) {
		//int[][][] mtx = grid.getMtx();
		int xscale = width/mtx.length;
		int yscale = height/mtx[0].length;
		for(int x = 0; x < mtx.length; x++) {
			for(int y = 0; y < mtx[x].length; y++) {
				int[] color = mtx[x][y];
				
				Color c = getColor(color);
				g.setColor(c);
				
				g.fillRect(x*xscale, y*yscale, xscale, yscale);
			}
		}
	}
	
	private Color getColor(int[] value) {
		// for this, we just make a blue color
		Color c = new Color(value[0], value[1], value[2]);
		return c;
	}
	
	public void repaint(int[][][] matrix) {
		// copy matrix first
		this.mtx = new int[matrix.length][matrix[0].length][matrix[0][0].length];
		for(int x = 0; x < matrix.length; x++) {
			for(int y = 0; y < matrix[0].length; y++) {
				for(int z = 0; z < matrix[0][0].length; z++) {
					mtx[x][y][z] = matrix[x][y][z];
				}
			}
		}
		super.repaint();
	}
}
