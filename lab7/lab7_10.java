import acm.program.ConsoleProgram;
	public class lab7_10 extends ConsoleProgram{
		public void run()
		{
			println("this program finds the two largest integers in a list.");
			println("Enter values, one per line, using "+SENTINEL);
			println("to signal the end of the list.");
			int max=0;
			while(true)
			{
				int value=readInt("Enter data: ");
				if (value==SENTINEL)
					break;
				if(value>max)
					max=value;
				
				
			}
			println("The largest integer is "+max+".");
		}
		private static final int SENTINEL=0;
		public static void main(String[] args) {
			new lab7_10().start();
		}

	}