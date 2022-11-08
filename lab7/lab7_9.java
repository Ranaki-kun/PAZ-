import acm.graphics.GRect;

import acm.program.*;

public class lab7_9 extends GraphicsProgram{   
	public void run() {  
for (int i= 0; i<= BRICKS_IN_BASE; i++) {
	for (int j=0; j<i; j++) {
		int w = getWidth()/2;
		int h = getHeight()/4;
		GRect rect = new GRect( w + BRICK_WIDTH*j- BRICK_WIDTH/2*i  , h + BRICK_HEIGHT*i, BRICK_WIDTH, BRICK_HEIGHT);
		add (rect);
		}
	}
}		
				
	private static final int BRICK_WIDTH=30;
	private static final int BRICK_HEIGHT=12;
	private static final int BRICKS_IN_BASE=5;
	
	public static void main(String[] args) {
		new lab7_9().start();
	}
}
