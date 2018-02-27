
public class PageTableEntry {

	private int valid;
	private int r;
	private int dirty;
	private String frameNum;
	
	public PageTableEntry(int v, int r, int d, String frame) {
		valid = v;
		this.r = r;
		dirty = d;
		frameNum = frame;
	}
	
	//setters
	public void setV(int v) {
		valid = v;
	}
	public void setR(int r) {
		this.r = r;
	}
	public void setD(int d) {
		dirty = d;
	}
	public void setFrame(String frameNum) {
		this.frameNum = frameNum;
	}
	//getters
	public int getV() {
		return valid;
	}
	public int getR() {
		return r;
	}
	public int getD() {
		return dirty;
	}
	public String getFrame() {
		return frameNum;
	}
	
	public String toString() {
		return valid + ", " + r + ", " + dirty + ", " + frameNum;
	}

}
