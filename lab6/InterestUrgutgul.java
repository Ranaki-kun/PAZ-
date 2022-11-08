import acm.program.ConsoleProgram;

public class InterestUrgutgul extends ConsoleProgram{
	public void run() {
		println("Interst calculation programm");
		int s =readInt("Enter starting balance: ");
		double i = readDouble("Enter annual interest rate: ");
		double o = (double) s+((s*i)/100);
		println( "Balance after one year =" + o );
		double p = (double) o+((o*i)/100);
		println( "Balance after two year =" + p );
	}

	public static void main(String[] args) {
		new InterestUrgutgul().start();
	}
}



