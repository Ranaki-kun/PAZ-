

import acm.program.*;

public class Sort3Num extends ConsoleProgram {
	public void run() {
		println("This is number decrease programm.");
		int a=readInt("Enter a: ");
		int b=readInt("Enter b: ");
		int c=readInt("Enter c: ");
			if (a<b){
				if (b<c){
				println(c);
				println(b);
				println(a);
				}
				else if (a<c){ 
				     println(b);
				     println(c);
				     println(a);
				     }else{
				     println(b);
				     println(a);
				     println(c);
				     }
			}else if (a<c) {
				println(c); 
				println(a);
				println(b);
				}else if(b<c){
					println(a);
					println(c);
					println(b);
					}else {
						println(a);
						println(b);
						println(c);
					}
	}
	
	public static void main(String[] arg) {
		new Sort3Num().start();
	}
	
}
