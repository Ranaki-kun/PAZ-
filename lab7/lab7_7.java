import acm.program.ConsoleProgram;
public class lab7_7 extends ConsoleProgram {   
	public void run() {  
		println("Digital root programm");
		int n = readInt("Enter n: ");
		int dsum;
		int count = 0;
		while (n>=10){
			dsum=0;
			count++;
			while(n>0)
			{
			dsum+=n%10;
			n/=10;
			}
			n=dsum;
		}
		println("The digital root "+n);
		println("The step "+count);
		}

	
	public static void main(String[] args) {
		new lab7_7().start();
	}
	}
