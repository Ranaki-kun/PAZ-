import acm.graphics.GOval;
import acm.program.GraphicsProgram;



public class lab7_13 extends GraphicsProgram{
    public void run(){
        GOval square = new GOval((getWidth() - SQUARE_SIZE)/2, (getHeight() - SQUARE_SIZE)/2, SQUARE_SIZE, SQUARE_SIZE);
        square.setFilled(true);  
        add(square);    
        double dx = 1;  
        double dy = 1;
        while(true)
        {      
            square.move(dx, dy);      
            pause(PAUSE_TIME);
            if(square.getY() >= getHeight() - SQUARE_SIZE)
            {
                dy = dy * (-1);
            }
            if(square.getX() >= getWidth() - SQUARE_SIZE)
            {
                dx = dx * (-1);
            }
            if(square.getY() <= 0 )
            {
                dy = dy * (-1);
            }
            if(square.getX() <= 0 )
            {
                dx = dx * (-1);
            }
                
        }
    }
 
    private static final int PAUSE_TIME = 10;  
    private static final double SQUARE_SIZE = 50;
    
    public static void main(String[] args) {
        new lab7_13().start();
    }
}