import acm.program.ConsoleProgram;

public class InchesToCentimeters extends ConsoleProgram{
	public void run() {
		println("This program converts feet and inches to centimeters.");
		int f=readInt("Enter number of feet: ");
		int i=readInt("Enter number of inches: ");
		double c = (double) ((f*12+i)*2.54);
		println(f + "ft" + "" + i + "in" + "=" + c + "cm");
	}

	public static void main(String[] args) {
		new InchesToCentimeters().start();
	}
}

