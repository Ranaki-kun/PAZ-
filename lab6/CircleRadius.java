import acm.program.ConsoleProgram;

public class CircleRadius extends ConsoleProgram{
	public void run() {
		println("This is finding field of circle programm");
		int r =readInt("Enter circle radius: ");
		double a = (double) r*r*3.14;
		println( r + "^2" + "*pi" + "=" + a );

	}

	public static void main(String[] args) {
		new CircleRadius().start();
	}
}