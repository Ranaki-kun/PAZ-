import acm.graphics.*;

import acm.program.*;

import java.awt.Color;


public class Robotic extends GraphicsProgram {
	private static int HEAD_WIDTH=150;
	private static int HEAD_HEIGHT=200;
	public void run() {		
		println("Robot hiih programm");
		int h=getHeight();
		int w=getWidth();
		GRect rect = new GRect(h, w, HEAD_WIDTH, HEAD_HEIGHT);
		rect.setFilled(true);
		rect.setFillColor(Color.GRAY);
		add(rect);
		
		GOval
		
	}
	
	public static void main(String[] arg) {
		new Robotic().start();
	}

}
