import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class TicTacToe extends GraphicsProgram{
    private static int BOARD_SIZE = 400;
    public void run(){
        double h = getHeight();
        double w = getWidth();
        double x = (h - BOARD_SIZE)/2;
        double y = (w - BOARD_SIZE)/2;
        GLine line1 = new GLine(y + BOARD_SIZE/3 , x ,y + BOARD_SIZE/3 , x+BOARD_SIZE );   
        add(line1);
        GLine line2 = new GLine(y + BOARD_SIZE/3*2 , x , y + BOARD_SIZE/3*2,x+BOARD_SIZE);
        add(line2);
        GLine line3 = new GLine(y , x+BOARD_SIZE/3 , y +BOARD_SIZE , x+BOARD_SIZE/3);
        add(line3);
        GLine line4 = new GLine(y , x+BOARD_SIZE/3*2 , y +BOARD_SIZE , x+BOARD_SIZE/3*2);
        add(line4);
   }
	
	public static void main(String[] arg){
		new TicTacToe().start();
		
		
	}

}