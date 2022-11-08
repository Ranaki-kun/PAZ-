import acm.program.ConsoleProgram;

public class BugdTegGarah extends ConsoleProgram{
	public void run() {
		println("Ilerhiilel");
		int o = (int)4+9-2*16+1/3*6-67+8*2-3+26-1/34+3/7+2-5 ;
		println( o );
		double j = (double)((((((4+9-2)*16+1)/3*6-67+8)*2-3+26-1)/34+3)/7+2-5) ;
		println( "Teg garah = " + j );
	}

	public static void main(String[] args) {
		new BugdTegGarah().start();
	}
}



