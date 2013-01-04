package net.qial.lightshow;

public class LSUtil {
	public static void outMatrix(int[][] mtx) {
		System.out.print("[");
		for(int i = 0; i < mtx.length; i++) {
			System.out.print("[");
			for(int j = 0; j < mtx[i].length; j++) {
				System.out.print(mtx[i][j]+",");
			}
			System.out.print("],\n ");
		}
		System.out.println("]");
	}
	
	public static void outMatrix(int[][][] mtx, int colorIdx) {
		System.out.print("[");
		for(int i = 0; i < mtx.length; i++) {
			System.out.print("[");
			for(int j = 0; j < mtx[i].length; j++) {
				System.out.print(mtx[i][j][colorIdx]+",");
			}
			System.out.print("],\n ");
		}
		System.out.println("]");
	}
}
