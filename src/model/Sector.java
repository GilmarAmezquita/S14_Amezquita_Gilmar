package model;

public class Sector {
	private final static String ESC = "\u001b["; 
	
	private String color;
	private int rows;
	private int positionX;
	private int positionY;
	private int sleep;
	
	public Sector(String c, int r, int pY, int s) {
		color = c;
		rows = r;
		positionX = 1;
		positionY = pY;
		sleep = s;
	}
	
	public void printSector() throws InterruptedException {
		String space = " ";
		for(int i = 0; i<121; i++) {
			for(int j = 0; j<rows; j++) {
				System.out.print(ESC+positionX+"G"+ESC+positionY+"d"+ESC+color+space);
				if(i % 2 == 0 && j != rows-1) {
					positionY++;
				}else if(i % 2 != 0 && j != rows-1) {
					positionY--;
				}
				Thread.sleep(sleep);
			}
			positionX++;
		}
	}
}
