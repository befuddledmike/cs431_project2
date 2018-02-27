
public class TLB {
	
	private TibEntry[] cache;
	private int pointer;
	
	public TLB(int cacheSize) {
		cache = new TibEntry[cacheSize]; //V-Page# V R D PageFrame#
		pointer = 0;
	}
	
	public void setTLB(String virtualPage, int v, int r, int d, String pageFrame) {
		if(getIndex(virtualPage) != -1) {
			cache[pointer] = new TibEntry(virtualPage, v, r, d, pageFrame);
			pointer = (pointer + 1 ) % pointer;
		}
	}
	//set v,r,d
	public void setV(int v) {
		if(cache[pointer] != null)
			cache[pointer].setV(v);
	}
	public void setR(int r) {
		if(cache[pointer] != null)
			cache[pointer].setV(r);
	}
	public void setD(int d) {
		if(cache[pointer] != null)
			cache[pointer].setV(d);
	}
	
	public TibEntry[] getCache() {
		return cache;
	}
	
	public int getIndex(String virtualPage) {
		int i = 0;
		while(i < cache.length) {
			if(cache[i].getVP() == virtualPage)
				return i;
			i++;
		}
		return -1;
	}
	
	public void print() {
		for(TibEntry entry : cache) {
			System.out.println(entry);
		}
	}

}
