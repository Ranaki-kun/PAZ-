import acm.program.*;

public class lab7_8 extends ConsoleProgram {   
	public void run() {  
		int t = START;
		while (t >= 0) { 
			t--;
			println(t);      
			}      
		println("Liftoff!");   
		}
 
	private static final int START = 10;
	public static void main(String[] args) {
		new lab7_8().start();
	}
	}
