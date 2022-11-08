import acm.program.ConsoleProgram;

public class lab7_3 extends ConsoleProgram {
public void run() {
	println("This programm is n odd numbers sum");
	int n = readInt("Enter n: ");
	int s = 0;
	for(int i=1; i<2*n; i=i+2) {
		s = s + i ;
	}
	println(s);
}

	public static void main(String[] args) {
		new lab7_3().start();
	}
}
