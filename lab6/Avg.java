import acm.program.ConsoleProgram;

public class Avg extends ConsoleProgram {
	public void run() {
		println("This programm find average of 4 numbers.");
		int a =readInt("Enter a: ");
		int b =readInt("Enter b: ");
		int c =readInt("Enter c: ");
		int d =readInt("Enter d: ");
		double avg = (double) (a+b+c+d)/4;
		println( "Average = " + avg );
	}

	public static void main(String[] args) {
		new Avg().start();
	}
}
