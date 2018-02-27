
public class MMU {
	
	private TLB cache;
	private VPT vpt;
	
	public MMU() {
		cache = new TLB(4);
		vpt = new VPT(16);
	}
	
	public boolean checkHit(String virtualPage) {
		if(cache.getIndex(virtualPage) != -1)
			return true;
		return false;
	}
	
	public boolean checkMem(String virtualPage) {
		if(vpt.getIndex(virtualPage) != -1)
			return true;
		return false;
	}

	public void updateTLB(String virtualPage, int v, int r, int d, String pageFrame) {
		cache.setTLB(virtualPage, v, r, d, pageFrame);
		//or just change other ones?
	}
	
	public void process(String virtualPage,int v, int r, int d, String pageFrame) {
		if(checkHit(virtualPage)) {
			//do read/write
		}
		else if(checkMem(virtualPage)) {
			//fetch from memory
			cache.setTLB(virtualPage, v, r, d, pageFrame);
		}
		else {
			//fetch from hard drive
			vpt.setVPT(virtualPage, pageFrame);
			cache.setTLB(virtualPage, v, r, d, pageFrame);
		}
	}
	
}
