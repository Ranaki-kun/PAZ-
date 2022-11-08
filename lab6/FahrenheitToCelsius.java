import acm.program.ConsoleProgram;

public class FahrenheitToCelsius extends ConsoleProgram {
	public void run() {
		println("This programm converts Fahrenheit to celsius.");
		int f =readInt("Enter fahrenheit temperatur: ");
		double c = (double) 5/9*(f-32);
		println( "Celsius equivalent = " + c );

	}

	public static void main(String[] args) {
		new FahrenheitToCelsius().start();
	}
}

