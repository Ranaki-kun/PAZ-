import acm.program.*;

public class lab7_1 extends ConsoleProgram{
	private static int N =99 ;
	public void run() {
		while(N>0) {
			println(N + "bottles of beer on the wall");
			println(N + "bottles of beer. You take one down, pass it around");
			N=N-1;		
		}
	
}
	public static void main(String[] args) {
		new lab7_1().start();
	}
}
