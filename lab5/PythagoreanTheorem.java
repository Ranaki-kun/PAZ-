import acm.program.*;

public class PythagoreanTheorem extends DialogProgram {
	public void run() {
	int a=readInt("Enter a: ");
	int b=readInt("Enter b: ");
	int n=a*a;
	int m=b*b;
	int t=n+m;
	double c=Math.sqrt(t);
	println(c);
	}
	public static void main(String[] arg) {
		new PythagoreanTheorem().start();
	}
}
