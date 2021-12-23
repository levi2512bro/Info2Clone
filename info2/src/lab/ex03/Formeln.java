package lab.ex03;

public class Formeln {

	
	public static int ggT (int a, int b) {
		if (b>a) {
			return ggT (b,a);
		} else if (b==0) {
			return a;
		} else {
		return ggT(b, a%b);	
		}
	}
	
	public static int ulam (int n) {
		if (n == 1) {
			return 1;
		} else if (n%2==0) {
			return ulam(n/2);
		} else if (n%2==1) {
			return ulam(3*n+1);
		} else return n;
	}
	
	public static int f91 (int n) {
		if (n>100) {
			return n-10;
		} else {
			return f91(f91(n+11));
		}
	}
	
}
