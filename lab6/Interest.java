import acm.program.ConsoleProgram;

public class Interest extends ConsoleProgram{
	public void run() {
		println("Interst calculation programm");
		int s =readInt("Enter starting balance: ");
		double i = readDouble("Enter annual interest rate: ");
		double o = (double) s+((s*i)/100);
		println( "Balance after one year =" + o );
	}

	public static void main(String[] args) {
		new Interest().start();
	}
}

