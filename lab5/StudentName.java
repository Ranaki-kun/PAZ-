import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.*;
public class StudentName extends GraphicsProgram{
	private static int x=100;
	public void run(){
		int h=getHeight();
		int w=getWidth();
		GRect rect=new GRect(w/2-x, h/2-x/2, x*2, x/2);
		rect.setFilled(true);
		rect.setColor(Color.orange);
		add(rect);	
		GLabel label=new GLabel("Uranchimeg, SE", w/2-x/1.5, h/2-x/5);
		label.setFont("SansSerif-20");
		//x ni fontnii size aas 5 dahin ih baih ystoi
		label.setColor(Color.blue);
		add(label);
	}
	public static void main(String[] arg){
		new StudentName().start();
		
		
	}

}
