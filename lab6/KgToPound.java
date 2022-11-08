import acm.program.ConsoleProgram;

public class KgToPound extends ConsoleProgram {
	public void run() {
		println("This programm converts killogram to pounds and ounces.");
		int k =readInt("Enter killogram: ");
		double p = (double) k*2.2;
		double o = (double) p*16;
		println( "pounds = " + p );
		println( "ounces = " + o );
	}

	public static void main(String[] args) {
		new KgToPound().start();
	}
}
