package thread;

import model.Sector;

public class SectorThread extends Thread {
	private Sector sector;
	
	public SectorThread(String c, int r, int pY, int s) {
		sector = new Sector(c, r,pY, s);
	}
	
	public void run() {
		try {
			sector.printSector();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
