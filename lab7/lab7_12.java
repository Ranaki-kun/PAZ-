
import acm.program.ConsoleProgram;
public class lab7_12 extends ConsoleProgram{
	public void run()
	{
		println("this program finds the two largest integers in a list.");
		println("Enter values, one per line, using "+SENTINEL);
		println("to signal the end of the list.");
		int firstmax=0,secondmax=0;
		while(true)
		{
			int value=readInt("Enter data: ");
			if (value==SENTINEL)
				break;
			if(value>firstmax)
			{
				secondmax=firstmax;
				firstmax=value;
			}
			else if (value>secondmax && value<firstmax)
				secondmax=value;
			
		}
		println("The largest two integers are "+firstmax+","+secondmax+".");
	}
	private static final int SENTINEL=0;
	public static void main(String[] args) {
		new lab7_12().start();
	}

}
