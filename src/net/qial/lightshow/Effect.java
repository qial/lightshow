package net.qial.lightshow;

public abstract class Effect {
	private int startStep;
	private int duration;
	
	//public abstract int[][][] next(int[][][] mtx);
	public abstract void applyStep(int[][][] mtx, int step);

	public int getStartStep() {
		return startStep;
	}

	public void setStartStep(int startStep) {
		this.startStep = startStep;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public boolean isFinished(int step) {
		if(step < startStep + duration) {
			return false;
		}
		return true;
	}
}
