
public class TibEntry {
	
	private String vpNum;
	private int valid;
	private int r;
	private int dirty;
	private String frameNum;
	
	public TibEntry(String vp, int v, int r, int d, String frame) {
		vpNum = vp;
		valid = v;
		this.r = r;
		dirty = d;
		frameNum = frame;
	}
	
	//setters
	public void setVP(String vpNum) {
		this.vpNum = vpNum;
	}
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
	public String getVP() {
		return vpNum;
	}
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
		return vpNum + ", " + valid + ", " + r + ", " + dirty + ", " + frameNum;
	}
}
