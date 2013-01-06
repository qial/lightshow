package net.qial.lightshow;

import javax.swing.JFrame;

public class LightshowFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1849105756372690883L;
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LightshowFrame frame = new LightshowFrame();
//		frame.
//		frame.setVisible(true);
//	}
	
	private Grid grid;
	
	private GridView view;
	
	public LightshowFrame() {
		super("Lightshow");

		setBounds(10,10,700,700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setGrid(Grid g ) {
		grid = g;
		view = new GridView(grid);
		grid.setView(view);
		this.getContentPane().removeAll();
		this.getContentPane().add(view);
		System.out.println("GridView is set in frame");
	}
	
	public Grid getGrid() {
		return grid;
	}

}
