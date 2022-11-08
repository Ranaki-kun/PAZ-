import acm.graphics.*;
import acm.program.*;
public class lab7_14 extends GraphicsProgram {  

	public void run() {  
		setSize(1000,300);
		int h=getHeight();
		int w=getWidth();
		
		GLabel label=new GLabel("SE- Uranchimeg (21B1NUM0609)", w, h-50);
		label.setFont("sansSerif-250");
		add(label);
		double dx = 1;  	
		
		while(true) {
			while(label.getX() + label.getWidth() != 0 ) {
				label.move(-dx, 0);      
				pause(PAUSE_TIME);
			}
			label.setLocation(w, h-50);
         }

		
		
	
	}
	private static final int PAUSE_TIME = 5; 
	public static void main(String[] args) {
		new lab7_14().start();
	}
}