import acm.program.ConsoleProgram;

public class lab7_2 extends ConsoleProgram{
	public void run() {
		for (int i=1; i<=10; i++) {
			String m = null;
			switch (i) { 
			case 1:	
				m = ("thumb");
				break;
			case 2: 
				m = ("shoe");
				break;
			case 3: 
				m = ("knee");
				break;
			case 4: 
				m = ("door");
				break;
			case 5: 
				m = ("hive");
				break;
			case 6: 
				m = ("sticks");
				break;
			case 7: 
				m = ("heaven");
				break;
			case 8: 
				m = ("pate");
				break;
			case 9: 
				m = ("spine");
				break;
			case 10: 
				m = ("shin");
				break;
			}
			println("This old man, he played  " + i);
			println(" He played knick-knack on my " + m); 
			println(" With a knick-knack, paddy-whack,");
			println(" Give your dog a bone.");
			println(" This old man came rolling home.");
			}
			}
		
		
	public static void main(String[] args) {
		new lab7_2().start();
	}
}