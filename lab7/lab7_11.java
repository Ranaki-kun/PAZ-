import acm.graphics.GRect;

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.*;

public class lab7_11 extends GraphicsProgram {

		public void run () {

			 double sqSize = (double) getHeight() / N_Rows;
			 
	         for (int i = 0; i < N_Rows; i++) { 
	             for (int j = 0; j < N_Columns; j++) { 
	            
	                 double x = (j * sqSize)+ (getWidth() / 2 - getHeight() / 2) ; 
	                 double y = i * sqSize;           
	                    GRect sq = new GRect(x, y, sqSize, sqSize); 
	                    sq.setFilled((i+j) % 2 != 0); 
	                    sq.setFillColor(Color.gray); 
	                    add(sq);
	            	 
	                  
	 
	//the red checkers       
	                    
	                    
	                   
	                    for (int l = 0; l < (N_Rows/2-1); l++) { 
	                        for (int m = 0; m < N_Columns; m++) {
	                        	if((l+m) % 2 != 0) {
	                            double p = (m * sqSize) + (getWidth() / 2 - getHeight() / 2); 
	                            double s = (l * sqSize);
	                            if((l+m) % 2 != 0) {
	                               GOval ov = new GOval(p, s, sqSize, sqSize); 
	                               ov.setFilled(true);
	                               ov.setFillColor(Color.RED); 
	                               add(ov); 
	                            }
	                        	}
	                        } 
	                    } 
	                  
	//the black checkers 
	                    
	                    for (int n = (int) (N_Rows/2+1) ; n < N_Rows; n++) { 
	                        for (int o = 0; o < N_Columns; o++) { 
	                        	if((n+o) % 2 != 0) {
	                            double t = (o * sqSize) + (getWidth() / 2 - getHeight()/ 2); 
	                            double a = (n * sqSize);
	                            if((n+o) % 2 != 0) {
	                            	GOval ovl = new GOval(t, a, sqSize, sqSize); 
	                            	ovl.setFilled(true);
	                            	ovl.setFillColor(Color.BLACK); 
	                            	add(ovl);
	                            }
	                        	} 
	                        }
	                    }
	              }
	        }
	  }
	  
	/*Private constants*/
	  private static final double N_Rows=8;
	  
	  
	/*Private constants*/
	        private static final double N_Columns=8;
	 
	 
	
	public static void main(String[] args) {
		new lab7_11().start();
	}
}