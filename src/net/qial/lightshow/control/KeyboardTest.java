package net.qial.lightshow.control;

import net.qial.lightshow.Grid;
import net.qial.lightshow.LightshowController;
import net.qial.lightshow.LightshowFrame;



public class KeyboardTest {
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