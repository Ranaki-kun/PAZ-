import acm.program.*;
public class lab7_6 extends ConsoleProgram {   
	public void run() {      
		println("This program reverse the number.");      
		int n = readInt("Enter a positive integer: ");      
		int a=0;
		  
		while (n > 0) {
			a = a*10 + n%10;
			n/=10;
		}
		println("The reverse of number is:  " + a);   
		}
	public static void main(String[] args) {
		new lab7_6().start();
	}
	}