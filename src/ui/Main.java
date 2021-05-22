package ui;

import thread.SectorThread;

public class Main {
	private final static String ESC = "\u001b[";
	
	private static SectorThread yellow;
	private static SectorThread blue;
	private static SectorThread red;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.print("\033[H\033[2J");
		int rows = 20;
		yellow = new SectorThread("43m", rows,1,20);
		blue = new SectorThread("44m", rows/2,21,41);
		red = new SectorThread("41m", rows/2,31,41);
		
		yellow.start();
		SectorThread.sleep(2);
		blue.start();
		SectorThread.sleep(2);
		red.start();
		SectorThread.sleep(2);
		
		yellow.join();
		blue.join();
		red.join();
		System.out.print(ESC+"1G"+ESC+"41d");
	}
}
