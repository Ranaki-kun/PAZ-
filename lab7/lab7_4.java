import acm.program.ConsoleProgram;

public class lab7_4 extends ConsoleProgram {
public void run() {
	for(int i=1; i<=100; i++) {
		if((i%6==0 || i%7==0) && i%42!=0 ) {
			println(i);
		}
	}
}
	public static void main(String[] args) {
		new lab7_4().start();
	}
}
