package net.qial.lightshow.main;

import net.qial.lightshow.Grid;
import net.qial.lightshow.LightshowFrame;
import net.qial.lightshow.control.LightshowController;

public class LightshowMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// build frame
		LightshowFrame frame = new LightshowFrame();
		Grid grid = new Grid(8,8);
		frame.setGrid(grid);
		frame.setVisible(true);
		
		LightshowController controller = new LightshowController();
		controller.addGrid(grid);
		
		Thread t = new Thread(controller);
		t.start();
		System.out.println("Controller started!");
	}

}
