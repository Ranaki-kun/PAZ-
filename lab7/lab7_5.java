import acm.program.ConsoleProgram;

public class lab7_5 extends ConsoleProgram {
	private static final int SENTINEL = -1;
public void run() {
	println("This program find grades of average");      
	println("Enter values, one per line, using " + SENTINEL);      
	println("to signal the end of the list.");      
	double total = 0;  
	int number= 0;
	while (true) {         
		int value = readInt(" Enter the student grades: ");         
		if (value == SENTINEL) 
			break;         
		total += value;
		number = number + 1;
		}      
	println("The average is " + total/number + ".");   
	}  


	public static void main(String[] args) {
		new lab7_5().start();
	}
}