
public class VPT {	//virtual page table
	
	private PageTableEntry[] vpt;
	private int pointer;
	
	public VPT(int size) {
		vpt = new PageTableEntry[size];	//V R D PageFrame#
		pointer = 0;
	}
	
	public int getIndex(String pageFrame) {
		int i = 0;
		while(i < vpt.length) {
			if(vpt[i].getFrame() == pageFrame)
				return i;
			i++;
		}
		return -1;
	}
	
	public void setVPT(String virtualPage, String pageFrame) {
		if(getIndex(virtualPage) != -1) {
			vpt[pointer].setFrame(pageFrame);
			pointer = (pointer + 1 ) % pointer;
		}
	}
	
	public void print() {
		for(PageTableEntry entry : vpt) {
			System.out.println(entry);
		}
	}
}
