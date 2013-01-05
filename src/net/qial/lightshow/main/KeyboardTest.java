package net.qial.lightshow.main;

import net.qial.lightshow.Effect;
import net.qial.lightshow.Grid;
import net.qial.lightshow.LSUtil;
import net.qial.lightshow.LightshowFrame;
import net.qial.lightshow.control.EffectController;
import net.qial.lightshow.control.LightshowController;
import net.qial.lightshow.effect.ColorFlash;



public class KeyboardTest {
	public static void main(String[] args) {
		// build frame
		LightshowFrame frame = new LightshowFrame();
		Grid grid = new Grid(8,8);
		frame.setGrid(grid);
		frame.setVisible(true);
		
		EffectController controller = new EffectController();
		controller.setGrid(grid);
		
//		Thread t = new Thread(controller);
//		t.start();
		System.out.println("Controller started!");
		run(controller);
	}
	
	private static final int FRAME_WAIT = 50;
	
	
	public static void run(EffectController control) {
		System.out.println("Begin run!");
		int runs = 1;
		while(true) {
			runs++;
			control.runStep();
			try {
				Thread.sleep(FRAME_WAIT);
			} catch(Exception e) {
				// do nothing
			}
			//System.out.println("did frame");
			if(runs % 10 == 0) {
				System.out.println("rendered 10 frames");
				control.addEffect(new ColorFlash());
//				LSUtil.outMatrix(grids.get(0).getMtx(), 0);
//				LSUtil.outMatrix(grids.get(0).getMtx(), 1);
//				LSUtil.outMatrix(grids.get(0).getMtx(), 2);
			}
		}
	}
}